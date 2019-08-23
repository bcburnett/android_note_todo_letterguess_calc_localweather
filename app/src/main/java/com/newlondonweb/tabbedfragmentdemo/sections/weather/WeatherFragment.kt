package com.newlondonweb.tabbedfragmentdemo.sections.weather

import android.content.Context
import android.content.Intent
import android.location.Geocoder
import android.location.Location
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.gson.Gson
import com.newlondonweb.tabbedfragmentdemo.R.layout.fragment_weather
import com.newlondonweb.tabbedfragmentdemo.sections.weather.weather.Weather
import kotlinx.android.synthetic.main.fragment_weather.*
import java.util.*


/**
 * A simple [Fragment] subclass.
 */
class WeatherFragment : Fragment() {
    companion object {
        fun newInstance() = WeatherFragment()
    }

    private val connectivityManager =
        this.parentFragment?.activity?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?

    private val fusedLocationClient: FusedLocationProviderClient by lazy {
        LocationServices.getFusedLocationProviderClient(this.requireActivity())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) =
        inflater.inflate(fragment_weather, container, false)!!

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        tv_Forcast.setOnClickListener { getWeather() }
        btn_Darksky.setOnClickListener { callDarkSky() }
        getWeather()
    }

    private fun callDarkSky() = fusedLocationClient.lastLocation.addOnSuccessListener {
        it ?: return@addOnSuccessListener
        Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://darksky.net/forecast/${it.latitude}%2C${it.longitude}/us12")
        ).also { startActivity(it) }
    }

    override fun onResume() = super.onResume().also { getWeather() }

    private fun getWeather() = fusedLocationClient.lastLocation
        .addOnSuccessListener { location: Location? ->
            location ?: return@addOnSuccessListener
            doHttpRequestForWeather(location)
        }

    private fun doHttpRequestForWeather(location: Location) {
        Volley.newRequestQueue(this.context).also {
            it.add(
                JsonObjectRequest(
                    Request.Method.GET,
                    "https://api.darksky.net/forecast/df21590bac42f7d8c00218ff445f6de7/${location.latitude},${location.longitude}",
                    null,
                    {
                        doDisplay(
                            Gson().fromJson(it.toString(), Weather::class.java),
                            location
                        )
                    },
                    { Log.d("TAG", it.toString()) })
            )
            it.start()
        }


    }


    private fun doDisplay(json: Weather, location: Location) {
        val unixSeconds: Long = json.currently.time.toLong()
        val date = Date(unixSeconds * 1000L)
        val sdfDate = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss z", Locale.US)
            .apply { timeZone = TimeZone.getDefault() }

        tv_Date.text = sdfDate.format(date)
        tv_City.text = try {
            Geocoder(this.context, Locale.US).getFromLocation(
                location.latitude,
                location.longitude,
                1
            )[0].locality
        } catch (e: Throwable) {
            "Default"
        }
        tv_Temp.text = "Current Temperature: ${json.currently.temperature.toString()}"
        tv_Precip.text = "Chance of rain: ${json.currently.precipProbability.toString()}"
        tv_Forcast.text = "${json.currently.summary}\n${json.hourly.summary}\n${json.daily.summary}"
    }
}
