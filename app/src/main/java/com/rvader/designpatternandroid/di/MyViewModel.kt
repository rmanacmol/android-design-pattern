package com.rvader.designpatternandroid.di

import androidx.lifecycle.ViewModel
import com.rvader.designpatternandroid.di.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


/**
 * Created by Renz Manacmol on 26/6/22.
 */

@HiltViewModel
class MyViewModel @Inject constructor(private val repository: MyRepository) : ViewModel() {
     fun printHello() {
        repository.printHello()
    }
}