package com.rawlincrasto.springboot.banks

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BanksApplication

fun main(args: Array<String>) {
	runApplication<BanksApplication>(*args)
}
