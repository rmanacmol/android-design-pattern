package com.rvader.designpatternandroid.di

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.rvader.designpatternandroid.di.ui.theme.DaggerHiltTheme
import dagger.hilt.android.AndroidEntryPoint


/**
 * Created by Renz Manacmol on 26/6/22.
 */

@AndroidEntryPoint
class MyActivity : androidx.activity.ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerHiltTheme {
                val viewModel = hiltViewModel<MyViewModel>()
                viewModel.printHello()
            }
        }
    }
}