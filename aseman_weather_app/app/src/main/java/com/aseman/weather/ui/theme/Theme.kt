package com.aseman.weather.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryNight,
    secondary = SecondaryNight,
    tertiary = TertiaryNight,
    background = NeutralNight,
    surface = SurfaceNight,
    onPrimary = OnSurfaceNight,
    onSecondary = OnSurfaceNight,
    onTertiary = OnSurfaceNight,
    onBackground = OnSurfaceNight,
    onSurface = OnSurfaceNight,
    error = ErrorNight,
    onError = OnSurfaceNight,
    surfaceContainerLowest = SurfaceNight,
    surfaceContainerLow = SurfaceNight.copy(alpha = 0.95f),
    surfaceContainer = SurfaceNight.copy(alpha = 0.9f),
    surfaceContainerHigh = SurfaceNight.copy(alpha = 0.85f),
    surfaceContainerHighest = SurfaceNight.copy(alpha = 0.8f)
)

private val LightColorScheme = lightColorScheme(
    primary = PrimaryDay,
    secondary = SecondaryDay,
    tertiary = TertiaryDay,
    background = NeutralDay,
    surface = SurfaceContainerLowest,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = OnSurfaceDay,
    onSurface = OnSurfaceDay,
    error = ErrorDay,
    onError = Color.White,
    surfaceContainerLowest = SurfaceContainerLowest,
    surfaceContainerLow = SurfaceContainerLow,
    surfaceContainer = SurfaceContainer,
    surfaceContainerHigh = SurfaceContainerHigh,
    surfaceContainerHighest = SurfaceContainerHighest
)

@Composable
fun AsemanWeatherTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            window.navigationBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
            WindowCompat.getInsetsController(window, view).isAppearanceLightNavigationBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
