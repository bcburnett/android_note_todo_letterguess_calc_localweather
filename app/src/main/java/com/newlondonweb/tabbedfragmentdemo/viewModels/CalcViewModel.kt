package com.newlondonweb.tabbedfragmentdemo.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class CalcViewModel (application: Application) : AndroidViewModel(application) {
    //////////////////////CALCULATOR//////////////////////////
    ////////////////Observables///////////////////////////////////////
    //The display.
    internal val display: LiveData<String>
        get() = calculatorDisplay
    private val calculatorDisplay = MutableLiveData("")

    //The number of wrong guesses.
    internal val tallyRegister: LiveData<String>
        get() = tally
    private val tally = MutableLiveData("\nTally Register\n")

    //////////////////PRIVATE VARIABLES///////////////////////
    private var firstNum: Double = 0.0
    private var secondNum: Double = 0.0
    private var oper: String = "+"

    fun ac() {
        calculatorDisplay.value = ""
        firstNum = 0.0
        secondNum = 0.0
        oper = "+"
        doTally("c")
    }

    fun eq() {
        secondNum = when (calculatorDisplay.value.toString()) {
            "" -> 0.0
            else -> calculatorDisplay.value.toString().toDouble()
        }
        doTally("a", calculatorDisplay.value + tally.value)
        when (oper) {
            "+" -> calculatorDisplay.value = (firstNum + secondNum).toString()
            "-" -> calculatorDisplay.value = (firstNum - secondNum).toString()
            "*" -> calculatorDisplay.value = (firstNum * secondNum).toString()
            "/" -> calculatorDisplay.value = (firstNum / secondNum).toString()
        }
        firstNum = secondNum
        secondNum = 0.0
        doTally("a", " =" + tally.value)
        doTally("a", calculatorDisplay.value + tally.value)
    }

    fun numClick(s: String) {
        calculatorDisplay.value = calculatorDisplay.value + s
    }

    fun funClick(s: String) {
        oper = s
        firstNum = when (calculatorDisplay.value.toString()) {
            "" -> 0.0
            else -> calculatorDisplay.value.toString().toDouble()
        }
        doTally("a", calculatorDisplay.value + s+tally.value)
        calculatorDisplay.value = ""
    }

    fun percent() {
        calculatorDisplay.value = (calculatorDisplay.value.toString().toDouble() / 100).toString()
        doTally("a", "% " + calculatorDisplay.value + tally.value)
    }

    fun flip() {
        calculatorDisplay.value = (-calculatorDisplay.value.toString().toDouble()).toString()
        doTally("a", "+/- " + calculatorDisplay.value + tally.value)
    }

    fun sqrt() {
        calculatorDisplay.value = (kotlin.math.sqrt(calculatorDisplay.value.toString().toDouble())).toString()
        doTally("a", "sqrt " + calculatorDisplay.value + tally.value)
    }

    fun doTally(command: String, message: String = "") {
        when (command) {
            "c" -> tally.value = ""
            "a" -> tally.value = "\n$message\n"
        }
    }

}