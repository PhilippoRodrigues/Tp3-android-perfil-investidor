package br.edu.infnet.tp3_android_perfil_investidor.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.edu.infnet.tp3_android_perfil_investidor.R
import br.edu.infnet.tp3_android_perfil_investidor.navigation.NavigateActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnComecarTelaInicial.setOnClickListener {
            val navigate = Intent(this, NavigateActivity ::class.java)
            startActivity(navigate)
        }
    }
}