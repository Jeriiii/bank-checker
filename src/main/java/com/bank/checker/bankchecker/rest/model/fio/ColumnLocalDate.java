package com.bank.checker.bankchecker.rest.model.fio;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ColumnLocalDate {

    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-ddZ")
    private LocalDate value;

    private String name;

}
