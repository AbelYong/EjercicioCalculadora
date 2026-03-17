package com.example.ejerciciocalculadora

import java.math.BigDecimal
import kotlin.math.roundToLong

class Calculator {
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun substract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        require(b != 0.0) { "No se puede dividir entre cero" }
        return a / b
    }

    fun percent(a: Double): Double {
        return a / 100.0
    }

    fun changeSign(a: Double): Double {
        return -a
    }

    fun removeLast(a: Double) : Double {
        if (a.isNaN() || a.isInfinite()) {
            return a
        }

        val stringNumber = BigDecimal.valueOf(a).stripTrailingZeros().toPlainString()

        val isNegative = stringNumber.startsWith("-")
        val realLength = if (isNegative) stringNumber.length - 1 else stringNumber.length

        if (!stringNumber.contains(".") && realLength == 1) {
            return 0.0
        }

        var result = stringNumber.dropLast(1)

        if (result.endsWith(".")) {
            result = result.dropLast(1)
        }

        if (result.isEmpty() || result == "-") {
            return 0.0
        }

        return result.toDouble()
    }

    fun formatResult(valor: Double): String {
        return if (valor == valor.roundToLong().toDouble()) {
            valor.roundToLong().toString()
        } else {
            valor.toString()
        }
    }
}