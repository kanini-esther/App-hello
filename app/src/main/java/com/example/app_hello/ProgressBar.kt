package com.example.app_hello

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_progress_bar.*

class ProgressBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)

        progressBar.max= 1000
        var currentProgressBar = 600
        ObjectAnimator.ofInt(progressBar,  "progress", CoursesActivity)
            .setDuration(1000)
            .start()
    }
}