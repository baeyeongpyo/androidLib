package com.yeong.sample.view.easing

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import com.yeong.easing.type.Easing
import kotlin.math.abs

@Composable
fun DrawingEasing(easing: Easing, modifier: Modifier = Modifier.size(previewViewSize.dp)) =
    Canvas(modifier) {
        val path = Path()
        path.moveTo(0f, size.height)
        val widthPerSize = size.width * 0.01f
        val easingList = IntRange(0, 100)
            .map { v -> v to easing.calculator(v * 0.01).toFloat() }

        val easingMinValue = easingList.minOf { it.second }
        val easingMaxValue = easingList.maxOf { it.second }
        val easingHeight = easingMaxValue - easingMinValue

        val heightPerSize = size.height / easingHeight

        val easingXDatumPoint = heightPerSize * abs(easingMinValue)

        easingList.forEach { p ->
            path.lineTo(
                p.first * widthPerSize,
                size.height
                        - abs(heightPerSize * easingMinValue)
                        - (p.second * heightPerSize)
            )
        }

        if (easingMinValue <= 0) {
            val minYPositionValue = size.height - easingXDatumPoint //* easingMinValue
            drawLine(
                color = Color.Black,
                start = Offset(0f, minYPositionValue),
                end = Offset(size.width, minYPositionValue),
                strokeWidth = 5f
            )
        }
        if (easingMaxValue > 1) {
            val maxYPositionValue = size.height - easingXDatumPoint - heightPerSize
            drawLine(
                color = Color.Black,
                start = Offset(0f, maxYPositionValue),
                end = Offset(size.width, maxYPositionValue),
                strokeWidth = 5f
            )
        }
        drawPath(
            path,
            color = Color.Blue,
            style = Stroke(width = 10f)
        )
    }
