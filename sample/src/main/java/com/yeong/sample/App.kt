package com.yeong.sample

import android.app.Application
import com.yeong.core.logger.mLog
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        mLog.plant(Timber.DebugTree())
    }

}