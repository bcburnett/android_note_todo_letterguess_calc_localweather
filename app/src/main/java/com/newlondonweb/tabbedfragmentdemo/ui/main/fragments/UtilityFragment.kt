package com.newlondonweb.tabbedfragmentdemo.ui.main.fragments

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import com.newlondonweb.tabbedfragmentdemo.R
import com.newlondonweb.tabbedfragmentdemo.R.layout.utility_fragment
import com.newlondonweb.tabbedfragmentdemo.viewModels.UtilityViewModel
import kotlinx.android.synthetic.main.utility_fragment.*

private const val REQUEST_IMAGE_CAPTURE = 1

class UtilityFragment : Fragment(), LifecycleOwner {

    companion object {
        fun newInstance() = UtilityFragment()
    }

    private val vm: UtilityViewModel by lazy {
        this.activity.let {
            ViewModelProvider(it!!).get(
                UtilityViewModel::class.java
            )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) =
        inflater.inflate(utility_fragment, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_TakePicture.setOnClickListener {
            startActivityForResult(
                Intent(MediaStore.ACTION_IMAGE_CAPTURE),
                REQUEST_IMAGE_CAPTURE
            )
        }

        btn_Call.setOnClickListener {
            try {
                startActivity(Intent(Intent.ACTION_DIAL))
            } catch (t:Throwable){
                (it as Button).isEnabled=false
                it.setBackgroundColor(
                Color.GRAY
            )
            }
            }

        btn_Recipe.setOnClickListener {
            launchApp("app.com.spoonacular",btn_Recipe)
        }

        btn_Images.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, MediaStore.Images.Media.INTERNAL_CONTENT_URI))
        }

        btn_BusMap.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://seatbuslive.com/map")))
        }

        btn_MusicPlayer.setOnClickListener {
            startActivity(Intent(MediaStore.INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH))
        }

        btn_Email.setOnClickListener {
            launchApp("com.google.android.gm",btn_Email)
        }

        btn_Ss.setOnClickListener {
            launchApp("com.stopandshop.mobile.droid",it as Button)
        }

        btn_Record.setOnClickListener {
            launchApp("com.sec.android.app.voicenote",it as Button)
        }



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when {
            requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK ->
                iv_cam.setImageBitmap(data?.extras?.get("data") as Bitmap)
        }
    }

    // Custom method to launch an app
    private fun launchApp(packageName: String,view: Button) {

        // Initialize a new Intent
        try {
            this.requireActivity()
                .applicationContext.startActivity(this.requireActivity().applicationContext.packageManager.getLaunchIntentForPackage(
                packageName
            )?.apply { addCategory(Intent.CATEGORY_LAUNCHER) })
        } catch (e:Throwable){
            view.isEnabled=false
            view.setBackgroundResource(
                R.color.colorPrimaryDark
            )
        }
    }
}

