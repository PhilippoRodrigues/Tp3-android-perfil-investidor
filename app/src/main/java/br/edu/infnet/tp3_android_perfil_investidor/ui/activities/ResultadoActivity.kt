package br.edu.infnet.tp3_android_perfil_investidor.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.edu.infnet.tp3_android_perfil_investidor.R
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var resultadoFinal: Int = 0

        textViewValorResultado.text = resultadoFinal.toString()
    }
}