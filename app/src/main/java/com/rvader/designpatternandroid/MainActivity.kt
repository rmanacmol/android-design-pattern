package com.rvader.designpatternandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rvader.designpatternandroid.builder.BikeUpgrade
import com.rvader.designpatternandroid.builder.BikeUpgrade2
import com.rvader.designpatternandroid.facade.TransactionHandler
import com.rvader.designpatternandroid.factory.CoffeeFactory
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

        //Builder-
        val bikeUpgrade = BikeUpgrade.Builder()
            .frame(true)
            .breaks(true)
            .saddle(true).build()
        toast("Upgrade frame: " + bikeUpgrade.frame)

        val bikeUpgrade2 = BikeUpgrade2(false, true)
        toast("Upgrade frame: " + bikeUpgrade2.frame)

        //Facade
        val transHandler = TransactionHandler(12345, 404)
        transHandler.withdrawMoney(100.0)
        transHandler.depositMoney(200.0)

        //Dependency Injection


    }
}