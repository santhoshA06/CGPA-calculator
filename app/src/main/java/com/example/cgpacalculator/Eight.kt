package com.example.cgpacalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Eight : AppCompatActivity() {
    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var et3: EditText
    private lateinit var et4: EditText
    private lateinit var et5: EditText
    private lateinit var et6: EditText
    private lateinit var resultt: TextView
    private lateinit var calculatee: Button
    private lateinit var back: Button
    private lateinit var home: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.eighth)
        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        et3 = findViewById(R.id.et3)
        et4 = findViewById(R.id.et4)
        et5 = findViewById(R.id.et5)
        et6 = findViewById(R.id.et6)
        calculatee = findViewById(R.id.calculate3)
        resultt = findViewById(R.id.result2)
        back = findViewById(R.id.back5)
        home = findViewById(R.id.home3)

        calculatee.setOnClickListener {
            var a = et1.text.toString().trim().toIntOrNull() ?: 0
            var b = et2.text.toString().trim().toIntOrNull() ?: 0
            var c = et3.text.toString().trim().toIntOrNull() ?: 0
            var d = et4.text.toString().trim().toIntOrNull() ?: 0
            var e = et5.text.toString().trim().toIntOrNull() ?: 0
            var f = et6.text.toString().trim().toIntOrNull() ?: 0

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

            val sum = ((3 * a) + (3 * b) + (3 * c) + (3 * d) + (2 * e) + (2 * f)) / 16
            resultt.text = sum.toString()
        }
    }
}
