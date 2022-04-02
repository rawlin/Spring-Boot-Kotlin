package com.rawlincrasto.springboot.banks.model

data class Bank(
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
)
