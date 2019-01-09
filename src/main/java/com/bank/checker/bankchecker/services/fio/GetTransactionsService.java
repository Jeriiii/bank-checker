package com.bank.checker.bankchecker.services.fio;

import com.bank.checker.bankchecker.rest.client.fio.Fio;
import com.bank.checker.bankchecker.rest.model.FioGetTransactionsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GetTransactionsService {

    @Value("${fio.tokens.rosmarinusCZ}")
    private String tokenRosmarinusCZ;

    @Autowired
    private Fio fio;

    public FioGetTransactionsResponse getAll() {
        return fio.getTransactions(tokenRosmarinusCZ);
    }

}
