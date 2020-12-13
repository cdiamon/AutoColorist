package com.cdiamon.autocolorist.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cdiamon.autocolorist.databinding.FragmentOsvaldBinding

class OsvaldFragment : Fragment() {

    private var _binding: FragmentOsvaldBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentOsvaldBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        fun newInstance(): OsvaldFragment {
            return OsvaldFragment()
        }
    }
}
