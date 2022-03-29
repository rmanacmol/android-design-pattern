package com.rvader.designpatternandroid.facade

/**
 * Created by Renz Manacmol on 30/3/22.
 */

//Facade: a class that provides a
// simplified interface to a larger body
class TransactionHandler(private val accountNo: Int, private val securityNo: Int) {

    var withdraw: Withdraw
    var deposit: Deposit
    var accChecker: CheckAccount

    init {
        withdraw = Withdraw()
        deposit = Deposit()
        accChecker = CheckAccount()
    }

    fun withdrawMoney(withdrawCash: Double) {
        if (accountNo == accChecker.accountNumber
            && securityNo == accChecker.securityNumber
        ) {
            println("Granted")
            withdraw.transaction(withdrawCash)
        } else {
            println("Denied")
        }
    }

    fun depositMoney(depositCash: Double) {
        if (accountNo == accChecker.accountNumber
            && securityNo == accChecker.securityNumber
        ) {
            println("Granted")
            deposit.transaction(depositCash)
        } else {
            println("Denied")
        }
    }
}