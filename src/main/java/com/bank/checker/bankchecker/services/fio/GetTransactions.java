package com.bank.checker.bankchecker.services.fio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GetTransactions {

    @Value("fio.tokens.rosmarinusCZ")
    private String rosmarinusCZ;

    public void getAll() {
    }

}
