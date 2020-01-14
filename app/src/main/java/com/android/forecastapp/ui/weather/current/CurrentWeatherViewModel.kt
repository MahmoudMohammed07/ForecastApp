package com.android.forecastapp.ui.weather.current

import androidx.lifecycle.ViewModel
import com.android.forecastapp.data.provider.UnitProvider
import com.android.forecastapp.data.repository.ForecastRepository
import com.android.forecastapp.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {
    private val unitSystem = unitProvider.getSystemUnit()

    val isMetric: Boolean
        get() = unitSystem.contentEquals("m")

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather()
    }

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}
