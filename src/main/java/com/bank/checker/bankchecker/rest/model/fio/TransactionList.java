package com.bank.checker.bankchecker.rest.model.fio;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
public class TransactionList {

    private List<Transaction> transaction;

}
