package com.rvader.designpatternandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rvader.designpatternandroid.factory.Coffee
import com.rvader.designpatternandroid.factory.CoffeeFactory
import com.rvader.designpatternandroid.factory.CoffeeTypes
import com.rvader.designpatternandroid.factory.Type
import com.rvader.designpatternandroid.singleton.Singleton
import com.rvader.designpatternandroid.singleton.SingletonJava

/**
 * Created by Renz Manacmol on 25/3/22.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Java Singleton-
        SingletonJava.getInstance().text = "Test Message"
        toast(SingletonJava.getInstance().text)
        //Kotlin Singleton-
        Singleton.textString = "Test Message 2"
        toast(Singleton.textString)

        //Factory-
        val coffee = CoffeeFactory.getCoffee(Type.LATTE)
        toast(coffee.name() + " " + coffee.recipe())
    }
}