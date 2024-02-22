package com.example.musicapp

import android.annotation.SuppressLint
import android.health.connect.datatypes.units.Length
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton = findViewById<ImageButton>(R.id.search)
        searchButton.setOnClickListener{
            Toast.makeText(applicationContext,"You click search button",Toast.LENGTH_LONG).show() //idk what applicationContext is...
            //this on click tells what the button is gonna do
            //if we make another activity, it launches a whole new window for the activity
            // so we need to do something in this activity...
        }

        val addButton = findViewById<ImageButton>(R.id.add)
        addButton.setOnClickListener{
            Toast.makeText(applicationContext,"You clicked Add Folder Button",Toast.LENGTH_LONG).show()
        }

        val folderButton = findViewById<ImageButton>(R.id.folder)
        folderButton.setOnClickListener{
            Toast.makeText(applicationContext,"You clicked MixTape",Toast.LENGTH_LONG).show()
        }

        val folderButton2 = findViewById<ImageButton>(R.id.folder2)
        folderButton2.setOnClickListener{
            Toast.makeText(applicationContext,"You clicked Soda Pop Music Folder",Toast.LENGTH_LONG).show()
        }


        val textSearchInput = findViewById<EditText>(R.id.editTextText)

    }
}