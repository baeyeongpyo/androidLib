package com.yeong.core.component

import android.os.Bundle
import android.os.PersistableBundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BindingActivity<BINDING : ViewDataBinding> : BaseActivity() {

    private var _binding: BINDING? = null
    val binding get() = _binding!!

    protected abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        _binding = DataBindingUtil.setContentView(this, layoutId)
        initViewBinding()
        observeBinding()
    }

    abstract fun initViewBinding()
    abstract fun observeBinding()

}