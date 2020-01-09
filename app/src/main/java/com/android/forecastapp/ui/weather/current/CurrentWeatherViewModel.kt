package com.android.forecastapp.ui.weather.current

import androidx.lifecycle.ViewModel
import com.android.forecastapp.data.repository.ForecastRepository
import com.android.forecastapp.internal.lazyDeferred

class CurrentWeatherViewModel(private val forecastRepository: ForecastRepository) : ViewModel() {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather()
    }
}
