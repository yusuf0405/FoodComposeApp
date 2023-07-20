package com.joseph.foodapp.data.repositories

import com.joseph.foodapp.data.fake_data.FakeData
import com.joseph.foodapp.domain.models.FoodCategory
import com.joseph.foodcomposeapp.domain.models.Recipe
import com.joseph.foodapp.domain.models.RecommendationsEvent
import com.joseph.foodapp.domain.repositories.FoodRepository

class FoodRepositoryImpl : FoodRepository {

    override fun fetchAllRecommendationsEvents(
    ): List<RecommendationsEvent> {
       return FakeData.fakeRecommendationsEvents()
    }

    override fun fetchAllRecipes(): List<Recipe> {
        return FakeData.fakeRecipes()
    }

    override fun fetchAllFoodCategories(): List<FoodCategory> {
        return FakeData.fakeFoodCategory()
    }
}