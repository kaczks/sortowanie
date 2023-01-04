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

        findViewById<Button>(R.id.sortujBtn).setOnClickListener {
            val rand = Random()
            for (int in 1 .. edit.text.toString().toInt() ) {
                val a = rand.nextInt(edit.text.toString().toInt())
                findViewById<TextView>(R.id.WpyiszTW).append(a.toString())
            }
        }
    }
}
