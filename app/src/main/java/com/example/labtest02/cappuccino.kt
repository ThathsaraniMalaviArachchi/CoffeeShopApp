package com.example.labtest02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cappuccino : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cappuccino)

        var capbackbtn = findViewById<Button>(R.id.capbackbtn)
        capbackbtn.setOnClickListener {
            var intent = Intent(this,Main::class.java)
            startActivity(intent)
            finish()
        }
    }
}