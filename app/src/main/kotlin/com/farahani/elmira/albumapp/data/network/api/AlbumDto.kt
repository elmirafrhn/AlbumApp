package com.farahani.elmira.albumapp.data.network.api

import com.google.gson.annotations.SerializedName

data class AlbumDto(
    @SerializedName("albumId") val albumId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String
)