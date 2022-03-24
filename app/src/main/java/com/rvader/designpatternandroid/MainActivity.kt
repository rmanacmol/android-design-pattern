package com.rvader.designpatternandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rvader.designpatternandroid.singleton.Singleton
import com.rvader.designpatternandroid.singleton.SingletonJava

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Singleton: restricts the instantiation of the
        //class to on only one instance and be use everywhere.

        //Java Singleton
        SingletonJava.getInstance().text = "Test Message"
        toast(SingletonJava.getInstance().text)

        //Kotlin Singleton
        Singleton.textString = "Test Message 2"
        toast(Singleton.textString)


    }
}