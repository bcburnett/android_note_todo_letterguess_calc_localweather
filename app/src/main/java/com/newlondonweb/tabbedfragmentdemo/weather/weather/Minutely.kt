package com.newlondonweb.tabbedfragmentdemo.weather.weather

data class Minutely(
    val `data`: List<Data>,
    val icon: String,
    val summary: String
)