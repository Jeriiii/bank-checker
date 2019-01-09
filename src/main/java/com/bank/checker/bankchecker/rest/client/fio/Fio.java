package com.bank.checker.bankchecker.rest.client.fio;

import com.bank.checker.bankchecker.rest.model.FioGetTransactionsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "fio", url = "${fio.url}")
public interface Fio {

    @RequestMapping(path = "periods/{token}/2018-08-25/2019-01-07/transactions.json")
    public FioGetTransactionsResponse getTransactions(@PathVariable("token") String token);
}
