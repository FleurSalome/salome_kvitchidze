package com.example.salome_kvitchidze

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActButton = findViewById<Button>(R.id.nextButton)
        secondActButton.setOnClickListener {
            val intent = Intent(this, secondActButton::class.java)
            startActivity(intent)


        }
    }
}