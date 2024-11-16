package com.example.labtest02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Main : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var profilebtn = findViewById<ImageView>(R.id.profilebtn)
        profilebtn.setOnClickListener {
            var intent = Intent(this,profile2::class.java)
            startActivity(intent)
            finish()
        }

        var OatMilkBtn = findViewById<TextView>(R.id.OatMilkBtn)
        OatMilkBtn.setOnClickListener {
            var intent = Intent(this,cappuccino::class.java)
            startActivity(intent)
            finish()
        }

    }
}