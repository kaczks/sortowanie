package com.example.sortowanie

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit = findViewById<EditText>(R.id.liczbyED)
        val text = findViewById<TextView>(R.id.WpyiszTW)

        findViewById<Button>(R.id.losujBtn).setOnClickListener {
            val rand = Random()
            text.text=""
            for (int in 1 .. edit.text.toString().toInt() ) {
                val a = (0 ..100).random()
                text.append(a.toString())
            }
        }

        findViewById<Button>(R.id.sortujBtn).setOnClickListener {

        }
    }
}
