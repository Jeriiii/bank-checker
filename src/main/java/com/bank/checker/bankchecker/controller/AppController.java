package com.bank.checker.bankchecker.controller;

import com.bank.checker.bankchecker.rest.model.FioGetTransactionsResponse;
import com.bank.checker.bankchecker.services.fio.GetTransactionsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Slf4j
@RestController(value = "/api")
public class AppController {

    @Autowired
    private GetTransactionsService getTransactionsService;

    @PostConstruct
    public void post() {
        log.info("PostConstruct");
    }

    @GetMapping("/getTransactions")
    public String getTransactions() {
        log.info("getTransactions");
        FioGetTransactionsResponse fioGetTransactionsResponse = getTransactionsService.getAll();
        return "ok";
    }
}
