package com.example.cgpacalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Seventh : AppCompatActivity() {
    private lateinit var firstt: EditText
    private lateinit var secondd: EditText
    private lateinit var thirdd: EditText
    private lateinit var fourthh: EditText
    private lateinit var fifthh: EditText
    private lateinit var sixthh: EditText
    private lateinit var seventhh: EditText
    private lateinit var resultt: TextView
    private lateinit var calculatee: Button
    private lateinit var back: Button
    private lateinit var home: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seventh)
        firstt = findViewById(R.id.ttttt1)
        secondd = findViewById(R.id.ttttt2)
        thirdd = findViewById(R.id.ttttt3)
        fourthh = findViewById(R.id.ttttt4)
        fifthh = findViewById(R.id.ttttt5)
        sixthh = findViewById(R.id.ttttt6)
        seventhh = findViewById(R.id.ttttt7)
        calculatee = findViewById(R.id.calculate5)
        resultt = findViewById(R.id.result4)
        back = findViewById(R.id.back7)
        home = findViewById(R.id.home5)
        home.setOnClickListener {
            val srcintent = Intent(this, MainActivity::class.java)
            startActivity(srcintent)
        }
        back.setOnClickListener {
            val srcintent = Intent(this, Calculation::class.java)
            startActivity(srcintent)
        }
        calculatee.setOnClickListener {
            var a = firstt.text.toString().trim().toIntOrNull() ?: 0
            var b = secondd.text.toString().trim().toIntOrNull() ?: 0
            var c = thirdd.text.toString().trim().toIntOrNull() ?: 0
            var d = fourthh.text.toString().trim().toIntOrNull() ?: 0
            var e = fifthh.text.toString().trim().toIntOrNull() ?: 0
            var f = sixthh.text.toString().trim().toIntOrNull() ?: 0
            var g = seventhh.text.toString().trim().toIntOrNull() ?: 0

            fun toGrade(value: Int): Int = when (value) {
                in 91..100 -> 10
                in 81..90 -> 9
                in 71..80 -> 8
                in 61..70 -> 7
                in 51..60 -> 6
                in 41..50 -> 5
                in 33..40 -> 4
                else -> 0
            }

            a = toGrade(a)
            b = toGrade(b)
            c = toGrade(c)
            d = toGrade(d)
            e = toGrade(e)
            f = toGrade(f)
            g = toGrade(g)

            val sum = ((4 * a) + (4 * b) + (3 * c) + (3 * d) + (3 * e) + (2 * f) + (1 * g)) / 20
            resultt.text = sum.toString()
        }
    }
}
