package com.joseph.foodapp.domain.repositories

import com.joseph.foodapp.domain.models.User

interface UsersRepository {

    fun fetchCurrentUser(): User

}