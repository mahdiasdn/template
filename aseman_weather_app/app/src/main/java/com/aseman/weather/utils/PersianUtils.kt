package com.aseman.weather.utils

// تبدیل اعداد انگلیسی به فارسی
fun String.toPersianNumber(): String {
    val persianDigits = mapOf(
        '0' to '۰',
        '1' to '۱',
        '2' to '۲',
        '3' to '۳',
        '4' to '۴',
        '5' to '۵',
        '6' to '۶',
        '7' to '۷',
        '8' to '۸',
        '9' to '۹'
    )
    
    return this.map { char ->
        persianDigits.getOrDefault(char, char)
    }.joinToString("")
}

fun Int.toPersianNumber(): String {
    return this.toString().toPersianNumber()
}
