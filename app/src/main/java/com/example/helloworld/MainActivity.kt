package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var minus = findViewById<Button>(R.id.buttonminus)
        var plus = findViewById<Button>(R.id.buttonplus)

        var display = findViewById<TextView>(R.id.text)

        minus.setOnClickListener {
            count--
            display.text = "$count"
        }

        plus.setOnClickListener {
            count++
            display.text = "$count"
        }
    }
}