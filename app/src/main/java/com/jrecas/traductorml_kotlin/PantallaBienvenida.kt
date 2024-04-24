package com.jrecas.traductorml_kotlin

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PantallaBienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_bienvenida)
        splash()
    }

    fun splash() {
        object : CountDownTimer(3000, 1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
            //Cuando el tiempo llegue a 0 segundos
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            }

        }.start()

    }
}