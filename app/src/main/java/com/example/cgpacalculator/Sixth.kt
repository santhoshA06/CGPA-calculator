package com.example.cgpacalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Sixth : AppCompatActivity() {
    private lateinit var firstt: EditText
    private lateinit var secondd: EditText
    private lateinit var thirdd: EditText
    private lateinit var fourthh: EditText
    private lateinit var fifthh: EditText
    private lateinit var sixthh: EditText
    private lateinit var seventhh: EditText
    private lateinit var eighthh: EditText
    private lateinit var resultt: TextView
    private lateinit var calculatee: Button
    private lateinit var back: Button
    private lateinit var home: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sixthsem)
        firstt = findViewById(R.id.tttt1)
        secondd = findViewById(R.id.tttt2)
        thirdd = findViewById(R.id.tttt3)
        fourthh = findViewById(R.id.tttt4)
        fifthh = findViewById(R.id.tttt5)
        sixthh = findViewById(R.id.tttt6)
        seventhh = findViewById(R.id.tttt7)
        eighthh = findViewById(R.id.tttt8)
        calculatee = findViewById(R.id.calculate4)
        resultt = findViewById(R.id.result3)
        back = findViewById(R.id.back6)
        home = findViewById((R.id.home4))
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
            var h = eighthh.text.toString().trim().toIntOrNull() ?: 0

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
            h = toGrade(h)

            val sum = ((4 * a) + (4 * b) + (4 * c) + (3 * d) + (3 * e) + (2 * f) + (2 * g) + (2 * h)) / 24
            resultt.text = sum.toString()
        }
    }
}
