package com.rvader.designpatternandroid.facade

/**
 * Created by Renz Manacmol on 30/3/22.
 */

interface Bank {
    companion object {
        val checker = CheckAccount()
    }
    fun transaction(amount: Double)
}