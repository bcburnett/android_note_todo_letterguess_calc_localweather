package com.newlondonweb.tabbedfragmentdemo.ui.main.fragments

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.newlondonweb.tabbedfragmentdemo.R.drawable.*
import com.newlondonweb.tabbedfragmentdemo.R.layout.fragment_frag2
import com.newlondonweb.tabbedfragmentdemo.data.letters.Command.*
import com.newlondonweb.tabbedfragmentdemo.viewModels.WordGuessViewModel
import kotlinx.android.synthetic.main.fragment_frag2.*
import java.util.*


class WordGuessFragment : Fragment() {

    companion object {
        fun newInstance() = WordGuessFragment()
    }

    private var myPhrase = ""
    private lateinit var mtts: TextToSpeech

    private val vm: WordGuessViewModel by lazy {
        this.activity.let {
            ViewModelProvider(it!!).get(
                WordGuessViewModel::class.java
            )
        }
    }

    private var keyboardActive = false
    private val image = arrayOf(s0, s1, s2, s3, s4, s5, s6, s6)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(fragment_frag2, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //Display the game image
        vm.currentWrongGuesses.observe(this, Observer { iv_Image.setImageResource(image[it]) })

        //display the phrase
        vm.currentPhrase.observe(this, Observer {
            tv_Phrase.text = it
            val myit = it
            if(myit.contains("_"))return@Observer
            mtts.speak(
                myit, TextToSpeech.QUEUE_ADD, null, null
            )
        })

        mtts = TextToSpeech(context, TextToSpeech.OnInitListener {
            if (it != TextToSpeech.ERROR) {
                mtts.language = Locale.US
            }
        })

        //display the category
        vm.currentCategory.observe(this, Observer {
            tv_Category.text = it
            mtts.speak(
                it, TextToSpeech.QUEUE_FLUSH, null, null
            )
        })

//display the letters the player has guessed
        vm.usedLetters.observe(this, Observer { tv_Used.text = it })

//enable or disable player letter input
        vm.currentGameState.observe(this, Observer {
            when (it!!) {
                INPLAY -> keyboardActive = true
                WON -> {
                    keyboardActive = false

                    mtts.speak(
                        "Congratulations, You Won!", TextToSpeech.QUEUE_ADD, null, null
                    )


                }
                LOST -> {
                    keyboardActive = false
                    mtts.speak(
                        "Sorry, You Lost.", TextToSpeech.QUEUE_ADD, null, null
                    )
                }
            }
        })

        keyboard.children.forEach { it.setOnClickListener(this@WordGuessFragment::keyboardInput) }

        btn_Reset.setOnClickListener {
            keyboard.children.forEach { it.isEnabled = true }
            vm.wordGuessInit()
        }

        vm.disabledButtons.observe(this, Observer {
            it.forEach { button ->
                keyboard.children.forEach { childButton ->
                    when {
                        childButton.tag == button.tag -> childButton.isEnabled = false
                    }
                }
            }
        })
    }

    //interpret letter buttons press and send to main game function
    private fun keyboardInput(view: View) {
        when {
            keyboardActive -> {
                mtts.speak(
                    view.tag.toString(), TextToSpeech.QUEUE_ADD, null, null
                )
                vm.doCheck((view as Button).apply { isEnabled = false })
            }
        }
    }
}
