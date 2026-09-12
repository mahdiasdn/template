package com.aseman.weather.utils

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

/**
 * Converts Gregorian date to Solar Hijri (Jalali) date
 * Simple implementation - in production, use a proper library like persian-date
 */
object PersianDateConverter {
    
    private val persianMonthNames = listOf(
        "فروردین", "اردیبهشت", "خرداد", "تیر", "مرداد", "شهریور",
        "مهر", "آبان", "آذر", "دی", "بهمن", "اسفند"
    )
    
    private val persianDayNames = listOf(
        "دوشنبه", "سه‌شنبه", "چهارشنبه", "پنج‌شنبه", "جمعه", "شنبه", "یکشنبه"
    )
    
    fun getSolarHijriDate(dateTime: Long = System.currentTimeMillis()): String {
        val localDateTime = LocalDateTime.ofEpochSecond(dateTime / 1000, 0, java.time.ZoneOffset.UTC)
        val localDate = localDateTime.toLocalDate()
        
        // Simplified conversion (not astronomically accurate)
        val jalaliDate = gregorianToJalali(localDate)
        
        val dayName = persianDayNames[localDate.dayOfWeek.value % 7]
        val monthName = persianMonthNames[jalaliDate.second - 1]
        val day = jalaliDate.third.toPersianNumber()
        val year = jalaliDate.first.toPersianNumber()
        
        return "$dayName، $day $monthName $year"
    }
    
    fun getShortSolarHijriDate(dateTime: Long = System.currentTimeMillis()): String {
        val localDateTime = LocalDateTime.ofEpochSecond(dateTime / 1000, 0, java.time.ZoneOffset.UTC)
        val localDate = localDateTime.toLocalDate()
        
        val jalaliDate = gregorianToJalali(localDate)
        
        val monthName = persianMonthNames[jalaliDate.second - 1]
        val day = jalaliDate.third.toPersianNumber()
        
        return "$day $monthName"
    }
    
    fun getCurrentTime(): String {
        val localDateTime = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("HH:mm")
        return localDateTime.format(formatter).toPersianNumber()
    }
    
    /**
     * Simple Gregorian to Jalali conversion
     * Returns Triple(year, month, day)
     */
    private fun gregorianToJalali(date: LocalDate): Triple<Int, Int, Int> {
        val gy = date.year
        val gm = date.monthValue
        val gd = date.dayOfMonth
        
        val jy = if (gy <= 1600) 0 else gy - 621
        val gyLeap = if (gy % 4 == 0 && (gy % 100 != 0 || gy % 400 == 0)) 1 else 0
        
        val daysBeforeJy = (jy / 4) - (jy / 100) + (jy / 400)
        val jLeap = if (jy % 4 == 0 && jy % 100 != 0) 1 else 0
        
        var march = 21 + ((gyLeap - jLeap + daysBeforeJy) % 7)
        if (march <= 0) march += 7
        
        val dayOfYear = date.dayOfYear
        var jd = dayOfYear - march
        
        if (jd >= 0) {
            if (jd <= 185) {
                val jm = (jd / 31) + 1
                val day = (jd % 31) + 1
                return Triple(jy, jm, day)
            } else {
                val remainingDays = jd - 186
                val jm = 7 + (remainingDays / 30) + 1
                val day = (remainingDays % 30) + 1
                return Triple(jy, jm, day)
            }
        } else {
            val prevYear = jy - 1
            val prevLeap = if (prevYear % 4 == 0 && prevYear % 100 != 0) 1 else 0
            val daysInPrevYear = 365 + prevLeap
            jd += daysInPrevYear
            
            if (jd <= 185) {
                val jm = (jd / 31) + 1
                val day = (jd % 31) + 1
                return Triple(prevYear, jm, day)
            } else {
                val remainingDays = jd - 186
                val jm = 7 + (remainingDays / 30) + 1
                val day = (remainingDays % 30) + 1
                return Triple(prevYear, jm, day)
            }
        }
    }
}
