package br.edu.infnet.tp3_android_perfil_investidor.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.navigation.fragment.findNavController
import br.edu.infnet.tp3_android_perfil_investidor.R
import br.edu.infnet.tp3_android_perfil_investidor.ui.activities.ResultadoActivity
import kotlinx.android.synthetic.main.activity_resultado.*
import kotlinx.android.synthetic.main.fragment_questao_um.*
class QuestaoUmFragment : Fragment() {

//    private lateinit var resultado : ResultadoActivity

//    private var pontuacao = 0

    lateinit var radioButton: RadioButton

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_um, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnQuestaoUmProximoFragment.setOnClickListener {
            // Getting the checked radio button id
            // from the radio group
            //val selectedOption: Int = radioGroupQuestaoUm!!.checkedRadioButtonId

            // Assigning id of the checked radio button
            //radioButton = radioGroupQuestaoUm.findViewById(selectedOption)

            // Displaying text of the checked radio button in the form of toast
            //Toast.makeText(requireContext(), radioButton.text, Toast.LENGTH_SHORT).show()


//            onRadioButtonClicked(view)
            println(onRadioButtonClicked().toString())

            findNavController().navigate(R.id.action_questaoUmFragment_to_questaoDoisFragment)
        }
    }

    private fun onRadioButtonClicked() : Int {
        var pontuacao = 0
        val selectedOption: Int = this.radioGroupQuestaoUm!!.checkedRadioButtonId
        radioButton = radioGroupQuestaoUm.findViewById(selectedOption)

        when (radioButton) {
            radioButtonQuestaoUmA ->
                pontuacao += 1

            radioButtonQuestaoUmB ->
                pontuacao += 2

            radioButtonQuestaoUmC ->
                pontuacao += 3

            radioButtonQuestaoUmD ->
                pontuacao += 4
        }
        return pontuacao
    }

}



