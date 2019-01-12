package com.bank.checker.bankchecker.rest.model.fio;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Info {

    private String accountId;

    private String bankId;

    private String currency;

    private String iban;

    private String bic;

    private String openingBalance;

    private String closingBalance;

    @JsonFormat(pattern = "yyyy-MM-ddZ")
    private LocalDate dateStart;

    @JsonFormat(pattern = "yyyy-MM-ddZ")
    private LocalDate dateEnd;

    private String idFrom;

    private String idTo;
}