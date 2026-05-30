package com.noodle.aprimorando.ui.secao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.noodle.aprimorando.data.ConteudoSecoes
import com.noodle.aprimorando.databinding.FragmentSecaoBinding

/**
 * Tela genérica de seção informativa.
 *
 * Cada destino do menu lateral aponta para este mesmo fragment passando um
 * argumento `secaoId` (definido com defaultValue no grafo de navegação). O
 * conteúdo correspondente é buscado em [ConteudoSecoes]. Isso substitui as
 * telas duplicadas do template original por uma única tela reutilizável.
 */
class SecaoFragment : Fragment() {

    private var _binding: FragmentSecaoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecaoBinding.inflate(inflater, container, false)

        val secaoId = arguments?.getString("secaoId")
        val secao = secaoId?.let { ConteudoSecoes.mapa[it] }

        if (secao != null) {
            binding.tituloSecao.text = secao.titulo
            binding.corpoSecao.text = secao.corpo
        } else {
            binding.tituloSecao.text = getString(com.noodle.aprimorando.R.string.app_name)
            binding.corpoSecao.text = getString(com.noodle.aprimorando.R.string.secao_indisponivel)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
