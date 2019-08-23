package com.newlondonweb.tabbedfragmentdemo.sections.weather.weather

data class Hourly(
    val `data`: List<DataX>,
    val icon: String,
    val summary: String
)