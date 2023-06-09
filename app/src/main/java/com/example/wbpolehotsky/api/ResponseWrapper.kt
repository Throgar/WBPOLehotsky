package com.example.wbpolehotsky.api

sealed class ResponseWrapper<out T> {
    data class Success<T>(val value: T) : ResponseWrapper<T>()
    data class Loading<T>(val value: T? = null) : ResponseWrapper<T>()
    data class Idle<T>(val value: T? = null) : ResponseWrapper<T>()
    data class Error(
        val code: Int? = null,
        val error: String? = null,
        val throwable: Throwable? = null
    ) : ResponseWrapper<Nothing>()
}