package com.bank.checker.bankchecker.model.bank;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Transaction {

    /* transaction id is unique */
    private String id;

    /* id of the command */
    private String commandId;

    private LocalDate date;

    private BigDecimal amount;

    private String currency;

    private String bankAccount;

    /* for example "JANUTKA MICHAL" */
    private String nameForHumanOfBankAccount;

    private String bankCode;

    /* foe example "ČSOB, a.s." */
    private String bankName;

    private String variableSymbol;

    private String constantSymbol;

    private String messageForRecipient;

    /* for example Nákup: PENNY MARKET s.r.o. */
    private String note;

    /* for example Platba převodem uvnitř banky OR Bezhotovostní příjem OR ... */
    private String type;

    private String comment;

}
