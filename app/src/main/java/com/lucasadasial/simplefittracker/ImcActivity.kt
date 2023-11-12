package com.lucasadasial.simplefittracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class ImcActivity : AppCompatActivity() {

    private lateinit var  editWeight: EditText
    private lateinit var  editHeight: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        editWeight = findViewById(R.id.editTextWeight)
        editHeight = findViewById(R.id.editTextHeight)

        val btnCalculate = findViewById<Button>(R.id.btn_calculate)
    }
}