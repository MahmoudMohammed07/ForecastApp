package com.android.forecastapp.data.network.response

import com.android.forecastapp.data.db.entity.WeatherLocation
import com.android.forecastapp.data.db.entity.CurrentWeatherEntry
import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: WeatherLocation
)