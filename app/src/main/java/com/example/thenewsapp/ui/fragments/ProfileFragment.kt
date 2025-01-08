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
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Initialize UI elements
        val profilePicture: ImageView = view.findViewById(R.id.ProfilePicture)
        val userName: TextView = view.findViewById(R.id.tvUserName)
        val userEmail: TextView = view.findViewById(R.id.tvUserEmail)
        val editProfileButton: Button = view.findViewById(R.id.btnEditProfile)
        val settings: TextView = view.findViewById(R.id.tvSettings)
        val privacyPolicy: TextView = view.findViewById(R.id.tvPrivacyPolicy)
        val logOut: TextView = view.findViewById(R.id.tvLogOut)

        // Set example data (replace with real data from your app)
        userName.text = "John Doe"
        userEmail.text = "john.doe@example.com"

        // Set click listeners
        profilePicture.setOnClickListener { onChangeProfilePicture() }
        editProfileButton.setOnClickListener { onEditProfile() }
        settings.setOnClickListener { onSettingsClicked() }
        privacyPolicy.setOnClickListener { onPrivacyPolicyClicked() }
        logOut.setOnClickListener { onLogOutClicked() }

        return view
    }

    private fun onChangeProfilePicture() {
        Toast.makeText(requireContext(), "Change Profile Picture", Toast.LENGTH_SHORT).show()
        // Add logic to update the profile picture
    }

    private fun onEditProfile() {
        Toast.makeText(requireContext(), "Edit Profile Clicked", Toast.LENGTH_SHORT).show()
        // Navigate to Edit Profile screen
    }

    private fun onSettingsClicked() {
        Toast.makeText(requireContext(), "Settings Clicked", Toast.LENGTH_SHORT).show()
        // Navigate to Settings screen
    }

    private fun onPrivacyPolicyClicked() {
        Toast.makeText(requireContext(), "Privacy Policy Clicked", Toast.LENGTH_SHORT).show()
        // Navigate to Privacy Policy screen or open a link
    }

    private fun onLogOutClicked() {
        Toast.makeText(requireContext(), "Log Out Clicked", Toast.LENGTH_SHORT).show()
        // Handle logout logic (e.g., clear user data, navigate to login screen)
    }
}