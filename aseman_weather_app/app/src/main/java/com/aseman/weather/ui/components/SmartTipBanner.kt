package com.aseman.weather.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aseman.weather.model.SmartTip
import com.aseman.weather.theme.AsemanWeatherTheme
import com.aseman.weather.theme.TertiaryDay
import com.aseman.weather.theme.AsemanTypography

@Composable
fun SmartTipBanner(
    smartTip: SmartTip,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(TertiaryDay.copy(alpha = 0.12f))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Right border accent
            Box(
                modifier = Modifier
                    .width(3.dp)
                    .fillMaxHeight()
                    .background(TertiaryDay)
            )
            
            Spacer(modifier = Modifier.width(12.dp))
            
            // Icon placeholder
            Text(
                text = "💡",
                style = AsemanTypography.h2
            )
            
            Spacer(modifier = Modifier.width(12.dp))
            
            Column {
                Text(
                    text = smartTip.title,
                    style = AsemanTypography.labelMd,
                    color = TertiaryDay
                )
                
                Spacer(modifier = Modifier.height(4.dp))
                
                Text(
                    text = smartTip.message,
                    style = AsemanTypography.bodyMd,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SmartTipBannerPreview() {
    AsemanWeatherTheme {
        SmartTipBanner(
            smartTip = SmartTip(
                title = "نکته هوشمند",
                message = "ضد آفتاب فراموش نشه!",
                iconResId = 0
            )
        )
    }
}
