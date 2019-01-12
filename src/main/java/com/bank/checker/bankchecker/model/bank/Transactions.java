package com.bank.checker.bankchecker.model.bank;

import lombok.Data;

import java.util.List;

@Data
public class Transactions {

    private Info info;

    private List<Transaction> transactions;

}
