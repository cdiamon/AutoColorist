package com.cdiamon.autocolorist.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cdiamon.autocolorist.R
import com.cdiamon.autocolorist.databinding.FragmentGalleryBinding
import com.cdiamon.autocolorist.explistview.SearchGalleryActivity

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goButton.setOnClickListener {
            val intent = Intent(context, SearchGalleryActivity::class.java)
            Toast.makeText(context, R.string.fragmentGalleryToastGo, Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): GalleryFragment {
            return GalleryFragment()
        }
    }
}
