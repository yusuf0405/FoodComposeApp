package com.joseph.foodapp.domain.use_cases

import com.joseph.foodapp.domain.models.FoodCategory
import com.joseph.foodapp.domain.repositories.FoodRepository

class FetchAllFoodCategories(
    private val repository: FoodRepository
) {

    operator fun invoke(): List<FoodCategory> {
        return repository.fetchAllFoodCategories()
    }
}