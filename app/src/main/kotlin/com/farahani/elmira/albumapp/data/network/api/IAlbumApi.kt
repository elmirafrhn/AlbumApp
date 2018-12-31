package com.farahani.elmira.albumapp.data.network.api

import io.reactivex.Single
import retrofit2.http.GET

interface IAlbumApi {

    @GET("/albums")
    fun getAlbums(): Single<List<AlbumDto>>
}