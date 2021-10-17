package com.example.a3buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var ed1 :EditText
    lateinit var ed2 :EditText
    lateinit var ed3 :EditText
    lateinit var button1 :Button
    lateinit var button2 :Button
    lateinit var button3 :Button
    lateinit var tv :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ed1 = findViewById(R.id.ed1)
        ed2 = findViewById(R.id.ed2)
        ed3 = findViewById(R.id.ed3)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        tv = findViewById(R.id.tv)

        button1.setOnClickListener {
            val name = ed1.text.toString()
            val location = ed2.text.toString()
            val phone = ed3.text.toString()
            Toast.makeText(this, "Name: $name \nLocation: $location \nPhone: $phone", Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener {
            val name = ed1.text.toString()
            val location = ed2.text.toString()
            val phone = ed3.text.toString()
            tv.text="Name: $name \nLocation: $location \nPhone: $phone"
        }
        button3.setOnClickListener {
            val name = ed1.text.toString()
            val location = ed2.text.toString()
            val phone = ed3.text.toString()
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("name", name)
            intent.putExtra("location", location)
            intent.putExtra("phone", phone)
            startActivity(intent)
        }
    }

}