package com.rawlincrasto.springboot.banks.datasource.mock

import com.rawlincrasto.springboot.banks.datasource.BankDataSource
import com.rawlincrasto.springboot.banks.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("ICICI", 4.0, 1),
        Bank("ICIadfaI", 4.0, 0),
        Bank("ICICadf", 4.0, 100),

        )

    override fun retrieveBanks(): Collection<Bank> {
        return retrieveBanks
    }
}