package com.example.actividadsuplementaria

import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDate
import java.util.Date
import java.util.Locale


class window3 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window3)
        ventanaRegresar2()
        mostrarFecha()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun mostrarFecha(){
        val fecha = findViewById<TextView>(R.id.textView4)
        val mostrarFecha = findViewById<Button>(R.id.btnMostrarFecha)



        mostrarFecha.setOnClickListener(){
            val current = Calendar.getInstance().time
            val formatter = SimpleDateFormat.getDateTimeInstance()
            val formattedDate = formatter.format(current)
            fecha.text = formattedDate
        }
    }

    fun ventanaRegresar2(){
        val botonRegresar2 = findViewById<Button>(R.id.btnRegresar2)
        botonRegresar2.setOnClickListener(){
            val saltarVentanaRegresar2: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltarVentanaRegresar2)
        }
    }

}