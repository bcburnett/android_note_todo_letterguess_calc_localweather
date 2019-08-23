package com.newlondonweb.tabbedfragmentdemo.sections.weather.weather

data class Flags(
    val neareststation: Double,
    val sources: List<String>,
    val units: String
)