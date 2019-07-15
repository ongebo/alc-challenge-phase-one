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
        val myProfileButton: Button = findViewById(R.id.profile_button)
        aboutALCButton.setOnClickListener { showAboutALCScreen() }
        myProfileButton.setOnClickListener { showProfileScreen() }
    }

    private fun showAboutALCScreen() {
        val intent = Intent(this, AboutALCActivity::class.java)
        startActivity(intent)
    }

    private fun showProfileScreen() {
        val intent = Intent(this, MyProfileActivity::class.java)
        startActivity(intent)
    }
}
