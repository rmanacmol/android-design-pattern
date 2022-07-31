package com.rvader.designpatternandroid.di

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.rvader.designpatternandroid.di.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


/**
 * Created by Renz Manacmol on 31/7/22.
 */

@AndroidEntryPoint
class MyService: Service() {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}