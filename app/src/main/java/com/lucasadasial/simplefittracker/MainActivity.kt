package com.lucasadasial.simplefittracker


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnImc = findViewById<LinearLayout>(R.id.btn_imc)
        val intentImc = Intent(this,ImcActivity::class.java)

        btnImc.setOnClickListener {
            startActivity(intentImc)
        }
    }


}