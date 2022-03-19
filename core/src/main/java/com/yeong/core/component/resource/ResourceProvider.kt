package com.yeong.core.component.resource

import android.content.ContentResolver
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.FontRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

class ResourceProvider(private val context: Context) {

    companion object {
        const val ANDROID_ASSERT_PATH = "${ContentResolver.SCHEME_FILE}:///android_asset"
    }

    fun getString(@StringRes res: Int) = context.getString(res)

    fun getString(@StringRes res: Int, vararg formatArgs: Any) = context.getString(res, *formatArgs)

    fun getColor(@ColorRes res: Int) = ContextCompat.getColor(context, res)

    fun getDrawable(@DrawableRes res: Int) = ContextCompat.getDrawable(context, res)

    fun getAssertsManager() = context.assets

    fun getFont(@FontRes font: Int) = ResourcesCompat.getFont(context, font)

    fun permissionCheck(permission: String): Boolean =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            context.checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED
        } else {
            true
        }

}