package com.dylan.medidate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dylan.medidate.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /**/
        binding.btnAceptar.setOnClickListener {
            Toast.makeText(applicationContext, "¡Datos registrados!", Toast.LENGTH_SHORT).show()
        }
        binding.btnSalir.setOnClickListener {
            Toast.makeText(applicationContext, "¡Saliendo de la aplicación!", Toast.LENGTH_LONG).show()
        }
    }
}