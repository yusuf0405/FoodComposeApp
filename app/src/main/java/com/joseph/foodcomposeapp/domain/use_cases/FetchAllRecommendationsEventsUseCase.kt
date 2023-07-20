package com.joseph.foodapp.domain.use_cases

import com.joseph.foodapp.domain.models.RecommendationsEvent
import com.joseph.foodapp.domain.repositories.FoodRepository

class FetchAllRecommendationsEventsUseCase(
    private val repository: FoodRepository
) {

    operator fun invoke(): List<RecommendationsEvent> {
        return repository.fetchAllRecommendationsEvents()
    }

}