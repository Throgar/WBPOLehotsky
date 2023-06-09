package com.example.wbpolehotsky.viewmodel

import androidx.lifecycle.ViewModel
import com.example.wbpolehotsky.data.UserData
import com.example.wbpolehotsky.repo.Repository
import retrofit2.Response

class RegisterViewModel() : ViewModel() {

    suspend fun registerUser(user: UserData) {
        //TODO: Implement fun for registering users
//        Repository().registerUser(user)
    }

}