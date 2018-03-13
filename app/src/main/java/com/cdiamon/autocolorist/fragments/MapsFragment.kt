package com.cdiamon.autocolorist.fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.cdiamon.autocolorist.R
import com.cdiamon.autocolorist.maps.MapsActivity

class MapsFragment : Fragment() {
    private var mListener: OnFragmentInteractionListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_maps, container, false)

        val goButton = view.findViewById<Button>(R.id.button_maps_go)
        goButton.setOnClickListener {
            val intent = Intent(activity, MapsActivity::class.java)
            Toast.makeText(activity, "Go to alpha maps activity", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        return view
    }

    fun onButtonPressed(uri: Uri) {
        if (mListener != null) {
            mListener!!.onFragmentInteraction(uri)
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            mListener = context
        } else {
            throw RuntimeException(context!!.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {

        fun newInstance(): MapsFragment {
            return MapsFragment()
        }
    }
}
