package com.yeong.core.component

import android.content.SharedPreferences
import androidx.core.content.edit
import com.yeong.core.data.PreferenceKey

class PreferenceUtil(private val preference: SharedPreferences) {

    fun <T> setValue(data: PreferenceKey<T>, value: T) = try {
        preference.edit { putValue(data, value) }
    } catch (e: Exception) {
        preference.edit {
            remove(data.keyName)
            putValue(data, value)
        }
    }

    @Suppress("UNCHECKED_CAST", "UNREACHABLE_CODE")
    fun <T> getValue(date: PreferenceKey<T>): T? = try {
        when (date.keyType) {
            String::class.java ->
                preference.getString(date.keyName, null) as T
            Int::class.java ->
                preference.getInt(date.keyName, throw NullPointerException()) as T
            Long::class.java ->
                preference.getLong(date.keyName, throw NullPointerException()) as T
            Float::class.java ->
                preference.getFloat(date.keyName, throw NullPointerException()) as T
            Boolean::class.java ->
                preference.getBoolean(date.keyName, throw NullPointerException()) as T
            else ->
                null
        }
    } catch (e: Exception) {
        null
    }

    fun <T> remove(data: PreferenceKey<T>) = preference.edit { remove(data.keyName) }

    private fun <T> SharedPreferences.Editor.putValue(data: PreferenceKey<T>, value: T) {
        when (data.keyType) {
            String::class.java ->
                putString(data.keyName, value as String)
            Int::class.java ->
                putInt(data.keyName, value as Int)
            Long::class.java ->
                putLong(data.keyName, value as Long)
            Float::class.java ->
                putFloat(data.keyName, value as Float)
            Boolean::class.java ->
                putBoolean(data.keyName, value as Boolean)
        }
    }


}