package com.bank.checker.bankchecker.rest.model.fio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FioGetTransactionsResponse {
    private AccountStatement accountStatement;
}