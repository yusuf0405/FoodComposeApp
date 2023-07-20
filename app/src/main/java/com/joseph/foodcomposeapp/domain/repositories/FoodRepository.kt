package com.joseph.foodapp.domain.repositories

import com.joseph.foodapp.domain.models.FoodCategory
import com.joseph.foodcomposeapp.domain.models.Recipe
import com.joseph.foodapp.domain.models.RecommendationsEvent

interface FoodRepository {

    fun fetchAllRecommendationsEvents(): List<RecommendationsEvent>

    fun fetchAllRecipes(): List<Recipe>

    fun fetchAllFoodCategories(): List<FoodCategory>

}