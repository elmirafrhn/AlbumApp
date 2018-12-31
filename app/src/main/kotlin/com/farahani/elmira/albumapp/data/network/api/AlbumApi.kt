package com.farahani.elmira.albumapp.data.network.api

import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class AlbumApi @Inject constructor(retrofit: Retrofit) : IAlbumApi {

    private val retrofitCreated = retrofit.create(IAlbumApi::class.java)

    override fun getAlbums(): Single<List<AlbumDto>> = retrofitCreated.getAlbums()
}