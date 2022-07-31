package com.rvader.designpatternandroid.di.di

import com.rvader.designpatternandroid.di.data.repository.MyRepositoryImpl
import com.rvader.designpatternandroid.di.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


/**
 * Created by Renz Manacmol on 31/7/22.
 */

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ): MyRepository
}