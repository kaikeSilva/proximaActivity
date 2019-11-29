package com.example.proximaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var btn_proximo : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_proximo = findViewById(R.id.btnNext)

        btn_proximo.setOnClickListener {
            val i = Intent( this, Main2Activity::class.java)


            var parametros = Bundle()
            var inputTexto = findViewById<EditText>(R.id.frase).text.toString()

            parametros.putString("texto", inputTexto)

            i.putExtras(parametros)
            startActivity(i)



        }
    }
}
