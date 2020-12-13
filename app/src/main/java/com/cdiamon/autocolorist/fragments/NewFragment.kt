package com.cdiamon.autocolorist.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.cdiamon.autocolorist.R
import com.cdiamon.autocolorist.databinding.FragmentNewBinding

class NewFragment : Fragment() {

    private var _binding: FragmentNewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentNewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.inProgressTv.text = getText(R.string.fragmentOnConstruction)
        binding.inProgressTv.setTextColor(
                ContextCompat.getColor(requireContext(), android.R.color.holo_orange_dark))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        fun newInstance(): NewFragment {
            return NewFragment()
        }
    }
}
