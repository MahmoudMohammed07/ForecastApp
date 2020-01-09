package com.android.forecastapp.data.repository

import androidx.lifecycle.LiveData
import com.android.forecastapp.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(): LiveData<out UnitSpecificCurrentWeatherEntry>
}