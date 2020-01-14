package com.android.forecastapp.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.forecastapp.data.network.response.CurrentWeatherResponse
import com.android.forecastapp.internal.NoConnectivityException

class WeatherNetworkDataSourceImpl(
    private val WeatherAPIService: WeatherAPIService
) : WeatherNetworkDataSource {

    private val _downloadedCurrentWeather = MutableLiveData<CurrentWeatherResponse>()
    override val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>
        get() = _downloadedCurrentWeather

    override suspend fun fetchCurrentWeather(location: String, unit: String) {
        try {
            val fetchedCurrentWeather = WeatherAPIService
                .getCurrentWeather(location, unit)
                .await()
            _downloadedCurrentWeather.postValue(fetchedCurrentWeather)
        } catch (e: NoConnectivityException) {
            Log.e("Connectivity", "No internet connection.", e)
        }
    }
}