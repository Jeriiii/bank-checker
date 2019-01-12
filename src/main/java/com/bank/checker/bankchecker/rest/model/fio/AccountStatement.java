package com.bank.checker.bankchecker.rest.model.fio;

import lombok.Data;
import lombok.ToString;

@Data
public class AccountStatement {
    private Info info;

    private TransactionList transactionList;

}