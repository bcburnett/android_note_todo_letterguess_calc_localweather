package com.newlondonweb.tabbedfragmentdemo.sections.weather.weather

data class Minutely(
    val `data`: List<Data>,
    val icon: String,
    val summary: String
)