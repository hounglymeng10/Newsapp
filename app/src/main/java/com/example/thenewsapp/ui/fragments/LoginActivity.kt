package com.example.thenewsapp.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.thenewsapp.databinding.ActivityLoginBinding
import com.example.thenewsapp.ui.NewsActivity
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.register.setOnClickListener{

            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }

        binding.getInBnt.setOnClickListener {
            val email = binding.email.text.toString().trim()
            val pass = binding.password.text.toString().trim()

            if (email.isNotEmpty() && pass.isNotEmpty()) {
                firebaseAuth.signInWithEmailAndPassword(email, pass)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            val user = firebaseAuth.currentUser
                            val userName = user?.displayName ?: "No Name"
                            val userEmail = user?.email ?: "No Email"

                            // Show a success message
                            Toast.makeText(this, "Login successful! Welcome, $userName", Toast.LENGTH_SHORT).show()

                            val intent = Intent(this, NewsActivity::class.java).apply {
                                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                                putExtra("USER_NAME", userName)
                                putExtra("USER_EMAIL", userEmail)
                            }
                            startActivity(intent)
                        } else {
                            val errorMessage = task.exception?.localizedMessage ?: "Login failed!"
                            Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
                        }
                    }
            } else {
                Toast.makeText(this, "Empty fields are not allowed!", Toast.LENGTH_SHORT).show()
            }
        }




    }
}