package com.example.asemanweather.ui.theme

import androidx.compose.ui.graphics.Color

// رنگ‌های حالت روز (طبق Design System آسمان)
val DayBlue = Color(0xFF3389FF)      // آبی اصلی
val DayCream = Color(0xFFFFFCF6)     // کرم پس‌زمینه
val DayOrange = Color(0xFFFF753E)    // نارنجی برای نکات هوشمند

// رنگ‌های حالت شب
val NightPurple = Color(0xFF8A5CF6)  // بنفش اصلی شب
val NightBlack = Color(0xFF121620)   // مشکی پس‌زمینه شب
val NightDarkBlue = Color(0xFF1A1F2E) // آبی تیره برای کارت‌ها

// رنگ‌های متنی
val TextPrimary = Color(0xFF121620)
val TextSecondary = Color(0xFF6B7280)
val TextOnPrimary = Color(0xFFFFFFFF)

object AsemanColors {
    // Day theme colors
    val primary = DayBlue
    val background = DayCream
    val accent = DayOrange
    val textPrimary = TextPrimary
    val textSecondary = TextSecondary
    
    // Night theme colors
    val nightPrimary = NightPurple
    val nightBackground = NightBlack
    val nightSurface = NightDarkBlue
}
