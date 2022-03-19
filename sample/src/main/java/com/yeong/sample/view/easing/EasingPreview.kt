package com.yeong.sample.view.easing

import androidx.compose.foundation.layout.Column
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

internal const val previewViewSize = 120

@Composable
@Preview(showBackground = true, heightDp = previewViewSize * 2, widthDp = previewViewSize * 3)
fun EasingSine() {
    Column {
        Row {
            DrawingEasing(EasingInSine)
            DrawingEasing(EasingInOutSine)
            DrawingEasing(EasingOutSine)
        }
        Row {
            DrawingEasingGradiant(EasingInSine)
            DrawingEasingGradiant(EasingInOutSine)
            DrawingEasingGradiant(EasingOutSine)
        }
    }

}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize * 2, widthDp = previewViewSize * 3)
fun EasingCubic() {
    Column {
        Row {
            DrawingEasing(EasingInCubic)
            DrawingEasing(EasingInOutCubic)
            DrawingEasing(EasingOutCubic)
        }
        Row {
            DrawingEasingGradiant(EasingInCubic)
            DrawingEasingGradiant(EasingInOutCubic)
            DrawingEasingGradiant(EasingOutCubic)
        }
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize * 2, widthDp = previewViewSize * 3)
fun EasingQuint() {
    Column {
        Row {
            DrawingEasing(EasingInQuint)
            DrawingEasing(EasingInOutQuint)
            DrawingEasing(EasingOutQuint)
        }
        Row {
            DrawingEasingGradiant(EasingInQuint)
            DrawingEasingGradiant(EasingInOutQuint)
            DrawingEasingGradiant(EasingOutQuint)
        }
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize * 2, widthDp = previewViewSize * 3)
fun EasingCirc() {
    Column {
        Row {
            DrawingEasing(EasingInCirc)
            DrawingEasing(EasingInOutCirc)
            DrawingEasing(EasingOutCirc)
        }
        Row {
            DrawingEasingGradiant(EasingInCirc)
            DrawingEasingGradiant(EasingInOutCirc)
            DrawingEasingGradiant(EasingOutCirc)
        }
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
@Preview(showBackground = true, heightDp = previewViewSize * 2, widthDp = previewViewSize * 3)
fun EasingQuad() {
    Column {
        Row {
            DrawingEasing(EasingInQuad)
            DrawingEasing(EasingInOutQuad)
            DrawingEasing(EasingOutQuad)
        }
        Row {
            DrawingEasingGradiant(EasingInQuad)
            DrawingEasingGradiant(EasingInOutQuad)
            DrawingEasingGradiant(EasingOutQuad)
        }
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize * 2, widthDp = previewViewSize * 3)
fun EasingQuart() {
    Column {
        Row {
            DrawingEasing(EasingInQuart)
            DrawingEasing(EasingInOutQuart)
            DrawingEasing(EasingOutQuart)
        }
        Row {
            DrawingEasingGradiant(EasingInQuart)
            DrawingEasingGradiant(EasingInOutQuart)
            DrawingEasingGradiant(EasingOutQuart)
        }
    }
}

@Composable
@Preview(showBackground = true, heightDp = previewViewSize * 2, widthDp = previewViewSize * 3)
fun EasingExpo() {
    Column {
        Row {
            DrawingEasing(EasingInExpo)
            DrawingEasing(EasingInOutExpo)
            DrawingEasing(EasingOutExpo)
        }
        Row {
            DrawingEasingGradiant(EasingInExpo)
            DrawingEasingGradiant(EasingInOutExpo)
            DrawingEasingGradiant(EasingOutExpo)
        }
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
