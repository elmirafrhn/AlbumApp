package com.farahani.elmira.albumapp.data.db.album

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull

sealed class AlbumData {

    @Entity(tableName = "album")
    data class AlbumEntity(
        @NonNull @ColumnInfo(name = "userId") val albumId: Int,
        @PrimaryKey @NonNull @ColumnInfo(name = "id") val id: Int,
        @ColumnInfo(name = "title") val title: String
    )

    @Entity(tableName = "photo")
    data class PhotoEntity(
        @NonNull @ColumnInfo(name = "albumId") val albumId: Int,
        @PrimaryKey @NonNull @ColumnInfo(name = "id") val id: Int,
        @ColumnInfo(name = "title") val title: String,
        @ColumnInfo(name = "url") val url: String,
        @ColumnInfo(name = "thumbnailUrl") val thumbnailUrl: String
    )
}