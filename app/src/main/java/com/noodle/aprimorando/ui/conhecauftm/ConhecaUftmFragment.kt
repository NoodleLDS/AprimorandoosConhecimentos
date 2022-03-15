package com.noodle.aprimorando.ui.conhecauftm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.noodle.aprimorando.databinding.FragmentConhecaAprimorandoBinding
import com.noodle.aprimorando.databinding.FragmentConhecaUftmBinding

class ConhecaFragment : Fragment() {

    private lateinit var conhecaUftmViewModel: ConhecaUftmViewModel
    private var _binding: FragmentConhecaUftmBinding? = null


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        conhecaUftmViewModel =
            ViewModelProvider(this).get(ConhecaUftmViewModel::class.java)

        _binding = FragmentConhecaUftmBinding.inflate(inflater, container, false)
        val telaconhecaUFTM: View = binding.root

        // NÃO ESTÁ JOGANDO ESSA TELA PRA VIEW
        return telaconhecaUFTM
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}