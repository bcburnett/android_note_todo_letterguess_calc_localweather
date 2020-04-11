package com.newlondonweb.tabbedfragmentdemo.viewModels

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.widget.Button
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.newlondonweb.tabbedfragmentdemo.data.letters.Command
import com.newlondonweb.tabbedfragmentdemo.data.letters.Phrases
import org.json.JSONObject
import java.net.CookieHandler
import java.net.CookieManager


class WordGuessViewModel(application: Application) : AndroidViewModel(application) {

    private val connectivityManager =
        application.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager


    //////////////////WORD GUESS///////////////////////////////////
    ////////////////Observables///////////////////////////////////////
    //The number of wrong guesses.
    internal val disabledButtons: LiveData<ArrayList<Button>>
        get() = disabled
    private val disabled: MutableLiveData<ArrayList<Button>> = MutableLiveData(arrayListOf())

    internal val currentWrongGuesses: LiveData<Int>
        get() = wrongGuesses
    private val wrongGuesses = MutableLiveData(0)

    internal val currentCategory: LiveData<String>
        get() = category
    private val category = MutableLiveData("")

    //The state of the game INPLAY, WON, LOST from the command enum
    internal val currentGameState: LiveData<Command>
        get() = gameState
    private val gameState = MutableLiveData(Command.INPLAY)

    //The Current Phrase String to display
    internal val currentPhrase: LiveData<String>
        get() = phrase
    private val phrase = MutableLiveData("")

    //The Used Letter Board
    internal val usedLetters: LiveData<String>
        get() = mUsedLetters
    private val mUsedLetters = MutableLiveData("")

    ////////////Private Variables////////////////////////
    //the phrase array of Letter classes
    private val phraseArray: ArrayList<Letter> = arrayListOf()

    //the raw phrase from the repository
    private var secretPhrase: String = ""

    //////////////////PUBLIC FUNCTIONS//////////////////
    //The user has entered a letter guess
    fun doCheck(myguess: Button): Boolean {
        var b = false
        disabled.value?.add(myguess)
        val guess = myguess.tag.toString()
        //update used letters
        mUsedLetters.value = mUsedLetters.value + "$guess "

        //check for correct guess
        phraseArray.forEach {
            when (guess) {
                it.letter -> it.correct = true
            }
        }

        //check if we won
        when {
            phraseArray.all { it.correct } -> congratulationsYouWon()
        }

        //check for wrong guess
        when {
            !secretPhrase.contains(guess) -> wrongGuesses.value = wrongGuesses.value!! + 1
            else -> b = true
        }

        //check if we lost
        when {
            wrongGuesses.value!! > 6 -> sorryYouLost()
        }

        //generate the displayed phrase
        generatePhraseString()

        return b
    }

    //re/initialize the game
    fun wordGuessInit() {
        gameState.value = Command.INPLAY
        wrongGuesses.value = 0
        mUsedLetters.value = ""
        disabled.value?.clear()
        getPhrase()

    }

    /////////////Private Functions//////////////////////////
    init {
        CookieManager.setDefault(CookieHandler.getDefault())
        wordGuessInit()
    }

    //populate phraseArray and secretPhrase with a new phrase
    private fun getPhrase() {
        getPhraseFromClass()
    }

    private fun setPhrase(jo: JSONObject) {
        phraseArray.clear()
        Gson().fromJson(jo.toString(), Phrase::class.java).also {
            if (it.phrase == null) {
                getPhraseFromClass()
                return
            }
            secretPhrase = it.phrase!!
            secretPhrase.forEach { phraseArray.add(Letter(it.toString())) }
            category.value = "The Category Is: ${it.category}"
            generatePhraseString()
        }
    }

    private fun getPhraseFromClass() {
        phraseArray.clear()
        secretPhrase = Phrases().getRandomPhrase()
        secretPhrase.forEach { phraseArray.add(Letter(it.toString())) }
        category.value = "The Category Is: Phrases"
        generatePhraseString()
    }

    //generate a string from the phrase array
    private fun generatePhraseString() {
        phrase.value = phraseArray
            .map(Letter::singleSpacedLetter)
            .reduce { acc, letter -> acc + letter }
    }

    //you won the game
    private fun congratulationsYouWon() {
        mUsedLetters.value = "Congratulations You Won!!"
        wrongGuesses.value = 0
        gameState.value = Command.WON
    }

    //you lost the game
    private fun sorryYouLost() {
        generatePhraseString()
        mUsedLetters.value = "Sorry :( You Lost."
        phraseArray.forEach { it.correct = true }
        gameState.value = Command.LOST
    }

    inner class Letter(val letter: String) {
        var correct = false

        init {
            if (letter.matches("[ .'?!,&-]".toRegex())) correct = true
        }

        fun singleSpacedLetter(): String = when {
            correct -> letter; else -> "_"
        }
    }

    inner class Phrase(var phrase: String? = null, var category: String? = null)

}

