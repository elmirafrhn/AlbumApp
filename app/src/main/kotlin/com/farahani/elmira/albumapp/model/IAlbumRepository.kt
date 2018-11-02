package com.farahani.elmira.albumapp.model

import io.reactivex.Single

interface IAlbumRepository {

    fun getAlbums() : Single<List<AlbumEntity>>
}
