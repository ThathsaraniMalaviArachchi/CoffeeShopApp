package com.example.labtest02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Newlogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newlogin)

        var signup = findViewById<Button>(R.id.signup)
        signup.setOnClickListener {
            var intent = Intent(this,coffee::class.java)
            startActivity(intent)
            finish()
        }

        var signin12 = findViewById<Button>(R.id.signin12)
        signin12.setOnClickListener {
            var intent = Intent(this,Main::class.java)
            startActivity(intent)
            finish()
        }
    }
}