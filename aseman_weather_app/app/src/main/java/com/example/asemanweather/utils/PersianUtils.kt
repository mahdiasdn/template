package com.example.asemanweather.utils

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

// دریافت تاریخ شمسی (ساده‌شده برای نمونه)
fun getPersianDate(): String {
    // در نسخه واقعی باید از کتابخانه‌ای مثل persian-date استفاده شود
    val days = listOf("شنبه", "یکشنبه", "دوشنبه", "سه‌شنبه", "چهارشنبه", "پنجشنبه", "جمعه")
    val months = listOf(
        "فروردین", "اردیبهشت", "خرداد", "تیر", "مرداد", "شهریور",
        "مهر", "آبان", "آذر", "دی", "بهمن", "اسفند"
    )
    
    // این فقط برای نمایش است - در نسخه واقعی باید محاسبه دقیق انجام شود
    val dayIndex = java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_WEEK) - 1
    val monthIndex = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH)
    val dayOfMonth = java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_MONTH)
    
    val dayName = days.getOrElse(dayIndex) { "شنبه" }
    val monthName = months.getOrElse((monthIndex - 3 + 12) % 12) { "فروردین" }
    
    return "$dayName، ${dayOfMonth.toPersianNumber()} $monthName"
}
