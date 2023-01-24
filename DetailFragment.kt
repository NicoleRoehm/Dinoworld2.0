package com.example.dino_eggs.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.dino_eggs.data.Model.Dinos
import com.example.dino_eggs.databinding.FragmentDetailBinding

class DetailFragment: Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val dino = requireArguments().getParcelable<Dinos>("dino")

        if (dino != null) {
            binding.detailDinoImage.setImageResource(dino.imageResource)
        }
        if (dino != null) {
            binding.detailDinoNameText.text = dino.name
        }
        if (dino != null) {
            binding.detailPreisText.text = "${dino.priceResource.toString()} Euro"
        }


        binding.detailBuyButton.setOnClickListener {
            Toast.makeText(requireContext(), "you get buy ${dino?.name}", Toast.LENGTH_SHORT)
                .show()
        }


    }
}

