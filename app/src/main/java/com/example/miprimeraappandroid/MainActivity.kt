package com.example.miprimeraappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var miString=""
    var miInt=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvInicio = findViewById<TextView>(R.id.tvInicio)
        savedInstanceState?.let {
            tvInicio.text = it.getString("MiClave")
        }

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        var etGuardar = findViewById<EditText>(R.id.etGuardar)
        outState.putString("MiClave",etGuardar.text.toString())
    }
}