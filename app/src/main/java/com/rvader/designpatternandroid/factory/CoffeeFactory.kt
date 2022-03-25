package com.rvader.designpatternandroid.factory


/**
 * Created by Renz Manacmol on 25/3/22.
 */

//Factory: controls which object to instantiate
object CoffeeFactory {
    fun getCoffee(type: Type): Coffee {
        return when (type) {
            Type.AMERICANO -> CoffeeTypes.Americano
            Type.LATTE -> CoffeeTypes.CafeLatte
        }
    }
}

//enum class: forces you to have same property for each value
//used when you have some related constants with same functionality
enum class Type {
    LATTE, AMERICANO
}

//sealed class: can have different properties for each subtype
//used when you have related constants, each of which holds different data
//and implement different logic
//objects inside sealed class are accessible within the file
sealed class CoffeeTypes {
    object CafeLatte : Coffee {
        override fun name(): String = "CaffeLatte"
        override fun recipe(): String = "Expresso"
    }

    object Americano : Coffee {
        override fun recipe(): String = "Expresso, Hot water"
        override fun name(): String = "Caffè Americano"
    }
}