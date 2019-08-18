package com.newlondonweb.tabbedfragmentdemo.data.weather

data class Flags(
    val neareststation: Double,
    val sources: List<String>,
    val units: String
)