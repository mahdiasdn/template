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
import com.aseman.weather.theme.AsemanWeatherTheme
import com.aseman.weather.theme.SurfaceContainerLowest
import com.aseman.weather.theme.AsemanTypography
import com.aseman.weather.utils.toPersianNumber

@Composable
fun StatCard(
    icon: String,
    label: String,
    value: String,
    unit: String = "",
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .widthIn(min = 140.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(SurfaceContainerLowest)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Icon
            Text(
                text = icon,
                style = AsemanTypography.h2
            )
            
            Spacer(modifier = Modifier.width(12.dp))
            
            // Value and label
            Column {
                Text(
                    text = "$value$unit",
                    style = AsemanTypography.statValue,
                    color = MaterialTheme.colorScheme.onSurface
                )
                
                Spacer(modifier = Modifier.height(4.dp))
                
                Text(
                    text = label,
                    style = AsemanTypography.labelMd,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun StatCardPreview() {
    AsemanWeatherTheme {
        StatCard(
            icon = "💧",
            label = "رطوبت",
            value = "۴۵".toPersianNumber(),
            unit = "%"
        )
    }
}
