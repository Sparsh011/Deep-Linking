package com.example.deeplinking

import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var messageTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        https://medium.com/androiddevelopers/the-deep-links-crash-course-part-1-introduction-to-deep-links-2189e509e269
//        Use this website to learn deep linking for android 12 onwards

        messageTV = findViewById(R.id.message_tv)

        // Get the intent data
        val data: Uri? = intent.data

        if (data != null) {
            // Get the value of the "param" parameter from the URL
            val paramValue = data.getQueryParameter("param")

            if (paramValue != null) {
                // Display the value in the TextView
                messageTV.text = "Parameter value: $paramValue"
            }
        }
    }
}
