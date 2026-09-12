package com.aseman.weather.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aseman.weather.data.mockWeatherData
import com.aseman.weather.ui.components.*
import com.aseman.weather.ui.theme.AsemanWeatherTheme

@Composable
fun HomeScreen() {
    val weather = mockWeatherData
    
    Scaffold(
        bottomBar = { FloatingNavBar() },
        containerColor = AsemanWeatherTheme.colors.background
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(AsemanWeatherTheme.colors.background)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            
            // کارت اصلی هوا (Hero)
            WeatherHeroCard(weather = weather)
            
            // بنر نکته هوشمند
            SmartTipBanner(tip = weather.smartTip)
            
            // گرید شاخص‌ها (۷ مورد)
            StatGrid(stats = weather.stats)
            
            // پیش‌بینی ساعتی (اسکرول افقی)
            HourlyForecastRow(hourlyForecast = weather.hourlyForecast)
            
            // پیش‌بینی روزانه (۱۴ روز)
            DailyForecastList(dailyForecast = weather.dailyForecast)
            
            Spacer(modifier = Modifier.height(80.dp)) // فضای خالی برای ناوبری شناور
        }
    }
}

@Composable
fun StatGrid(stats: List<com.aseman.weather.data.Stat>) {
    // گرید با چیدمان خاص طبق راهنما
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // ردیف اول: فشار، دید، اشعه UV
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            StatCard(stat = stats[0], modifier = Modifier.weight(1f)) // فشار
            StatCard(stat = stats[1], modifier = Modifier.weight(1f)) // دید
            StatCard(stat = stats[2], modifier = Modifier.weight(1f)) // اشعه UV
        }
        
        // ردیف دوم: شانس بارش (عرض کامل)
        StatCard(stat = stats[3], modifier = Modifier.fillMaxWidth())
        
        // ردیف سوم: سرعت باد، رطوبت
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            StatCard(stat = stats[4], modifier = Modifier.weight(1f)) // سرعت باد
            StatCard(stat = stats[5], modifier = Modifier.weight(1f)) // رطوبت
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    AsemanWeatherTheme(darkTheme = false) {
        HomeScreen()
    }
}
