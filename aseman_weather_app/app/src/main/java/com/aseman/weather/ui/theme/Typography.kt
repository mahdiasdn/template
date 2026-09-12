package com.aseman.weather.ui.theme

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

// Typography based on Peyda font family
// Note: In production, you would add the actual Peyda font files to assets/fonts/
// and reference them here. For now, we use a fallback.

val PeydaFontFamily = FontFamily.Default

// Font weights matching design system
val FontWeightLight = FontWeight(300)
val FontWeightRegular = FontWeight(400)
val FontWeightMedium = FontWeight(500)
val FontWeightSemiBold = FontWeight(600)
val FontWeightBold = FontWeight(700)

// Typography scale from design system
object AsemanTypography {
    // Hero temperature - largest element
    val tempHero = androidx.compose.ui.text.TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = androidx.compose.ui.unit.sp(64),
        fontWeight = FontWeightBold,
        lineHeight = androidx.compose.ui.unit.sp(64)
    )
    
    val tempHeroMobile = androidx.compose.ui.text.TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = androidx.compose.ui.unit.sp(56),
        fontWeight = FontWeightBold,
        lineHeight = androidx.compose.ui.unit.sp(56)
    )
    
    // Headlines
    val h1 = androidx.compose.ui.text.TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = androidx.compose.ui.unit.sp(32),
        fontWeight = FontWeightBold,
        lineHeight = androidx.compose.ui.unit.sp(38)
    )
    
    val h2 = androidx.compose.ui.text.TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = androidx.compose.ui.unit.sp(24),
        fontWeight = FontWeightSemiBold,
        lineHeight = androidx.compose.ui.unit.sp(31)
    )
    
    val h3 = androidx.compose.ui.text.TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = androidx.compose.ui.unit.sp(20),
        fontWeight = FontWeightSemiBold,
        lineHeight = androidx.compose.ui.unit.sp(27)
    )
    
    // Body text
    val bodyLg = androidx.compose.ui.text.TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = androidx.compose.ui.unit.sp(18),
        fontWeight = FontWeightRegular,
        lineHeight = androidx.compose.ui.unit.sp(29)
    )
    
    val bodyMd = androidx.compose.ui.text.TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = androidx.compose.ui.unit.sp(16),
        fontWeight = FontWeightRegular,
        lineHeight = androidx.compose.ui.unit.sp(24)
    )
    
    val bodySm = androidx.compose.ui.text.TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = androidx.compose.ui.unit.sp(14),
        fontWeight = FontWeightRegular,
        lineHeight = androidx.compose.ui.unit.sp(21)
    )
    
    // Labels
    val labelMd = androidx.compose.ui.text.TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = androidx.compose.ui.unit.sp(13),
        fontWeight = FontWeightMedium,
        lineHeight = androidx.compose.ui.unit.sp(17)
    )
    
    val labelSm = androidx.compose.ui.text.TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = androidx.compose.ui.unit.sp(11),
        fontWeight = FontWeightMedium,
        lineHeight = androidx.compose.ui.unit.sp(13)
    )
    
    // Stat values
    val statValue = androidx.compose.ui.text.TextStyle(
        fontFamily = PeydaFontFamily,
        fontSize = androidx.compose.ui.unit.sp(22),
        fontWeight = FontWeightSemiBold,
        lineHeight = androidx.compose.ui.unit.sp(24)
    )
}
