package com.noodle.aprimorando.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.noodle.aprimorando.R
import com.noodle.aprimorando.databinding.FragmentConhecaAprimorandoBinding
import com.noodle.aprimorando.databinding.FragmentConhecaUftmBinding

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel
    private var _binding: FragmentConhecaAprimorandoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


}