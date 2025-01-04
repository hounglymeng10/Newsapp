package com.example.thenewsapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.thenewsapp.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Initialize UI elements
        val profilePicture: ImageView = view.findViewById(R.id.profileFragment)
        val userName: TextView = view.findViewById(R.id.tvUserName)
        val userEmail: TextView = view.findViewById(R.id.tvUserEmail)
        val editProfileButton: Button = view.findViewById(R.id.btnEditProfile)
        val settings: TextView = view.findViewById(R.id.tvSettings)
        val privacyPolicy: TextView = view.findViewById(R.id.tvPrivacyPolicy)
        val logOut: TextView = view.findViewById(R.id.tvLogOut)

        // Set example data (replace this with real data from your app)
        userName.text = "John Doe"
        userEmail.text = "john.doe@example.com"

        // Set click listeners
        profilePicture.setOnClickListener {
            Toast.makeText(requireContext(), "Change Profile Picture", Toast.LENGTH_SHORT).show()
        }

        editProfileButton.setOnClickListener {
            Toast.makeText(requireContext(), "Edit Profile Clicked", Toast.LENGTH_SHORT).show()
            // Navigate to Edit Profile screen (if applicable)
        }

        settings.setOnClickListener {
            Toast.makeText(requireContext(), "Settings Clicked", Toast.LENGTH_SHORT).show()
            // Navigate to Settings screen
        }

        privacyPolicy.setOnClickListener {
            Toast.makeText(requireContext(), "Privacy Policy Clicked", Toast.LENGTH_SHORT).show()
            // Navigate to Privacy Policy screen or open link
        }

        logOut.setOnClickListener {
            Toast.makeText(requireContext(), "Log Out Clicked", Toast.LENGTH_SHORT).show()
            // Handle logout logic here
        }

        return view
    }
}
