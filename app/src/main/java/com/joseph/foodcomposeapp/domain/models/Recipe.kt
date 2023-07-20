package com.joseph.foodcomposeapp.domain.models

import com.joseph.foodapp.domain.models.Cook
import com.joseph.foodapp.domain.models.Ingredient
import java.io.Serializable

data class Recipe(
    val id: String,
    val title: String,
    val description: String,
    val imageUrl: String,
    val rating: Float,
    val cook: Cook,
    val ingredients: List<Ingredient>,
    val isSaved: Boolean
) : Serializable
