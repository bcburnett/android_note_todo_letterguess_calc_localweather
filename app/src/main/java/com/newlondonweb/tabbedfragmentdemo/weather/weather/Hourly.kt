package com.newlondonweb.tabbedfragmentdemo.weather.weather

data class Hourly(
    val `data`: List<DataX>,
    val icon: String,
    val summary: String
)