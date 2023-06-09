package com.example.wbpolehotsky.repo

import com.example.wbpolehotsky.data.UserData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository {

    private val URL = "https://regres.in"
    private val registrationUrl = "/api/register"
    private val userListUrl = "/api/users"


    suspend fun registerUser(user: UserData){
        withContext(Dispatchers.IO) {

        }
    }

    suspend fun downloadUserList(page: Int) {
        withContext(Dispatchers.IO) {

        }

    }
}