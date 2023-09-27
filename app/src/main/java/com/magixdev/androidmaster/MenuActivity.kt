package com.magixdev.androidmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import android.content.Intent
import com.magixdev.androidmaster.firstapp.FirstAppActivity
import com.magixdev.androidmaster.imccalculator.IMCActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludApp = findViewById<AppCompatButton>(R.id.btnSaludApp)
        val btnIMCApp = findViewById<AppCompatButton>(R.id.btnIMCApp)
        btnSaludApp.setOnClickListener{navigateToSaludoApp()}
        btnIMCApp.setOnClickListener{navigateToImcApp()}
    }

    private fun navigateToImcApp(){
        val intent = Intent (this, IMCActivity::class.java)
    }

    private fun navigateToSaludoApp (){
        val intent = Intent (this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}