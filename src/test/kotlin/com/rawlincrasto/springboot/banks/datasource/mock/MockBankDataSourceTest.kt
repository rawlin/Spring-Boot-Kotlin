package com.rawlincrasto.springboot.banks.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockBankDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        //given


        //when
        val banks = mockBankDataSource.retrieveBanks()

        //assert
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`() {
        //when
        val banks = mockBankDataSource.retrieveBanks()

        //then
        assertThat(banks).apply {
            allMatch { it.accountNumber.isNotBlank() }
            anyMatch { it.trust != 0.0 }
            anyMatch { it.transactionFee != 0 }
        }
    }



}