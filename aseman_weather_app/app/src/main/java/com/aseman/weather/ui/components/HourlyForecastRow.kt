package com.aseman.weather.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.aseman.weather.data.HourlyForecast
import com.aseman.weather.ui.theme.AsemanWeatherTheme
import com.aseman.weather.utils.toPersianNumber

@Composable
fun HourlyForecastRow(hourlyForecast: List<HourlyForecast>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "پیش‌بینی ۲۴ ساعته",
            fontSize = 18.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            color = AsemanWeatherTheme.colors.textPrimary
        )
        
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(end = 20.dp)
        ) {
            items(hourlyForecast.size) { index ->
                val forecast = hourlyForecast[index]
                HourlyForecastItem(forecast = forecast)
            }
        }
    }
}

@Composable
fun HourlyForecastItem(forecast: HourlyForecast) {
    Box(
        modifier = Modifier
            .width(80.dp)
            .height(120.dp)
            .shadow(
                elevation = 6.dp,
                shape = RoundedCornerShape(16.dp),
                ambientColor = Color.Blue.copy(alpha = 0.1f),
                spotColor = Color.Blue.copy(alpha = 0.15f)
            )
            .background(
                color = Color.White,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(12.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // ساعت
            Text(
                text = forecast.time,
                fontSize = 14.sp,
                color = AsemanWeatherTheme.colors.textSecondary
            )
            
            // آیکون وضعیت
            Text(
                text = forecast.icon,
                fontSize = 32.sp
            )
            
            // دما
            Text(
                text = "${forecast.temperature.toPersianNumber()}°",
                fontSize = 18.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                color = AsemanWeatherTheme.colors.textPrimary
            )
        }
    }
}
