package com.joseph.foodapp.data.repositories

import com.joseph.foodapp.domain.models.User
import com.joseph.foodapp.domain.repositories.UsersRepository

class UsersRepositoryImpl : UsersRepository {

    override fun fetchCurrentUser(): User {
        return User(
            id ="1",
            name = "Yusuf",
            lastName = "Ruziev",
            avatarUrl ="https://steamuserimages-a.akamaihd.net/ugc/1493460530060215234/FF88F3723F4CBC496BB5D1ACAC75DB84D962BCF6/?imw=512&amp;imh=512&amp;ima=fit&amp;impolicy=Letterbox&amp;imcolor=%23000000&amp;letterbox=true"
        )
    }
}