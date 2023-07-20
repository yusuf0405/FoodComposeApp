package com.joseph.foodapp.domain.use_cases

import com.joseph.foodcomposeapp.domain.models.Recipe
import com.joseph.foodapp.domain.repositories.FoodRepository

class FetchAllRecipesUseCase(
    private val repository: FoodRepository
) {

    operator fun invoke(): List<Recipe> {
        return repository.fetchAllRecipes()
    }

}