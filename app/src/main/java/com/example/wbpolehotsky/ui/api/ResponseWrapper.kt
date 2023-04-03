package com.example.wbpolehotsky.ui.api

sealed class ResponseWrapper<out T> {
    data class Success<T>(val value: T) : ResponseWrapper<T>()
    data class Loading<T>(val value: T? = null) : ResponseWrapper<T>()
    data class Idle<T>(val value: T? = null) : ResponseWrapper<T>()
    data class Error(
        val code: Int? = null,
        val message: String? = null,
        val throwable: Throwable? = null
    ) : ResponseWrapper<Nothing>()
}