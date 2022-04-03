package com.rawlincrasto.springboot.banks.datasource

import com.rawlincrasto.springboot.banks.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

    fun retrieveBank(accountNumber: String): Bank

}