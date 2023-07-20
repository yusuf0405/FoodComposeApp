package com.joseph.foodapp.domain.use_cases

import com.joseph.foodapp.domain.models.User
import com.joseph.foodapp.domain.repositories.UsersRepository

class FetchCurrentUserUseCase(
    private val repository: UsersRepository
) {

    operator fun invoke(): User {
        return repository.fetchCurrentUser()
    }
}