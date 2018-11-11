package com.farahani.elmira.albumapp.data.db.repository

import com.farahani.elmira.albumapp.data.db.album.AlbumData
import io.reactivex.Single

class AlbumRepository : IAlbumRepository {

    override fun getAlbums(): Single<List<AlbumData>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}