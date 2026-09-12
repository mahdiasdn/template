package com.aseman.weather.utils

/**
 * Converts English digits to Persian digits
 */
fun String.toPersianNumber(): String {
    val persianDigits = arrayOf("۰", "۱", "۲", "۳", "۴", "۵", "۶", "۷", "۸", "۹")
    return this.replace("\\d".toRegex()) { matchResult ->
        persianDigits[matchResult.value.toInt()]
    }
}

/**
 * Converts Int to Persian number string
 */
fun Int.toPersianNumber(): String {
    return this.toString().toPersianNumber()
}

/**
 * Converts Long to Persian number string
 */
fun Long.toPersianNumber(): String {
    return this.toString().toPersianNumber()
}

/**
 * Converts Double to Persian number string with optional decimal places
 */
fun Double.toPersianNumber(decimalPlaces: Int = 0): String {
    return String.format("%.${decimalPlaces}f", this).toPersianNumber()
}
