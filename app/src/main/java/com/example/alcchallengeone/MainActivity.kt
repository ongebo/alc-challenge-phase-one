package com.example.alcchallengeone

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutALCButton: Button = findViewById(R.id.about_button)
        aboutALCButton.setOnClickListener { showAboutALCScreen() }
    }

    fun showAboutALCScreen() {
        val intent = Intent(this, AboutALCActivity::class.java)
        startActivity(intent)
    }
}
