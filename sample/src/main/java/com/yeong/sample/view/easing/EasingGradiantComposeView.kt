package com.yeong.sample.view.easing

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yeong.easing.type.Easing

@Composable
fun DrawingEasingGradiant(easing: Easing, modifier: Modifier = Modifier.size(previewViewSize.dp)) =
    Box(
        modifier.background(
            brush = Brush.verticalGradient(colors = gradiantColorList(easing))
        )
    )

fun gradiantColorList(
    easing: Easing,
    color: Color = Color.Green
) = IntRange(0, 100)
    .map { it * .01f }
    .map(easing::calculator)
    .map {
        Color(
            red = color.red,
            green = color.green,
            blue = color.blue,
            alpha = 1 - it.toFloat()
        )
    }