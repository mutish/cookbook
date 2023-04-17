package com.example.cookbook.model

import androidx.annotation.DrawableRes

data class recipe(
    val id: Long,
    val title: String,
    val ingredients: List<String>,
    @DrawableRes val imageResource: Int,
    val method: String
)
