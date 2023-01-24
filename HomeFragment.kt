package com.example.dino_eggs.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dino_eggs.adapter.DinoAdapter
import com.example.dino_eggs.data.DataSource
import com.example.dino_eggs.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val datasource = DataSource()

        val dinoList = datasource.getDinos()

        binding.homeDinoRecyclerview.adapter = DinoAdapter(requireContext(), dinoList)
    }
}