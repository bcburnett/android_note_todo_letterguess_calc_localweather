package com.newlondonweb.tabbedfragmentdemo.viewModels.BitmapOperations

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import java.io.FileOutputStream
import java.io.OutputStream
import kotlin.math.min

internal class SaveBitmap(private val path: String) : AsyncTask<Int, Void, Bitmap>() {


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
        ).apply {
            val out = FileOutputStream(path)
            compress(Bitmap.CompressFormat.WEBP, 50, out as OutputStream)
        }
    }
}

