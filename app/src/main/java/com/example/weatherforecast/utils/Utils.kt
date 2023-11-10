package com.example.weatherforecast.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class Utils {
    companion object {
        fun timestampToHumanDate(timeStamp: Long, format: String): String {
            val sdf = SimpleDateFormat(format, Locale.getDefault())
            return sdf.format(Date(timeStamp * 1000))
        }

        fun buildIcon(icon: String, izBigSize : Boolean = true): String {
            return if (izBigSize) {
                "https://openweathermap.org/img/wn/$icon@4x.png"
            } else {
                "https://openweathermap.org/img/wn/$icon.png"
            }
        }
    }
}