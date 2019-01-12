package com.bank.checker.bankchecker.service.mapper;

import com.bank.checker.bankchecker.model.bank.Transaction;
import com.bank.checker.bankchecker.model.bank.Transactions;
import com.bank.checker.bankchecker.rest.model.fio.FioGetTransactionsResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface FioTranstactionsMapper {

    @Mappings({
        @Mapping(target = "info", source = "response.accountStatement.info"),
        @Mapping(target = "transactions", source = "response.accountStatement.transactionList.transaction", qualifiedByName = "transactions")
    })
    Transactions mapFioTransactionsToTransactions(FioGetTransactionsResponse response);

    default List<Transaction> mapTransactions(List<com.bank.checker.bankchecker.rest.model.fio.Transaction> transaction) {
        return transaction.stream().map(this::mapTransaction).collect(Collectors.toList());
    }

    @Mappings({
        @Mapping(target = "id", source = "id.value"),
        @Mapping(target = "commandId", source = "commandId.value"),
        @Mapping(target = "date", source = "date.value"),
        @Mapping(target = "amount", source = "amount.value"),
        @Mapping(target = "currency", source = "currency.value"),
        @Mapping(target = "bankAccount", source = "bankAccount.value"),
        @Mapping(target = "nameForHumanOfBankAccount", source = "nameForHumanOfBankAccount.value"),
        @Mapping(target = "bankCode", source = "bankCode.value"),
        @Mapping(target = "bankName", source = "bankName.value"),
        @Mapping(target = "variableSymbol", source = "variableSymbol.value"),
        @Mapping(target = "constantSymbol", source = "constantSymbol.value"),
        @Mapping(target = "messageForRecipient", source = "messageForRecipient.value"),
        @Mapping(target = "note", source = "note.value"),
        @Mapping(target = "type", source = "type.value"),
        @Mapping(target = "comment", source = "comment.value")
    })
    Transaction mapTransaction(com.bank.checker.bankchecker.rest.model.fio.Transaction transaction);

//    default LocalDate mapDate(String date) {
//        return LocalDate.parse(date, DateTimeFormatter.ofPattern ("yyyy-MM-ddZ"));
//    }

}
