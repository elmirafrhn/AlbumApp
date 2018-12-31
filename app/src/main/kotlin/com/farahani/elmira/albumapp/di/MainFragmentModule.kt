package com.farahani.elmira.albumapp.di

import com.farahani.elmira.albumapp.ui.allAlbums.AllAlbumsFragment
import dagger.android.ContributesAndroidInjector

internal abstract class AllAlbumsFragmentModule {

    @ContributesAndroidInjector
    internal abstract fun allAlbumsFragmentModule(): AllAlbumsFragment
}
