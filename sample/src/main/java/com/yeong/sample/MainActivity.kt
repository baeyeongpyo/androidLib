package com.yeong.sample

import com.yeong.core.component.BindingActivity
import com.yeong.core.logger.mLog
import com.yeong.easing.impl.sine.EasingOutSine
import com.yeong.sample.databinding.ActivityMainBinding

class MainActivity : BindingActivity<ActivityMainBinding>() {

    private val dialogTest by lazy {
        TestDialogFragment()
            .setSubmitCallback { mLog.i("dialog submit") }
            .setCancelCallback { mLog.i("dialog isCancel : $it") }
    }

    override val layoutId: Int = R.layout.activity_main

    override fun initView() {
        binding.sampleTestButton.setOnClickListener {
            dialogTest.show(supportFragmentManager, "")
        }
    }

    override fun initViewBinding() {

    }

    override fun observeBinding() {

    }

}