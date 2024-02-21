package com.example.musicapp

import android.health.connect.datatypes.units.Length
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton = findViewById<ImageButton>(R.id.search)
        searchButton.setOnClickListener{
            Toast.makeText(applicationContext,"You got me, you actually f****ing got me... how dare you...",Toast.LENGTH_LONG).show()
            //this on click tells what the button gonna do
            //if we make another activity, it launches a whole new window for the activity
            // so we need to do something in this activity...
        }

        val folderButton = findViewById<ImageButton>(R.id.add)
        folderButton.setOnClickListener{

        }


        val textSearchInput = findViewById<EditText>(R.id.editTextText)

    }
}