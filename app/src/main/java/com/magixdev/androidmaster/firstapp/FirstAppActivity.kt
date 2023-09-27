package com.magixdev.androidmaster.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.magixdev.androidmaster.MenuActivity
import com.magixdev.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)
        val etFirs = findViewById<AppCompatEditText>(R.id.etFirs)
        val btnVolver = findViewById<AppCompatButton>(R.id.btnVolver)

        btnStart.setOnClickListener{
            val name = etName.text.toString()
            val firs = etFirs.text.toString()

            if(name.isNotEmpty() && firs.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }

        btnVolver.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        //al arrancar la pantalla

    }
}