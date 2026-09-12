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
import com.example.asemanweather.data.SmartTip
import com.example.asemanweather.ui.theme.AsemanWeatherTheme

@Composable
fun SmartTipBanner(tip: SmartTip) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(20.dp),
                ambientColor = AsemanWeatherTheme.colors.accent.copy(alpha = 0.2f),
                spotColor = AsemanWeatherTheme.colors.accent.copy(alpha = 0.3f)
            )
            .background(
                color = AsemanWeatherTheme.colors.accent.copy(alpha = 0.15f),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(20.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // آیکون
            Text(
                text = tip.icon,
                fontSize = 32.sp
            )
            
            // متن نکته هوشمند
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = tip.title,
                    fontSize = 16.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = AsemanWeatherTheme.colors.accent
                )
                
                Text(
                    text = tip.description,
                    fontSize = 14.sp,
                    color = AsemanWeatherTheme.colors.textPrimary,
                    lineHeight = 20.sp
                )
            }
        }
    }
}
