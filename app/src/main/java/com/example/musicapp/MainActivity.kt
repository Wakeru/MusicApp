package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import android.widget.TextView
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        //setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.MixMaker)

        val mmlogo: ImageView = findViewById(R.id.mmlogo)


        // Add to Playlist Button for Song 1
        val addToPlaylist1 = findViewById<Button>(R.id.addToPlaylist1)
        addToPlaylist1.setOnClickListener{
            Toast.makeText(applicationContext, "Lover added to your playlist", Toast.LENGTH_SHORT).show()
        }

        // Add to Playlist Button for Song 2
        val addToPlaylist2 = findViewById<Button>(R.id.addToPlaylist2)
        addToPlaylist2.setOnClickListener{
            Toast.makeText(applicationContext, "Perfect added to your playlist", Toast.LENGTH_SHORT).show()
        }

        // Add to Playlist Button for Song 3
        val addToPlaylist3 = findViewById<Button>(R.id.addToPlaylist3)
        addToPlaylist3.setOnClickListener{
            Toast.makeText(applicationContext, "Watermelon Sugar added to your playlist", Toast.LENGTH_SHORT).show()
        }
    }
}
