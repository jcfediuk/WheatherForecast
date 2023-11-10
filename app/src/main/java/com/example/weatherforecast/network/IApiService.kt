package com.example.weatherforecast.network

import com.example.weatherforecast.constant.Const.Companion.openWeatherMapApiKey
import com.example.weatherforecast.model.forecast.ForecastResult
import com.example.weatherforecast.model.weather.WeatherResult
import retrofit2.http.GET
import retrofit2.http.Query

interface IApiService {
    @GET("weather")
    suspend fun getWeather(
        @Query("lat") lat: Double = 0.0,
        @Query("lon") lng: Double = 0.0,
        @Query("units") units: String = "metric",
        @Query("appid") appId: String = openWeatherMapApiKey
    ): WeatherResult

    @GET("forecast")
    suspend fun getForecast(
        @Query("lat") lat: Double = 0.0,
        @Query("lon") lng: Double = 0.0,
        @Query("units") units: String = "metric",
        @Query("appid") appId: String = openWeatherMapApiKey
    ): ForecastResult
}