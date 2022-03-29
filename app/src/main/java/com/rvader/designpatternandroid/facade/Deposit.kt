package com.rvader.designpatternandroid.facade

/**
 * Created by Renz Manacmol on 30/3/22.
 */
class Deposit : Bank {
    override fun transaction(amount: Double) {
        Bank.checker.totalAmount += amount
        println("Deposit: $amount")
        println("Balance: ${Bank.checker.totalAmount}")
    }
}