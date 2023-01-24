package com.example.dino_eggs.data

import com.example.dino_eggs.R
import com.example.dino_eggs.data.Model.Dinos

class DataSource {


    fun getDinos (): List<Dinos> {
        return listOf(

            Dinos(
                "Kokettino",
                5.45,
                R.drawable.dino1

            ),
            Dinos(
                "Trampelino",
                8.25,
                R.drawable.dino2

            ),
            Dinos(
                "Fammino",
                8.25,
                R.drawable.dino3

            ),
            Dinos(
                "Däumelino",
                5.15,
                R.drawable.dino4

            ),
            Dinos(
                "Bronto",
                8.25,
                R.drawable.dino5

            ),
            Dinos(
                "Tranquillino",
                5.05,
                R.drawable.dino6

            ),
            Dinos(
                "Hecktino",
                5.05,
                R.drawable.dino7

            ),
            Dinos(
                "Melodino",
                8.25,
                R.drawable.dino8

            ),
            Dinos(
                "Juwelina",
                8.25,
                R.drawable.dino9

            ),
            Dinos(
                "Pauline Pflaster",
                9.25,
                R.drawable.dino10

            ),
            Dinos(
                "Ritchie Richtfest",
                6.05,
                R.drawable.dino11

            ),
            Dinos(
                "Bronto Bauarbeiter",
                9.25,
                R.drawable.dino12

            ),
            Dinos(
                "Tranquillino Bauarbeiter",
                6.05,
                R.drawable.dino13

            )

        )
    }
}