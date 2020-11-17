package br.edu.infnet.tp3_android_perfil_investidor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnComecarTelaInicial.setOnClickListener {
            val formPerguntas = Intent(this, FormPerguntasActivity ::class.java)
            startActivity(formPerguntas)
        }
    }
}