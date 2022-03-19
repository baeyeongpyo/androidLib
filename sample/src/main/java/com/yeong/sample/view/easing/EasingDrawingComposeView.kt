package com.yeong.sample.view.easing

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yeong.easing.impl.cubic.EasingInCubic
import com.yeong.easing.impl.cubic.EasingInOutCubic
import com.yeong.easing.impl.cubic.EasingOutCubic
import com.yeong.easing.impl.expo.*
import com.yeong.easing.impl.quad.EasingInOutQuad
import com.yeong.easing.impl.quad.EasingInQuad
import com.yeong.easing.impl.quad.EasingOutQuad
import com.yeong.easing.impl.quart.*
import com.yeong.easing.impl.sine.EasingInOutSine
import com.yeong.easing.impl.sine.EasingInSine
import com.yeong.easing.impl.sine.EasingOutSine
import com.yeong.easing.type.Easing
import kotlin.math.abs

private const val previewViewSize = 200

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

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize * 3)
fun EasingSine() {
    Row {
        DrawingEasing(EasingInSine)
        DrawingEasing(EasingInOutSine)
        DrawingEasing(EasingOutSine)
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize * 3)
fun EasingCubic() {
    Row {
        DrawingEasing(EasingInCubic)
        DrawingEasing(EasingInOutCubic)
        DrawingEasing(EasingOutCubic)
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize * 3)
fun EasingQuint() {
    Row {
        DrawingEasing(EasingInQuint)
        DrawingEasing(EasingInOutQuint)
        DrawingEasing(EasingOutQuint)
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize * 3)
fun EasingCirc() {
    Row {
        DrawingEasing(EasingInCirc)
        DrawingEasing(EasingInOutCirc)
        DrawingEasing(EasingOutCirc)
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize * 3)
fun EasingElastic() {
    Row {
        DrawingEasing(EasingInElastic)
        DrawingEasing(EasingInOutElastic)
        DrawingEasing(EasingOutElastic)
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize * 3)
fun EasingQuad() {
    Row {
        DrawingEasing(EasingInQuad)
        DrawingEasing(EasingInOutQuad)
        DrawingEasing(EasingOutQuad)
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize * 3)
fun EasingQuart() {
    Row {
        DrawingEasing(EasingInQuart)
        DrawingEasing(EasingInOutQuart)
        DrawingEasing(EasingOutQuart)
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize * 3)
fun EasingExpo() {
    Row {
        DrawingEasing(EasingInExpo)
        DrawingEasing(EasingInOutExpo)
        DrawingEasing(EasingOutExpo)
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize * 3)
fun EasingBack() {
    Row {
        DrawingEasing(EasingInBack)
        DrawingEasing(EasingInOutBack)
        DrawingEasing(EasingOutBack)
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize * 3)
fun EasingBounce() {
    Row {
        DrawingEasing(EasingInBounce)
        DrawingEasing(EasingInOutBounce)
        DrawingEasing(EasingOutBounce)
    }
}
