package com.chinenyeakukalia.media_player
import android.net.Uri.*
import android.net.Uri
import android.widget.VideoView
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val videoView = findViewById<VideoView>(R.id.testView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val uri: Uri = parse(
            "android.resource://" + packageName
                    + "/raw/test"
        )
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.start()

    }
}