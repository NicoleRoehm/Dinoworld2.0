package com.example.dino_eggs.data.Model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Dinos (

    val name: String,
    val priceResource: Double,
    val imageResource: Int
        ):Parcelable