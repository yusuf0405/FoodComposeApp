package com.joseph.foodapp.domain.models

data class Ingredient(
    val id: String,
    val title: String,
    val imageUrl: String,
    val count: Int,
    val countType: String
)
