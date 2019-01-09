package com.bank.checker.bankchecker.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.extern.slf4j.Slf4j;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FioGetTransactionsResponse {
    public AccountStatement accountStatement;

    public static class AccountStatement {
        public Info info;

        public static class Info {
            public String accountId;
            public String bankId;
            public String currency;
            public String iban;
            public String bic;
            public String openingBalance;
            public String closingBalance;
            public String dateStart;
            public String dateEnd;
            public String idFrom;
            public String idTo;
        }

    }
}