package com.farahani.elmira.albumapp.data.db.album

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert

@Dao
interface AlbumDao {

    @Insert
    fun insertAlbum(album: AlbumData)
}