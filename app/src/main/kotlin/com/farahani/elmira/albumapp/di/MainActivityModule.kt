package com.farahani.elmira.albumapp.di

import com.farahani.elmira.albumapp.ui.MainActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class MainActivityModule {

    @Module
    companion object {
        @JvmStatic
        @Provides
        internal fun provideMainViewModelFactory()
        {
            
        }
    }
    @ContributesAndroidInjector
    internal abstract fun mainActivity(): MainActivity
}