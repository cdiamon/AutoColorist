package com.cdiamon.autocolorist.maps

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.cdiamon.autocolorist.R
import com.cdiamon.autocolorist.databinding.FragmentMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MapsFragment : Fragment(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private var _binding: FragmentMapsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMapsBinding.inflate(inflater, container, false)

        val mapFragment = childFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment

        mapFragment.getMapAsync(this)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        checkLocationPermission()
    }

    override fun onMapReady(googleMap: GoogleMap) {

        mMap = googleMap
        mMap.setOnCameraIdleListener {
            println("cdiamon ${mMap.cameraPosition.target}")
        }

        updateLocationUI()

//        val volgacolor = LatLng(59.4250, 24.7490) // Tallinn
        val volgacolor = LatLng(51.5747, 46.0258) // Saratov
        mMap.addMarker(MarkerOptions().position(volgacolor).title("Volgacolor"))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(volgacolor, 17f))
    }


    private fun updateLocationUI() {
        try {
            if (isLocationPermissionGranted()) {
                mMap.isMyLocationEnabled = true
                mMap.uiSettings.isMyLocationButtonEnabled = true
            } else {
                mMap.isMyLocationEnabled = false
                mMap.uiSettings.isMyLocationButtonEnabled = false
            }
        } catch (e: SecurityException) {
            Log.e("Exception: %s", e.message!!)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun isLocationPermissionGranted(): Boolean {
        return ContextCompat.checkSelfPermission(
            requireContext(),
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
    }

    private fun checkLocationPermission() {
        if (!isLocationPermissionGranted()) {
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                1
            );
        } else {
            //Do the stuff that requires permission...
        }

        if (shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_FINE_LOCATION)) {
            locationPermissionRequest.launch(
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                )
            )
        }

    }

    private val locationPermissionRequest = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        when {
            permissions[Manifest.permission.ACCESS_FINE_LOCATION] == true &&
                    permissions[Manifest.permission.ACCESS_COARSE_LOCATION] == true -> {
                Toast.makeText(requireContext(), "Location permission granted", Toast.LENGTH_SHORT)
                    .show()
            }

            else -> {
                Toast.makeText(requireContext(), "Location permission denied", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    companion object {
        fun newInstance(): MapsFragment {
            return MapsFragment()
        }
    }
}
