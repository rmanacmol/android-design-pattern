package com.rvader.designpatternandroid.facade

/**
 * Created by Renz Manacmol on 30/3/22.
 */
class Withdraw : Bank {
    override fun transaction(amount: Double) {
        if (amount > Bank.checker.totalAmount) {
            println("Not enough money")
            println("Balance: ${Bank.checker.totalAmount}")
        } else {
            Bank.checker.totalAmount -= amount
            println("Withdraw: $amount")
            println("Balance: ${Bank.checker.totalAmount}")
        }
    }
}