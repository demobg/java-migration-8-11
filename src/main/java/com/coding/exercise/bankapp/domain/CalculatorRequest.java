package com.coding.exercise.bankapp.domain;

import lombok.Data;

@Data
public class CalculatorRequest {
    private Double operand1;
    private Double operand2;
    private String operation;
}
