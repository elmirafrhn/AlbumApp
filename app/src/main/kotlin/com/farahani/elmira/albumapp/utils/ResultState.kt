package com.farahani.elmira.albumapp.utils

sealed class ResultState<T> {

    data class Progress<T>(var loading: Boolean) : ResultState<T>()
    data class Failure<T>(var e: Throwable) : ResultState<T>()
    data class Success<T>(val result: T) : ResultState<T>()

    companion object {

    }
}