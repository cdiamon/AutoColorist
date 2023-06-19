package com.cdiamon.autocolorist.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cdiamon.autocolorist.databinding.FragmentMapsBinding
import com.cdiamon.autocolorist.maps.MapsActivity

class MapsFragment : Fragment() {

    private var _binding: FragmentMapsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMapsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mapsGoButton.setOnClickListener {
            val intent = Intent(activity, MapsActivity::class.java)
            Toast.makeText(activity, "Go to alpha maps activity", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): MapsFragment {
            return MapsFragment()
        }
    }
}
