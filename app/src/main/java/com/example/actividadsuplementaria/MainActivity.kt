package com.example.actividadsuplementaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ventanaBienvenido()
        ventanaFecha()
    }

    fun ventanaBienvenido(){
        val botonBienvenido = findViewById<Button>(R.id.btnBienvenido)
        botonBienvenido.setOnClickListener(){
            val saltarVentanaBienvenido: Intent = Intent(this, window2::class.java)
            startActivity(saltarVentanaBienvenido)
        }
    }


    fun ventanaFecha(){
        val botonFecha = findViewById<Button>(R.id.btnFecha)
        botonFecha.setOnClickListener(){
            val saltarVentanaFecha: Intent = Intent(this, window3::class.java)
            startActivity(saltarVentanaFecha)
        }
    }
}