package com.yeong.core.component.Dialog

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.DisplayMetrics
import android.view.WindowManager
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle

abstract class BaseDialogFragment<T> : DialogFragment() {

    fun interface DialogSubmitCallback<T> {
        fun dialogSubmit(submitData: T)
    }

    fun interface DialogCancelCallback {
        /** @param isCancel : cancel 이벤트를 통한 취소여부 판단. */
        fun dialogCancel(isCancel: Boolean)
    }

    private var submitCallback: DialogSubmitCallback<T>? = null
    private var cancelCallback: DialogCancelCallback? = null

    private var windowWidthSize: Int = 0
    private var windowHeightSize: Int = 0

    private var isCancelEvent = false

    open fun dialogOutSizeTouchBlocking(): Boolean = false

    override fun onStart() {
        super.onStart()

        val (windowWidthSize, windowHeightSize) = dialog?.window?.windowManager?.run {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                currentWindowMetrics.bounds.run { width() to height() }
            } else {
                val displayMetrics = DisplayMetrics()
                defaultDisplay.getMetrics(displayMetrics)
                displayMetrics.widthPixels to displayMetrics.heightPixels
            }
        } ?: 0 to 0
        this.windowWidthSize = windowWidthSize
        this.windowHeightSize = windowHeightSize

        /*val windowManagerLayoutParams = WindowManager.LayoutParams()
        windowManagerLayoutParams.width = getDialogWidthSize(windowWidthSize)
        windowManagerLayoutParams.height = getDialogHeightSize(windowHeightSize)*/
        dialog?.window?.run {
            getDialogWidthSize(windowWidthSize)?.let { attributes.width = it }
            getDialogHeightSize(windowHeightSize)?.let { attributes.height = it }

            setBackgroundDrawable(getWindowBackgroundDrawable())

            if (dialogOutSizeTouchBlocking())
                setFlags(
                    WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
                    WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
                )

            attributes = attributes
        }
    }

    open fun getWindowBackgroundDrawable(): Drawable = ColorDrawable(Color.TRANSPARENT)
    open fun getDialogWidthSize(windowSize: Int): Int? = null

    open fun getDialogHeightSize(windowSize: Int): Int? = null

    fun setCancelCallback(dismissCallback: DialogCancelCallback): BaseDialogFragment<T> {
        this.cancelCallback = dismissCallback
        return this
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        isCancelEvent = false
    }

    protected open fun cancel() {
        isCancelEvent = true
        cancelCallback?.dialogCancel(isCancelEvent)
        dismiss()
    }

    fun setSubmitCallback(submitCallback: DialogSubmitCallback<T>): BaseDialogFragment<T> {
        this.submitCallback = submitCallback
        return this
    }

    protected open fun submit(data: T) {
        submitCallback?.dialogSubmit(data)
        dismiss()
    }

    override fun show(manager: FragmentManager, tag: String?) {
        if (lifecycle.currentState < Lifecycle.State.STARTED) super.show(manager, tag)
    }

    override fun dismiss() {
        super.dismiss()
        if (isCancelEvent.not()) cancelCallback?.dialogCancel(isCancelEvent)
    }
}