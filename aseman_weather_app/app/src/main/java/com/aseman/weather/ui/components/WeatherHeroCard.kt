package com.aseman.weather.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aseman.weather.model.WeatherCondition
import com.aseman.weather.model.WeatherData
import com.aseman.weather.theme.AsemanWeatherTheme
import com.aseman.weather.theme.PrimaryDay
import com.aseman.weather.theme.SecondaryDay
import com.aseman.weather.theme.ShadowTint
import com.aseman.weather.theme.AsemanTypography
import com.aseman.weather.utils.toPersianNumber

@Composable
fun WeatherHeroCard(
    weatherData: WeatherData,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .shadow(
                elevation = 16.dp,
                shape = RoundedCornerShape(28.dp),
                ambientColor = ShadowTint,
                spotColor = ShadowTint
            )
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        PrimaryDay.copy(alpha = 0.95f),
                        PrimaryDay
                    )
                ),
                shape = RoundedCornerShape(28.dp)
            )
            .padding(24.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            // City name and date
            Text(
                text = weatherData.cityName,
                style = AsemanTypography.h3,
                color = Color.White
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            // Weather icon (placeholder for 3D glassy icon)
            WeatherIcon(
                condition = weatherData.condition,
                isDayTime = weatherData.isDayTime,
                size = 120.dp
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Temperature - Hero element
            Text(
                text = "${weatherData.temperature.toPersianNumber()}°",
                style = AsemanTypography.tempHeroMobile,
                color = Color.White
            )
            
            // Condition text
            Text(
                text = weatherData.condition.toPersianText(),
                style = AsemanTypography.bodyLg,
                color = Color.White.copy(alpha = 0.9f)
            )
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // Bottom metrics rail
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                MetricItem(
                    label = "باد",
                    value = "${weatherData.windSpeed.toPersianNumber()}",
                    unit = "km/h"
                )
                MetricItem(
                    label = "رطوبت",
                    value = "${weatherData.humidity.toPersianNumber()}",
                    unit = "%"
                )
                MetricItem(
                    label = "بارش",
                    value = "۰",
                    unit = "%"
                )
            }
        }
    }
}

@Composable
private fun MetricItem(
    label: String,
    value: String,
    unit: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "$value $unit",
            style = AsemanTypography.labelMd,
            color = Color.White.copy(alpha = 0.9f)
        )
        Text(
            text = label,
            style = AsemanTypography.labelSm,
            color = Color.White.copy(alpha = 0.7f)
        )
    }
}

@Composable
private fun WeatherIcon(
    condition: WeatherCondition,
    isDayTime: Boolean,
    size: androidx.compose.ui.unit.Dp
) {
    // Placeholder for 3D glassy weather icon
    // In production, this would render actual 3D glassy icons
    Box(
        modifier = Modifier
            .size(size)
            .background(
                Color.White.copy(alpha = 0.2f),
                shape = RoundedCornerShape(50)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = when (condition) {
                WeatherCondition.SUNNY -> "☀️"
                WeatherCondition.CLEAR -> "🌙"
                WeatherCondition.CLOUDY -> "☁️"
                WeatherCondition.PARTLY_CLOUDY -> "⛅"
                WeatherCondition.RAINY -> "🌧️"
                WeatherCondition.STORMY -> "⛈️"
                WeatherCondition.SNOWY -> "❄️"
                WeatherCondition.FOGGY -> "🌫️"
            },
            style = AsemanTypography.h1
        )
    }
}

private fun WeatherCondition.toPersianText(): String {
    return when (this) {
        WeatherCondition.SUNNY -> "آفتابی"
        WeatherCondition.CLEAR -> if (true) "صاف" else "شب صاف"
        WeatherCondition.CLOUDY -> "ابری"
        WeatherCondition.PARTLY_CLOUDY -> "نیمه‌ابری"
        WeatherCondition.RAINY -> "بارانی"
        WeatherCondition.STORMY -> "طوفانی"
        WeatherCondition.SNOWY -> "برفی"
        WeatherCondition.FOGGY -> "مه‌آلود"
    }
}

@Preview(showBackground = true)
@Composable
private fun WeatherHeroCardPreview() {
    AsemanWeatherTheme {
        WeatherHeroCard(
            weatherData = WeatherData(
                temperature = 32,
                feelsLike = 35,
                condition = WeatherCondition.SUNNY,
                humidity = 45,
                windSpeed = 12,
                uvIndex = 8,
                visibility = 10,
                pressure = 1013,
                dewPoint = 18,
                cityName = "تهران",
                dateTime = System.currentTimeMillis()
            )
        )
    }
}
