package com.example.panaromaviewapp

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.vr.sdk.widgets.pano.VrPanoramaView
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var panoramaView: VrPanoramaView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        panoramaView = findViewById(R.id.viewPanaroma)
        loadPanoramaImage()
    }

    private fun loadPanoramaImage() {
        val options = VrPanoramaView.Options()
        try {
            options.inputType = VrPanoramaView.Options.TYPE_MONO
            panoramaView.loadImageFromBitmap(BitmapFactory.decodeResource(resources, R.drawable.panorama), options)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}