package com.newlondonweb.tabbedfragmentdemo.notes.BitmapOperations

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.widget.ImageView
import java.lang.ref.WeakReference
import kotlin.math.min

internal class GetBitmap(imageView: ImageView, private val path: String) : AsyncTask<Int, Void, Bitmap>() {

    private val imageViewReference: WeakReference<ImageView>?

    private val rotation = when{android.os.Build.MANUFACTURER=="samsung"->90;else->0}

    override fun doInBackground(vararg p0: Int?): Bitmap {
        val bmOptions = BitmapFactory.Options().apply {
            // Get the dimensions of the bitmap
            inJustDecodeBounds = true
            val photoW: Int = outWidth
            val photoH: Int = outHeight

            // Determine how much to scale down the image
            val scaleFactor: Int = min(photoW / 300, photoH / 300)

            // Decode the image file into a Bitmap sized to fill the View
            inJustDecodeBounds = false
            inSampleSize = scaleFactor
        }
        return BitmapFactory.decodeFile(
            path,
            bmOptions
        )
    }

    init {
        imageViewReference = WeakReference(imageView)
    }


    // Once complete, see if ImageView is still around and set bitmap.
    override fun onPostExecute(bitmap: Bitmap?) {
        if (imageViewReference != null && bitmap != null) {
            val imageView = imageViewReference.get()
            imageView?.rotation=rotation.toFloat()
            imageView?.setImageBitmap(bitmap)
        }
    }
}