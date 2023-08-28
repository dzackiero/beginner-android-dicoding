package com.pnj.beginnerprojectdicoding.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Content(
    val imageResourceId: Int,
    val title: String,
    val year: Int,
    val overview: String,
    val genre: List<String>,
    val rating: Double,
    val trailer: String,
    val link: String,
) : Parcelable
