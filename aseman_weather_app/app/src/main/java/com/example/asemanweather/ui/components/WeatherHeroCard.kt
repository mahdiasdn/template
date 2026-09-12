package com.example.asemanweather.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.asemanweather.data.WeatherData
import com.example.asemanweather.ui.theme.AsemanWeatherTheme
import com.example.asemanweather.utils.toPersianNumber

@Composable
fun WeatherHeroCard(weather: WeatherData) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(280.dp)
            .shadow(
                elevation = 16.dp,
                shape = RoundedCornerShape(28.dp),
                ambientColor = Color.Blue.copy(alpha = 0.2f),
                spotColor = Color.Blue.copy(alpha = 0.3f)
            )
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        AsemanWeatherTheme.colors.primary,
                        AsemanWeatherTheme.colors.primary.copy(alpha = 0.8f)
                    )
                ),
                shape = RoundedCornerShape(28.dp)
            )
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // شهر و تاریخ
            Text(
                text = weather.city,
                fontSize = 20.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Medium,
                color = Color.White
            )
            
            Text(
                text = weather.date,
                fontSize = 14.sp,
                color = Color.White.copy(alpha = 0.9f)
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            // آیکون وضعیت هوا (شیشه‌ای سه‌بعدی)
            Text(
                text = weather.icon,
                fontSize = 80.sp
            )
            
            // دما بزرگ
            Text(
                text = "${weather.temperature.toPersianNumber()}°",
                fontSize = 64.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                color = Color.White
            )
            
            // وضعیت
            Text(
                text = weather.condition,
                fontSize = 18.sp,
                color = Color.White.copy(alpha = 0.95f)
            )
        }
    }
}
