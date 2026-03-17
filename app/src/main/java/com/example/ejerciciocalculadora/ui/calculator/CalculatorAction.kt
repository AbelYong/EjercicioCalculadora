package com.example.ejerciciocalculadora.ui.calculator

interface CalculatorAction {
    data class Digit(val value: String) : com.example.ejerciciocalculadora.ui.calculator.CalculatorAction
    data object Decimal : com.example.ejerciciocalculadora.ui.calculator.CalculatorAction
    data class Operator(val value: String) :
        com.example.ejerciciocalculadora.ui.calculator.CalculatorAction
    data object Equals : com.example.ejerciciocalculadora.ui.calculator.CalculatorAction
    data object Clear : com.example.ejerciciocalculadora.ui.calculator.CalculatorAction
    data object Percent : com.example.ejerciciocalculadora.ui.calculator.CalculatorAction
    data object ToggleSign : com.example.ejerciciocalculadora.ui.calculator.CalculatorAction
}