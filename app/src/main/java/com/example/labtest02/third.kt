package com.example.labtest02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val button = findViewById<Button>(R.id.thirdnext)
        button.setOnClickListener {
            val intent = Intent(this, front::class.java)
            startActivity(intent)
        }
    }
}