package com.example.temperature_convertor

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var celsius : EditText
    private lateinit var fahrenheit: TextView
    private lateinit var convert: Button
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fahrenheit=findViewById(R.id.fahrenheit)
        celsius=findViewById(R.id.celsius)

        convert=findViewById(R.id.convert)

        convert.setOnClickListener {
            val c = celsius.text.toString()

            if(c.isNotEmpty()) {

                val cValue = c.toDouble()
                val fValue = (cValue * 9 / 5) + 32
                fahrenheit.text= "$fValue°F"

            }else
            {
               Toast.makeText(applicationContext,"Please Enter The Value",Toast.LENGTH_SHORT).show()
            }


        }
    }
}