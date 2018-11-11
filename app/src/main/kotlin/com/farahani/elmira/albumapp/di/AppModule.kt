package com.farahani.elmira.albumapp.di

import android.content.Context
import com.farahani.elmira.albumapp.App
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideContext(application: App): Context = application.applicationContext
}