package com.example.labtest02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class profile2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)

        var homebtn = findViewById<ImageView>(R.id.homebtn)
        homebtn.setOnClickListener {
            var intent = Intent(this,Main::class.java)
            startActivity(intent)
            finish()
        }
    }
}