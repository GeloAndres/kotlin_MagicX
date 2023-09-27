package com.magixdev.androidmaster.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.magixdev.androidmaster.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResul = findViewById<TextView>(R.id.tvResul)
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResul.text = "Hola, bienvenido $name :)"
    }
}