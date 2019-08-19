package com.newlondonweb.tabbedfragmentdemo.ui.main.fragments;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u0016\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fH\u0002J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006!"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/WeatherFragment;", "Landroidx/fragment/app/Fragment;", "()V", "connectivityManager", "Landroid/net/ConnectivityManager;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "fusedLocationClient$delegate", "Lkotlin/Lazy;", "callDarkSky", "Lcom/google/android/gms/tasks/Task;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "doDisplay", "", "json", "Lcom/newlondonweb/tabbedfragmentdemo/data/weather/Weather;", "location", "doHttpRequestForWeather", "getWeather", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "Companion", "app_debug"})
public final class WeatherFragment extends androidx.fragment.app.Fragment {
    private final android.net.ConnectivityManager connectivityManager = null;
    private final kotlin.Lazy fusedLocationClient$delegate = null;
    public static final com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.WeatherFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.google.android.gms.tasks.Task<android.location.Location> callDarkSky() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final com.google.android.gms.tasks.Task<android.location.Location> getWeather() {
        return null;
    }
    
    private final void doHttpRequestForWeather(android.location.Location location) {
    }
    
    private final void doDisplay(com.newlondonweb.tabbedfragmentdemo.data.weather.Weather json, android.location.Location location) {
    }
    
    public WeatherFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/WeatherFragment$Companion;", "", "()V", "newInstance", "Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/WeatherFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.WeatherFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}