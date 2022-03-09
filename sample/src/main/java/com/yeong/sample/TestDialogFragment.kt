package com.yeong.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yeong.core.component.Dialog.BaseDialogFragment
import com.yeong.core.component.resource.toDp

class TestDialogFragment : BaseDialogFragment<Unit>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.dialog_test, container, false)

    override fun getDialogWidthSize(windowSize: Int): Int = 300.toDp()
    override fun getDialogHeightSize(windowSize: Int): Int = 200.toDp()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.test_dialog_ok_button).setOnClickListener { submit(Unit) }
        view.findViewById<View>(R.id.test_dialog_cancel_button).setOnClickListener { cancel() }
    }

}
