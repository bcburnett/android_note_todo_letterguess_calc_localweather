package com.newlondonweb.tabbedfragmentdemo.data.weather

data class Minutely(
    val `data`: List<Data>,
    val icon: String,
    val summary: String
)