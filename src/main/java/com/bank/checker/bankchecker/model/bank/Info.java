package com.bank.checker.bankchecker.model.bank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Info {

    private String accountId;

    private String bankId;

    private String currency;

    private String iban;

    private String bic;

    private String openingBalance;

    private String closingBalance;

    private LocalDate dateStart;

    private LocalDate dateEnd;

    private String idFrom;

    private String idTo;
}