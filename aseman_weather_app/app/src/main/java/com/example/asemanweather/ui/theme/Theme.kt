package com.example.asemanweather.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class AsemanColorScheme(
    val primary: Color,
    val background: Color,
    val accent: Color,
    val textPrimary: Color,
    val textSecondary: Color
)

val DayColorScheme = AsemanColorScheme(
    primary = DayBlue,
    background = DayCream,
    accent = DayOrange,
    textPrimary = TextPrimary,
    textSecondary = TextSecondary
)

val NightColorScheme = AsemanColorScheme(
    primary = NightPurple,
    background = NightBlack,
    accent = DayOrange,
    textPrimary = Color.White,
    textSecondary = TextSecondary
)

private val LightColors = lightColorScheme(
    primary = DayBlue,
    onPrimary = Color.White,
    background = DayCream,
    onBackground = TextPrimary,
    surface = Color.White,
    onSurface = TextPrimary
)

private val DarkColors = darkColorScheme(
    primary = NightPurple,
    onPrimary = Color.White,
    background = NightBlack,
    onBackground = Color.White,
    surface = NightDarkBlue,
    onSurface = Color.White
)

object AsemanWeatherTheme {
    val colors: AsemanColorScheme
        @Composable
        get() = if (isSystemInDarkTheme()) NightColorScheme else DayColorScheme
}

@Composable
fun AsemanWeatherTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors
    
    MaterialTheme(
        colorScheme = colors,
        typography = androidx.compose.material3.Typography(),
        content = content
    )
}
