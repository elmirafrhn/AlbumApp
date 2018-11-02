package com.farahani.elmira.albumapp.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull

@Entity(tableName = "album")
data class AlbumEntity(
    @NonNull
    @ColumnInfo(name = "albumId")
    val albumId: Int,

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "url")
    val url: String,

    @ColumnInfo(name = "thumbnailUrl")
    val thumbnailUrl: String
)