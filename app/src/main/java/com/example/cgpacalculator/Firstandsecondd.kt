package com.example.cgpacalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Firstandsecondd : AppCompatActivity() {
    private lateinit var f11sub: EditText
    private lateinit var f12sub: EditText
    private lateinit var f13sub: EditText
    private lateinit var f14sub: EditText
    private lateinit var f15sub: EditText
    private lateinit var f16sub: EditText
    private lateinit var f17sub: EditText
    private lateinit var f18sub: EditText
    private lateinit var firstresult: TextView
    private lateinit var firstcalculate: Button
    private lateinit var back: Button
    private lateinit var home: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.phychem)
        f11sub = findViewById(R.id.text11)
        f12sub = findViewById(R.id.text12)
        f13sub = findViewById(R.id.text13)
        f14sub = findViewById(R.id.text14)
        f15sub = findViewById(R.id.text15)
        f16sub = findViewById(R.id.text16)
        f17sub = findViewById(R.id.text17)
        f18sub = findViewById(R.id.text18)
        firstcalculate = findViewById(R.id.calculate11)
        firstresult = findViewById(R.id.result11)
        back = findViewById(R.id.back3)
        home = findViewById((R.id.home1))
        home.setOnClickListener {
            val srcintent = Intent(this, MainActivity::class.java)
            startActivity(srcintent)
        }
        back.setOnClickListener {
            val srcintent = Intent(this, Calculation::class.java)
            startActivity(srcintent)
        }
        firstcalculate.setOnClickListener {
            var a = f11sub.text.toString().trim().toIntOrNull() ?: 0
            var b = f12sub.text.toString().trim().toIntOrNull() ?: 0
            var c = f13sub.text.toString().trim().toIntOrNull() ?: 0
            var d = f14sub.text.toString().trim().toIntOrNull() ?: 0
            var e = f15sub.text.toString().trim().toIntOrNull() ?: 0
            var f = f16sub.text.toString().trim().toIntOrNull() ?: 0
            var g = f17sub.text.toString().trim().toIntOrNull() ?: 0
            var h = f18sub.text.toString().trim().toIntOrNull() ?: 0

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

            val sum1 = ((4 * a) + (4 * b) + (3 * c) + (3 * d) + (3 * e) + f + g + h) / 20
            firstresult.text = sum1.toString()
        }
    }
}
