package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController


class LibraryFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_library,container,false)
        val backButton = view.findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener{
            view.findNavController()
                .navigate(R.id.action_libraryFragment_to_searchFragment)
        }

        // Setup Toolbar
        //val toolbar: Toolbar = view.findViewById(R.id.toolbar)
        //setSupportActionBar(toolbar)
        activity?.title = getString(R.string.MixMaker)

        //val mmlogo: ImageView = view.findViewById(R.id.mmlogo)

/* NOT USED FOR NOW
        // Add to Playlist Button for Song 1
        val addToPlaylist1 = view.findViewById<Button>(R.id.addToPlaylist1)
        addToPlaylist1.setOnClickListener{
            Toast.makeText(requireContext(), "Lover added to your playlist", Toast.LENGTH_SHORT).show()
        }

        // Add to Playlist Button for Song 2
        val addToPlaylist2 = view.findViewById<Button>(R.id.addToPlaylist2)
        addToPlaylist2.setOnClickListener{
            Toast.makeText(requireContext(), "Perfect added to your playlist", Toast.LENGTH_SHORT).show()
        }

        // Add to Playlist Button for Song 3
        val addToPlaylist3 = view.findViewById<Button>(R.id.addToPlaylist3)
        addToPlaylist3.setOnClickListener{
            Toast.makeText(requireContext(), "Watermelon Sugar added to your playlist", Toast.LENGTH_SHORT).show()
        }
*/


        return  view
    }
}