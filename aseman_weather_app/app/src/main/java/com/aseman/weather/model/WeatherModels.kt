package com.aseman.weather.model

data class WeatherData(
    val temperature: Int,
    val feelsLike: Int,
    val condition: WeatherCondition,
    val humidity: Int,
    val windSpeed: Int,
    val uvIndex: Int,
    val visibility: Int,
    val pressure: Int,
    val dewPoint: Int,
    val cityName: String,
    val dateTime: Long,
    val isDayTime: Boolean = true
)

enum class WeatherCondition {
    SUNNY,
    CLOUDY,
    PARTLY_CLOUDY,
    RAINY,
    STORMY,
    SNOWY,
    FOGGY,
    CLEAR
}

data class HourlyForecast(
    val hour: String,
    val temperature: Int,
    val condition: WeatherCondition,
    val precipitationChance: Int
)

data class DailyForecast(
    val dayName: String,
    val date: String,
    val tempMax: Int,
    val tempMin: Int,
    val condition: WeatherCondition,
    val precipitationChance: Int
)

data class SmartTip(
    val title: String,
    val message: String,
    val iconResId: Int
)
