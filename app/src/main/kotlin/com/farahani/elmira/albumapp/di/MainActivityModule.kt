package com.farahani.elmira.albumapp.di

import com.farahani.elmira.albumapp.data.db.repository.AlbumRepository
import com.farahani.elmira.albumapp.ui.MainActivity
import com.farahani.elmira.albumapp.viewModel.ViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class MainActivityModule {

    @Module
    companion object {
        @JvmStatic
        @Provides
        internal fun provideMainViewModelFactory(repository: AlbumRepository): ViewModelFactory {
            return ViewModelFactory(repository)
        }
    }

    @ContributesAndroidInjector
    internal abstract fun mainActivity(): MainActivity
}