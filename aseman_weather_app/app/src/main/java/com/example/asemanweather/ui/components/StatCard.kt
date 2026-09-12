package com.example.asemanweather.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.asemanweather.data.Stat
import com.example.asemanweather.ui.theme.AsemanWeatherTheme
import com.example.asemanweather.utils.toPersianNumber

@Composable
fun StatCard(
    stat: Stat,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .height(100.dp)
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(16.dp),
                ambientColor = Color.Blue.copy(alpha = 0.1f),
                spotColor = Color.Blue.copy(alpha = 0.2f)
            )
            .background(
                color = Color.White,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // آیکون
            Text(
                text = stat.icon,
                fontSize = 28.sp
            )
            
            // مقدار
            Text(
                text = stat.value.toPersianNumber(),
                fontSize = 20.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                color = AsemanWeatherTheme.colors.textPrimary
            )
            
            // عنوان
            Text(
                text = stat.title,
                fontSize = 12.sp,
                color = AsemanWeatherTheme.colors.textSecondary
            )
        }
    }
}
