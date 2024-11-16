package com.example.labtest02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class front : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front)

        var registernext = findViewById<Button>(R.id.registernext)
        registernext.setOnClickListener {
            var intent = Intent(this,coffee::class.java)
            startActivity(intent)
            finish()
        }


        var loginnext = findViewById<Button>(R.id.loginnext)
        loginnext.setOnClickListener {
            var intent = Intent(this,Newlogin::class.java)
            startActivity(intent)
            finish()
        }
    }
}