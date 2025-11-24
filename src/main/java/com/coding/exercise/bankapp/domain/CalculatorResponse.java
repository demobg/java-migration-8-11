package com.coding.exercise.bankapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorResponse {
    private Double result;
    private String operation;
    private String message;
}
