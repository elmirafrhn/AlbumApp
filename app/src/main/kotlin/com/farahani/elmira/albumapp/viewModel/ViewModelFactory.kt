package com.farahani.elmira.albumapp.viewModel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.farahani.elmira.albumapp.data.db.repository.AlbumRepository

public class ViewModelFactory(private val repository: AlbumRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AlbumsViewModel::class.java)) {
            return AlbumsViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}
