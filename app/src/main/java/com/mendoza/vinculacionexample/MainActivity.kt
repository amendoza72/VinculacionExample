package com.mendoza.vinculacionexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mendoza.vinculacionexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var enlace: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enlace = ActivityMainBinding.inflate(layoutInflater)
        val vistaPrincipal = enlace.root
        setContentView(vistaPrincipal)

        enlace.helloWorld.text = "Hola!!!"
    }
}