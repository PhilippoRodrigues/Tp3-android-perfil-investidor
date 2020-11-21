package br.edu.infnet.tp3_android_perfil_investidor.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.edu.infnet.tp3_android_perfil_investidor.R
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlinx.android.synthetic.main.fragment_dashboard.btnIniciarNavigate
import kotlinx.android.synthetic.main.fragment_questao_tres.*

class QuestaoTresFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_tres, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnQuestaoTresProximoFragment.setOnClickListener {
            findNavController().navigate(R.id.action_questaoTresFragment_to_questaoQuatroFragment)
        }
    }
}