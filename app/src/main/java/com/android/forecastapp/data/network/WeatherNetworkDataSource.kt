package com.android.forecastapp.data.network

import androidx.lifecycle.LiveData
import com.android.forecastapp.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(location: String)
}