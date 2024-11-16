package com.example.labtest02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class coffee : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee)

        var signupnext55 = findViewById<Button>(R.id.signin12)
        signupnext55.setOnClickListener {
            var intent = Intent(this,Newlogin::class.java)
            startActivity(intent)
            finish()
        }
        var registerbackbtn = findViewById<Button>(R.id.registerbackbtn)
        registerbackbtn.setOnClickListener {
            var intent = Intent(this,front::class.java)
            startActivity(intent)
            finish()
        }
    }
}