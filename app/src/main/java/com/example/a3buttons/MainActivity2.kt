package com.example.a3buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //get data from intent
        val intent = intent
        val name = intent.getStringExtra("name")
        val location = intent.getStringExtra("Location")
        val phone = intent.getStringExtra("phone")

        //textview
        val resultTv = findViewById<TextView>(R.id.textView)
        //setText
        resultTv.text = "Name: "+name+"\nLocation: "+location+"\nPhone: "+phone
    }
}