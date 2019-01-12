package com.bank.checker.bankchecker.model.bank;

import com.bank.checker.bankchecker.rest.model.fio.Info;
import lombok.Data;

import java.util.List;

@Data
public class Transactions {

    private Info info;

    private List<Transaction> transactions;

}
