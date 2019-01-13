package com.bank.checker.bankchecker.controller;

import com.bank.checker.bankchecker.model.bank.Transactions;
import com.bank.checker.bankchecker.rest.model.fio.FioGetTransactionsResponse;
import com.bank.checker.bankchecker.service.fio.GetTransactionsService;
import com.bank.checker.bankchecker.service.mapper.FioTranstactionsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api")
public class AppController {

    @Autowired
    private GetTransactionsService getTransactionsService;

    @Autowired
    private FioTranstactionsMapper fioTranstactionsMapper;

    @GetMapping("/getTransactions")
    public Transactions getTransactions() {
        log.info("getTransactions");
        FioGetTransactionsResponse fioGetTransactionsResponse = getTransactionsService.getAll();
        Transactions transactions = fioTranstactionsMapper.mapFioTransactionsToTransactions(fioGetTransactionsResponse);

        log.info(transactions.toString());
        log.info("oooooooooooooooooooook");

        return transactions;
    }
}
