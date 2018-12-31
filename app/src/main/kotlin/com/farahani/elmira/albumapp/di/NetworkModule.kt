package com.farahani.elmira.albumapp.di

import com.farahani.elmira.albumapp.data.network.api.AlbumApi
import com.farahani.elmira.albumapp.data.network.api.IAlbumApi
import com.farahani.elmira.albumapp.utils.ApiUtils
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module
abstract class NetworkModule {

    companion object {
        @Provides
        @JvmStatic
        fun provideApiService(apiService: AlbumApi): IAlbumApi {
            return apiService
        }

        @Provides
        @JvmStatic
        fun provideRetrofitApiService(retrofit: Retrofit): IAlbumApi {
            return retrofit.create(IAlbumApi::class.java)
        }

        @Provides
        @JvmStatic
        fun provideRetrofitInterface(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(ApiUtils.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .build()

        }
    }
}
