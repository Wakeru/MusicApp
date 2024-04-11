package com.example.musicapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.navigation.findNavController

import androidx.appcompat.widget.SearchView

class SearchFragment : Fragment(){

    private lateinit var adapter: ArrayAdapter<*>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_search, container,false)
        val searchView = view.findViewById<SearchView>(R.id.searchView)
        val lv_listView = view.findViewById<ListView>(R.id.listView)

        val libraryButton = view.findViewById<Button>(R.id.libraryButton)
        libraryButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_searchFragment_to_libraryFragment)
        }


        adapter = ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1, resources.getStringArray(R.array.song_albums))
        lv_listView.adapter = adapter
        lv_listView.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            Toast.makeText(requireContext(), parent?.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
        }

        searchView.queryHint = "Search albums!"

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // this handles search query submission
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // this handles text changes in the search bar
                adapter.filter.filter(newText)
                return true
            }
        })


        return view
    }

}