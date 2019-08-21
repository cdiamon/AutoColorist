package com.cdiamon.autocolorist.fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cdiamon.autocolorist.R
import com.cdiamon.autocolorist.tables.ActivityConvertTables

class TablesFragment : Fragment() {
    private var mListener: OnFragmentInteractionListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_tables, container, false)

        val goButton = view.findViewById<View>(R.id.tables_button_go) as Button
        goButton.setOnClickListener {
            val intent = Intent(this@TablesFragment.context, ActivityConvertTables::class.java)
            Toast.makeText(this@TablesFragment.context, R.string.fragmentTableToastGo, Toast.LENGTH_SHORT).show()
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

        fun newInstance(): TablesFragment {
            return TablesFragment()
        }
    }
}
