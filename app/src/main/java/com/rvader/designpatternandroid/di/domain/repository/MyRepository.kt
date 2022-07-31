package com.rvader.designpatternandroid.di.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()

    fun printHello()

}