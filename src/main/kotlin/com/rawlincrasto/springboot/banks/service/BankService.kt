package com.rawlincrasto.springboot.banks.service

import com.rawlincrasto.springboot.banks.datasource.BankDataSource
import com.rawlincrasto.springboot.banks.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> {
        return dataSource.retrieveBanks()
    }

    fun getBank(accountNumber: String): Bank {
        return dataSource.retrieveBank(accountNumber)
    }
}














