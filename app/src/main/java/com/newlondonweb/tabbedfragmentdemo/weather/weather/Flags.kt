package com.newlondonweb.tabbedfragmentdemo.weather.weather

data class Flags(
    val neareststation: Double,
    val sources: List<String>,
    val units: String
)