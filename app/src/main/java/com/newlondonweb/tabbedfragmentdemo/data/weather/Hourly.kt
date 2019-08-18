package com.newlondonweb.tabbedfragmentdemo.data.weather

data class Hourly(
    val `data`: List<DataX>,
    val icon: String,
    val summary: String
)