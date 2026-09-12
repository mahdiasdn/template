package com.aseman.weather.data

data class WeatherData(
    val temperature: Int,
    val condition: String,
    val icon: String,
    val city: String,
    val date: String,
    val smartTip: SmartTip,
    val stats: List<Stat>,
    val hourlyForecast: List<HourlyForecast>,
    val dailyForecast: List<DailyForecast>
)

data class SmartTip(
    val title: String,
    val description: String,
    val icon: String
)

data class Stat(
    val title: String,
    val value: String,
    val icon: String
)

data class HourlyForecast(
    val time: String,
    val temperature: Int,
    val icon: String
)

data class DailyForecast(
    val dayOfWeek: String,
    val maxTemp: Int,
    val minTemp: Int,
    val icon: String
)

// داده‌های نمونه برای نمایش
val mockWeatherData = WeatherData(
    temperature = 28,
    condition = "آفتابی",
    icon = "☀️",
    city = "تهران",
    date = "دوشنبه، ۱۵ اردیبهشت",
    smartTip = SmartTip(
        title = "نکته هوشمند",
        description = "امروز برای فعالیت‌های بیرون مناسب است. ضدآفتاب فراموش نشود!",
        icon = "💡"
    ),
    stats = listOf(
        Stat("فشار هوا", "۱۰۱۳ hPa", "📊"),
        Stat("دید افقی", "۱۰ کیلومتر", "👁️"),
        Stat("اشعه UV", "۶ (متوسط)", "☀️"),
        Stat("شانس بارش", "۱۰٪", "🌧️"),
        Stat("سرعت باد", "۱۲ km/h", "💨"),
        Stat("رطوبت", "۴۵٪", "💧")
    ),
    hourlyForecast = List(24) { index ->
        HourlyForecast(
            time = "${(index + 8) % 24}:00",
            temperature = 20 + (index % 10),
            icon = if (index in 6..18) "☀️" else "🌙"
        )
    },
    dailyForecast = List(14) { index ->
        val days = listOf("شنبه", "یکشنبه", "دوشنبه", "سه‌شنبه", "چهارشنبه", "پنجشنبه", "جمعه")
        DailyForecast(
            dayOfWeek = days[index % 7],
            maxTemp = 25 + (index % 8),
            minTemp = 15 + (index % 5),
            icon = if (index % 3 == 0) "☀️" else if (index % 3 == 1) "⛅" else "🌧️"
        )
    }
)
