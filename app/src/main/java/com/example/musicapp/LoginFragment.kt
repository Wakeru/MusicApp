package com.example.musicapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.Button
import androidx.navigation.findNavController

class LoginFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val loginButton = view.findViewById<Button>(R.id.loginB)
        loginButton.setOnClickListener{
            view.findNavController()
                .navigate(R.id.action_loginFragment_to_searchFragment)
        }
       /* val signupButton = view.findViewById<Button>(R.id.signupB)
        signupButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_loginFragment_to_searchFragment)     //possibly make this do a different action to a signup page instead but this is placeholder for now
        }*/

        return view
    }
}