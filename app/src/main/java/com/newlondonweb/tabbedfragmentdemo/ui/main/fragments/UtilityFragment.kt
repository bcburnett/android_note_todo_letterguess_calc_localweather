package com.newlondonweb.tabbedfragmentdemo.ui.main.fragments

import android.app.Activity
import android.content.Context
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
import androidx.room.Room
import com.newlondonweb.tabbedfragmentdemo.R
import com.newlondonweb.tabbedfragmentdemo.R.layout.utility_fragment
import com.newlondonweb.tabbedfragmentdemo.data.AppDataBase
import com.newlondonweb.tabbedfragmentdemo.viewModels.UtilityViewModel
import kotlinx.android.synthetic.main.utility_fragment.*

private const val REQUEST_IMAGE_CAPTURE = 1

class UtilityFragment : Fragment(), LifecycleOwner {

    companion object {
        @Volatile
        private var INSTANCE: UtilityFragment? = null
        fun getInstance(): UtilityFragment {
            if(INSTANCE == null) INSTANCE=UtilityFragment()
            return INSTANCE as UtilityFragment
        }
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


    }

}

