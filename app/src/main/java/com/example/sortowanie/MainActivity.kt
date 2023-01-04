package com.example.sortowanie

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
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
            text.text = ""
            for (int in 1..edit.text.toString().toInt()) {
                val a = (0..100).random()
                text.append(a.toString())
            }
        }

        findViewById<Button>(R.id.sortujBtn).setOnClickListener {

        }
        fun quicksort(items: List<Int>): List<Int> {
            if (items.size <= 1) {
                return items
            }
            val chosenItem: Int = items[items.size / 2]

            val smallerList: MutableList<Int> = mutableListOf()
            val equalist: MutableList<Int> = mutableListOf()
            val greaterList: MutableList<Int> = mutableListOf()
            items.forEach{
                when{
                    it<chosenItem -> {smallerList.add(it);findViewById<ProgressBar>(R.id.progressBar).progress +=1}
                    it<chosenItem -> {greaterList.add(it);findViewById<ProgressBar>(R.id.progressBar).progress +=1}
                    else -> {equalist.add(it); findViewById<ProgressBar>(R.id.progressBar).progress +1}
                }
            }
            val sortedList: MutableList<Int> = mutableListOf()
            sortedList.addAll(quicksort(smallerList))
            sortedList.addAll(equalist)
            sortedList.addAll(quicksort(greaterList))
            return sortedList
        }
    }
}
