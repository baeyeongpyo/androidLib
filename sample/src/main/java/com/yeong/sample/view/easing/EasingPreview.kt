package com.yeong.sample.view.easing

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
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
