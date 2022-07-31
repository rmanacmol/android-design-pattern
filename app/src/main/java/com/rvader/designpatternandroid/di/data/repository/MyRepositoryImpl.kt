package com.rvader.designpatternandroid.di.data.repository

import android.app.Application
import com.rvader.designpatternandroid.R
import com.rvader.designpatternandroid.di.data.remote.MyApi
import com.rvader.designpatternandroid.di.domain.repository.MyRepository
import javax.inject.Inject


/**
 * Created by Renz Manacmol on 26/6/22.
 */

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("App Name: $appName")
    }

    override suspend fun doNetworkCall() {
        api.doNetworkCall()
        println("doNetworkCall")
    }

    override fun printHello() {
        println("Hello")
    }
}