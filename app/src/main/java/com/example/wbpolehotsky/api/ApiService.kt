package com.example.wbpolehotsky.api

import com.example.wbpolehotsky.data.UserData
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Url

interface ApiService {
    @GET
    @Headers("Content-Type: application/json")
    suspend fun getUserList(@Url url: String)

    @FormUrlEncoded
    @POST
    @Headers("Content-Type: application/x-www-form-urlencoded")
    suspend fun registerUser(
        @Url url: String,
        @Field("email") email: String,
        @Field("password") password: String
    )

    @GET
    suspend fun getUser() : Response<List<UserData>>
}