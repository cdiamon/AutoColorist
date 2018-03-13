package com.cdiamon.autocolorist.fragments

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

import com.cdiamon.autocolorist.R
import com.cdiamon.autocolorist.explistview.ActivitySearchGallery

class GalleryFragment : Fragment() {

    companion object {
        fun newInstance(): GalleryFragment {
            return GalleryFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        val goButton = view.findViewById<Button>(R.id.buttonGo)
        goButton.setOnClickListener {
            val intent = Intent(context, ActivitySearchGallery::class.java)
            Toast.makeText(context, R.string.fragmentGalleryToastGo, Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
        return view
    }
}
