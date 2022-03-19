package com.yeong.sample.view.easing

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
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
fun DrawingEasing(easing: Easing, modifier: Modifier =  Modifier.fillMaxSize()) =
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
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize*3)
fun EasingInSine() {
    Row {
        DrawingEasing(EasingInSine, Modifier.size(previewViewSize.dp))
        DrawingEasing(EasingInOutSine, Modifier.size(previewViewSize.dp))
        DrawingEasing(EasingOutSine, Modifier.size(previewViewSize.dp))
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInCubic() {
    DrawingEasing(EasingInCubic)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInOutCubic() {
    DrawingEasing(EasingInOutCubic)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingOutCubic() {
    DrawingEasing(EasingOutCubic)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInQuint() {
    DrawingEasing(EasingInQuint)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInOutQuint() {
    DrawingEasing(EasingInOutQuint)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingOutQuint() {
    DrawingEasing(EasingOutQuint)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInCirc() {
    DrawingEasing(EasingInCirc)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInOutCirc() {
    DrawingEasing(EasingInOutCirc)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingOutCirc() {
    DrawingEasing(EasingOutCirc)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInElastic() {
    DrawingEasing(EasingInElastic)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInOutElastic() {
    DrawingEasing(EasingInOutElastic)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingOutElastic() {
    DrawingEasing(EasingOutElastic)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInQuad() {
    DrawingEasing(EasingInQuad)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInOutQuad() {
    DrawingEasing(EasingInOutQuad)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingOutQuad() {
    DrawingEasing(EasingOutQuad)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInQuart() {
    DrawingEasing(EasingInQuart)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInOutQuart() {
    DrawingEasing(EasingInOutQuart)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingOutQuart() {
    DrawingEasing(EasingOutQuart)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInExpo() {
    DrawingEasing(EasingInExpo)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingInOutExpo() {
    DrawingEasing(EasingInOutExpo)
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize, widthDp = previewViewSize)
fun EasingOutExpo() {
    DrawingEasing(EasingOutExpo)
}

@Composable
@Preview(showBackground = true, heightDp = 500, widthDp = 500)
fun EasingInBack() {
    DrawingEasing(EasingInBack)
}

@Composable
@Preview(showBackground = true, heightDp = 500, widthDp = 500)
fun EasingInOutBack() {
    DrawingEasing(EasingInOutBack)
}

@Composable
@Preview(showBackground = true, heightDp = 500, widthDp = 500)
fun EasingOutBack() {
    DrawingEasing(EasingOutBack)
}

@Composable
@Preview(showBackground = true, heightDp = 500, widthDp = 500)
fun EasingInBounce() {
    DrawingEasing(EasingInBounce)
}

@Composable
@Preview(showBackground = true, heightDp = 500, widthDp = 500)
fun EasingInOutBounce() {
    DrawingEasing(EasingInOutBounce)
}

@Composable
@Preview(showBackground = true, heightDp = 500, widthDp = 500)
fun EasingOutBounce() {
    DrawingEasing(EasingOutBounce)
}
