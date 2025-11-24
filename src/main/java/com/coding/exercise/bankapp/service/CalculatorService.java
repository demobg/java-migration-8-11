package com.coding.exercise.bankapp.service;

import com.coding.exercise.bankapp.domain.CalculatorRequest;
import com.coding.exercise.bankapp.domain.CalculatorResponse;

public interface CalculatorService {
    CalculatorResponse calculate(CalculatorRequest request);
    CalculatorResponse add(Double operand1, Double operand2);
    CalculatorResponse subtract(Double operand1, Double operand2);
    CalculatorResponse multiply(Double operand1, Double operand2);
    CalculatorResponse divide(Double operand1, Double operand2);
}
