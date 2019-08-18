package com.newlondonweb.tabbedfragmentdemo.data.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\bo\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00bd\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u0006\u0010\'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\u0006\u0010+\u001a\u00020\u0003\u00a2\u0006\u0002\u0010,J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0010H\u00c6\u0003J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u0003H\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\u0010H\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0010H\u00c6\u0003J\t\u0010e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010g\u001a\u00020\u0003H\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0003H\u00c6\u0003J\t\u0010j\u001a\u00020\u0005H\u00c6\u0003J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\u0003H\u00c6\u0003J\t\u0010n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010o\u001a\u00020\u0005H\u00c6\u0003J\t\u0010p\u001a\u00020\u0005H\u00c6\u0003J\t\u0010q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010r\u001a\u00020\u0005H\u00c6\u0003J\t\u0010s\u001a\u00020\u0003H\u00c6\u0003J\t\u0010t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010u\u001a\u00020\u0003H\u00c6\u0003J\t\u0010v\u001a\u00020\u0005H\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\t\u0010x\u001a\u00020\u0005H\u00c6\u0003J\t\u0010y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010z\u001a\u00020\u0005H\u00c6\u0003J\t\u0010{\u001a\u00020\u0003H\u00c6\u0003J\t\u0010|\u001a\u00020\u0005H\u00c6\u0003J\t\u0010}\u001a\u00020\u0003H\u00c6\u0003J\u008f\u0003\u0010~\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010\'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u0003H\u00c6\u0001J\u0015\u0010\u007f\u001a\u00030\u0080\u00012\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0005H\u00d6\u0001J\n\u0010\u0083\u0001\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010.R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010.R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00100R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0011\u0010\u0017\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010;R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u0011\u0010\u0019\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010;R\u0011\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00100R\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00100R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010.R\u0011\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00100R\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0011\u0010\u001f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00100R\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010.R\u0011\u0010!\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00100R\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010.R\u0011\u0010#\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00100R\u0011\u0010$\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00100R\u0011\u0010%\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010.R\u0011\u0010&\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00100R\u0011\u0010\'\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010.R\u0011\u0010(\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010.R\u0011\u0010)\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010.R\u0011\u0010*\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00100R\u0011\u0010+\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010.\u00a8\u0006\u0084\u0001"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/data/weather/DataX;", "", "apparentTemperatureHigh", "", "apparentTemperatureHighTime", "", "apparentTemperatureLow", "apparentTemperatureLowTime", "apparentTemperatureMax", "apparentTemperatureMaxTime", "apparentTemperatureMin", "apparentTemperatureMinTime", "cloudCover", "dewPoint", "humidity", "icon", "", "moonPhase", "ozone", "precipIntensity", "precipIntensityMax", "precipIntensityMaxTime", "precipProbability", "precipType", "pressure", "summary", "sunriseTime", "sunsetTime", "temperatureHigh", "temperatureHighTime", "temperatureLow", "temperatureLowTime", "temperatureMax", "temperatureMaxTime", "temperatureMin", "temperatureMinTime", "time", "uvIndex", "uvIndexTime", "visibility", "windBearing", "windGust", "windGustTime", "windSpeed", "(DIDIDIDIDDDLjava/lang/String;DDDDIDLjava/lang/String;DLjava/lang/String;IIDIDIDIDIIDIDDDID)V", "getApparentTemperatureHigh", "()D", "getApparentTemperatureHighTime", "()I", "getApparentTemperatureLow", "getApparentTemperatureLowTime", "getApparentTemperatureMax", "getApparentTemperatureMaxTime", "getApparentTemperatureMin", "getApparentTemperatureMinTime", "getCloudCover", "getDewPoint", "getHumidity", "getIcon", "()Ljava/lang/String;", "getMoonPhase", "getOzone", "getPrecipIntensity", "getPrecipIntensityMax", "getPrecipIntensityMaxTime", "getPrecipProbability", "getPrecipType", "getPressure", "getSummary", "getSunriseTime", "getSunsetTime", "getTemperatureHigh", "getTemperatureHighTime", "getTemperatureLow", "getTemperatureLowTime", "getTemperatureMax", "getTemperatureMaxTime", "getTemperatureMin", "getTemperatureMinTime", "getTime", "getUvIndex", "getUvIndexTime", "getVisibility", "getWindBearing", "getWindGust", "getWindGustTime", "getWindSpeed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class DataX {
    private final double apparentTemperatureHigh = 0.0;
    private final int apparentTemperatureHighTime = 0;
    private final double apparentTemperatureLow = 0.0;
    private final int apparentTemperatureLowTime = 0;
    private final double apparentTemperatureMax = 0.0;
    private final int apparentTemperatureMaxTime = 0;
    private final double apparentTemperatureMin = 0.0;
    private final int apparentTemperatureMinTime = 0;
    private final double cloudCover = 0.0;
    private final double dewPoint = 0.0;
    private final double humidity = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String icon = null;
    private final double moonPhase = 0.0;
    private final double ozone = 0.0;
    private final double precipIntensity = 0.0;
    private final double precipIntensityMax = 0.0;
    private final int precipIntensityMaxTime = 0;
    private final double precipProbability = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String precipType = null;
    private final double pressure = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String summary = null;
    private final int sunriseTime = 0;
    private final int sunsetTime = 0;
    private final double temperatureHigh = 0.0;
    private final int temperatureHighTime = 0;
    private final double temperatureLow = 0.0;
    private final int temperatureLowTime = 0;
    private final double temperatureMax = 0.0;
    private final int temperatureMaxTime = 0;
    private final double temperatureMin = 0.0;
    private final int temperatureMinTime = 0;
    private final int time = 0;
    private final double uvIndex = 0.0;
    private final int uvIndexTime = 0;
    private final double visibility = 0.0;
    private final double windBearing = 0.0;
    private final double windGust = 0.0;
    private final int windGustTime = 0;
    private final double windSpeed = 0.0;
    
    public final double getApparentTemperatureHigh() {
        return 0.0;
    }
    
    public final int getApparentTemperatureHighTime() {
        return 0;
    }
    
    public final double getApparentTemperatureLow() {
        return 0.0;
    }
    
    public final int getApparentTemperatureLowTime() {
        return 0;
    }
    
    public final double getApparentTemperatureMax() {
        return 0.0;
    }
    
    public final int getApparentTemperatureMaxTime() {
        return 0;
    }
    
    public final double getApparentTemperatureMin() {
        return 0.0;
    }
    
    public final int getApparentTemperatureMinTime() {
        return 0;
    }
    
    public final double getCloudCover() {
        return 0.0;
    }
    
    public final double getDewPoint() {
        return 0.0;
    }
    
    public final double getHumidity() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIcon() {
        return null;
    }
    
    public final double getMoonPhase() {
        return 0.0;
    }
    
    public final double getOzone() {
        return 0.0;
    }
    
    public final double getPrecipIntensity() {
        return 0.0;
    }
    
    public final double getPrecipIntensityMax() {
        return 0.0;
    }
    
    public final int getPrecipIntensityMaxTime() {
        return 0;
    }
    
    public final double getPrecipProbability() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrecipType() {
        return null;
    }
    
    public final double getPressure() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary() {
        return null;
    }
    
    public final int getSunriseTime() {
        return 0;
    }
    
    public final int getSunsetTime() {
        return 0;
    }
    
    public final double getTemperatureHigh() {
        return 0.0;
    }
    
    public final int getTemperatureHighTime() {
        return 0;
    }
    
    public final double getTemperatureLow() {
        return 0.0;
    }
    
    public final int getTemperatureLowTime() {
        return 0;
    }
    
    public final double getTemperatureMax() {
        return 0.0;
    }
    
    public final int getTemperatureMaxTime() {
        return 0;
    }
    
    public final double getTemperatureMin() {
        return 0.0;
    }
    
    public final int getTemperatureMinTime() {
        return 0;
    }
    
    public final int getTime() {
        return 0;
    }
    
    public final double getUvIndex() {
        return 0.0;
    }
    
    public final int getUvIndexTime() {
        return 0;
    }
    
    public final double getVisibility() {
        return 0.0;
    }
    
    public final double getWindBearing() {
        return 0.0;
    }
    
    public final double getWindGust() {
        return 0.0;
    }
    
    public final int getWindGustTime() {
        return 0;
    }
    
    public final double getWindSpeed() {
        return 0.0;
    }
    
    public DataX(double apparentTemperatureHigh, int apparentTemperatureHighTime, double apparentTemperatureLow, int apparentTemperatureLowTime, double apparentTemperatureMax, int apparentTemperatureMaxTime, double apparentTemperatureMin, int apparentTemperatureMinTime, double cloudCover, double dewPoint, double humidity, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, double moonPhase, double ozone, double precipIntensity, double precipIntensityMax, int precipIntensityMaxTime, double precipProbability, @org.jetbrains.annotations.NotNull()
    java.lang.String precipType, double pressure, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, int sunriseTime, int sunsetTime, double temperatureHigh, int temperatureHighTime, double temperatureLow, int temperatureLowTime, double temperatureMax, int temperatureMaxTime, double temperatureMin, int temperatureMinTime, int time, double uvIndex, int uvIndexTime, double visibility, double windBearing, double windGust, int windGustTime, double windSpeed) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final double component16() {
        return 0.0;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final double component24() {
        return 0.0;
    }
    
    public final int component25() {
        return 0;
    }
    
    public final double component26() {
        return 0.0;
    }
    
    public final int component27() {
        return 0;
    }
    
    public final double component28() {
        return 0.0;
    }
    
    public final int component29() {
        return 0;
    }
    
    public final double component30() {
        return 0.0;
    }
    
    public final int component31() {
        return 0;
    }
    
    public final int component32() {
        return 0;
    }
    
    public final double component33() {
        return 0.0;
    }
    
    public final int component34() {
        return 0;
    }
    
    public final double component35() {
        return 0.0;
    }
    
    public final double component36() {
        return 0.0;
    }
    
    public final double component37() {
        return 0.0;
    }
    
    public final int component38() {
        return 0;
    }
    
    public final double component39() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newlondonweb.tabbedfragmentdemo.data.weather.DataX copy(double apparentTemperatureHigh, int apparentTemperatureHighTime, double apparentTemperatureLow, int apparentTemperatureLowTime, double apparentTemperatureMax, int apparentTemperatureMaxTime, double apparentTemperatureMin, int apparentTemperatureMinTime, double cloudCover, double dewPoint, double humidity, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, double moonPhase, double ozone, double precipIntensity, double precipIntensityMax, int precipIntensityMaxTime, double precipProbability, @org.jetbrains.annotations.NotNull()
    java.lang.String precipType, double pressure, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, int sunriseTime, int sunsetTime, double temperatureHigh, int temperatureHighTime, double temperatureLow, int temperatureLowTime, double temperatureMax, int temperatureMaxTime, double temperatureMin, int temperatureMinTime, int time, double uvIndex, int uvIndexTime, double visibility, double windBearing, double windGust, int windGustTime, double windSpeed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}