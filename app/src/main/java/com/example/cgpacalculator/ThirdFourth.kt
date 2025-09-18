package com.example.cgpacalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdFourth : AppCompatActivity() {
    private lateinit var firstt: EditText
    private lateinit var secondd: EditText
    private lateinit var thirdd: EditText
    private lateinit var fourthh: EditText
    private lateinit var fifthh: EditText
    private lateinit var sixthh: EditText
    private lateinit var seventhh: EditText
    private lateinit var eighthh: EditText
    private lateinit var ninethh: EditText
    private lateinit var resultt: TextView
    private lateinit var calculatee: Button
    private lateinit var back: Button
    private lateinit var home: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thirdfour)
        firstt = findViewById(R.id.tt1)
        secondd = findViewById(R.id.tt2)
        thirdd = findViewById(R.id.tt3)
        fourthh = findViewById(R.id.tt4)
        fifthh = findViewById(R.id.tt5)
        sixthh = findViewById(R.id.tt6)
        seventhh = findViewById(R.id.tt7)
        eighthh = findViewById(R.id.tt8)
        ninethh = findViewById(R.id.tt9)
        calculatee = findViewById(R.id.calculate1)
        resultt = findViewById(R.id.result1)
        back = findViewById(R.id.back4)
        home = findViewById((R.id.home2))
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
            var i = ninethh.text.toString().trim().toIntOrNull() ?: 0

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
            i = toGrade(i)

            val sum = ((3 * a) + (4 * b) + (3 * c) + (3 * d) + (3 * e) + (3 * f) + (2 * g) + (2 * h) + (1 * i)) / 24
            resultt.text = sum.toString()
        }
    }
}
