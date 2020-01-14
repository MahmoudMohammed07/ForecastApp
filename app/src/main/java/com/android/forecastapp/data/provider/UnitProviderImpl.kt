package com.android.forecastapp.data.provider

import android.content.Context

const val UNIT_SYSTEM = "UNIT_SYSTEM"

class UnitProviderImpl(context: Context) : PreferenceProvider(context), UnitProvider {
    override fun getSystemUnit(): String {
        return preferences.getString(UNIT_SYSTEM, "m").toString()
    }
}