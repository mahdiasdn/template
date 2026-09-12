package com.example.asemanweather.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// فونت‌ها طبق Design System آسمان
// در نسخه واقعی باید فونت Peyda را از پوشه assets بارگذاری کنید
// val PeydaFontFamily = FontFamily(
//     Font(R.font.peyda_regular),
//     Font(R.font.peyda_bold, FontWeight.Bold),
//     Font(R.font.peyda_medium, FontWeight.Medium)
// )

val PeydaFontFamily = FontFamily.Default // فعلاً از فونت پیش‌فرض استفاده می‌شود

object AsemanTypography {
    val tempHero = TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold
    )
    
    val h2 = TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    )
    
    val h3 = TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = 22.sp,
        fontWeight = FontWeight.Medium
    )
    
    val bodyLarge = TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    )
    
    val bodyMedium = TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    )
    
    val caption = TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal
    )
    
    val small = TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = 11.sp,
        fontWeight = FontWeight.Normal
    )
}
