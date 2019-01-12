package com.bank.checker.bankchecker.rest.model.fio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true) // known ignored properties - column6, column18, column26
public class Transaction {

    /* transaction id is unique */
    @JsonProperty("column22")
    private Column id;

    /* id of the command */
    @JsonProperty("column17")
    private Column commandId;

    @JsonProperty("column0")
    private ColumnLocalDate date;

    @JsonProperty("column1")
    private Column amount;

    @JsonProperty("column14")
    private Column currency;

    @JsonProperty("column2")
    private Column bankAccount;

    /* for example "JANUTKA MICHAL" */
    @JsonProperty("column10")
    private Column nameForHumanOfBankAccount;

    @JsonProperty("column3")
    private Column bankCode;

    /* foe example "ČSOB, a.s." */
    @JsonProperty("column12")
    private Column bankName;

    @JsonProperty("column5")
    private Column variableSymbol;

    @JsonProperty("column4")
    private Column constantSymbol;

    @JsonProperty("column16")
    private Column messageForRecipient;

    /* For example Kukrál, Petr */
    @JsonProperty("column9")
    private Column personWhoMadeTransaction;

    /* for example Nákup: PENNY MARKET s.r.o. */
    @JsonProperty("column7")
    private Column note;

    /* for example Platba převodem uvnitř banky OR Bezhotovostní příjem OR ... */
    @JsonProperty("column8")
    private Column type;

    @JsonProperty("column25")
    private Column comment;


}
