package com.aseman.weather.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.aseman.weather.data.DailyForecast
import com.aseman.weather.ui.theme.AsemanWeatherTheme
import com.aseman.weather.utils.toPersianNumber

@Composable
fun DailyForecastList(dailyForecast: List<DailyForecast>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "پیش‌بینی ۱۴ روزه",
            fontSize = 18.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            color = AsemanWeatherTheme.colors.textPrimary
        )
        
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(dailyForecast.size) { index ->
                val forecast = dailyForecast[index]
                DailyForecastItem(forecast = forecast)
            }
        }
    }
}

@Composable
fun DailyForecastItem(forecast: DailyForecast) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
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
            .padding(horizontal = 16.dp, vertical = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // روز هفته
            Text(
                text = forecast.dayOfWeek,
                fontSize = 16.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Medium,
                color = AsemanWeatherTheme.colors.textPrimary,
                modifier = Modifier.weight(1f)
            )
            
            // آیکون وضعیت
            Text(
                text = forecast.icon,
                fontSize = 28.sp,
                modifier = Modifier.weight(1f),
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
            
            // دما (حداقل و حداکثر)
            Text(
                text = "${forecast.maxTemp.toPersianNumber()}° / ${forecast.minTemp.toPersianNumber()}°",
                fontSize = 16.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                color = AsemanWeatherTheme.colors.textPrimary,
                modifier = Modifier.weight(1f),
                textAlign = androidx.compose.ui.text.style.TextAlign.End
            )
        }
    }
}
