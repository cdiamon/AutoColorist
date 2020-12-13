package com.cdiamon.autocolorist.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cdiamon.autocolorist.R
import com.cdiamon.autocolorist.databinding.FragmentTablesBinding
import com.cdiamon.autocolorist.tables.ConvertTablesActivity

class TablesFragment : Fragment() {

    private var _binding: FragmentTablesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentTablesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tablesButton.setOnClickListener {
            val intent = Intent(this@TablesFragment.context, ConvertTablesActivity::class.java)
            Toast.makeText(this@TablesFragment.context, R.string.fragmentTableToastGo, Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): TablesFragment {
            return TablesFragment()
        }
    }
}
