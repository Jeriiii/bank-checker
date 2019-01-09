package com.bank.checker.bankchecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class BankCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankCheckerApplication.class, args);
	}

}

