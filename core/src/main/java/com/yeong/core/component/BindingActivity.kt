package com.yeong.core.component

import android.os.Bundle
import android.os.PersistableBundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BindingActivity<BINDING : ViewDataBinding> : BaseActivity() {

    private var _binding: BINDING? = null
    protected val binding get() = _binding!!

    protected abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        _binding = DataBindingUtil.setContentView(this, layoutId)
        super.onCreate(savedInstanceState)
        initViewBinding()
        observeBinding()
    }

    abstract fun initViewBinding()
    abstract fun observeBinding()

}