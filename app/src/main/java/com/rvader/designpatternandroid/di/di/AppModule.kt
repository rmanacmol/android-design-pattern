package com.rvader.designpatternandroid.di.di

import android.app.Application
import com.rvader.designpatternandroid.di.data.remote.MyApi
import com.rvader.designpatternandroid.di.data.repository.MyRepositoryImpl
import com.rvader.designpatternandroid.di.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton


/**
 * Created by Renz Manacmol on 26/6/22.
 */

@Module
@InstallIn(SingletonComponent::class)  //lifetime of appmodule
class AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"
}