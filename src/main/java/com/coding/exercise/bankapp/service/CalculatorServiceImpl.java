package com.coding.exercise.bankapp.service;

import org.springframework.stereotype.Service;

import com.coding.exercise.bankapp.domain.CalculatorRequest;
import com.coding.exercise.bankapp.domain.CalculatorResponse;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public CalculatorResponse calculate(CalculatorRequest request) {
        if (request.getOperand1() == null || request.getOperand2() == null) {
            return new CalculatorResponse(null, request.getOperation(), "Both operands are required");
        }

        String operation = request.getOperation();
        if (operation == null || operation.isEmpty()) {
            return new CalculatorResponse(null, operation, "Operation is required");
        }

        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                return add(request.getOperand1(), request.getOperand2());
            case "subtract":
            case "-":
                return subtract(request.getOperand1(), request.getOperand2());
            case "multiply":
            case "*":
                return multiply(request.getOperand1(), request.getOperand2());
            case "divide":
            case "/":
                return divide(request.getOperand1(), request.getOperand2());
            default:
                return new CalculatorResponse(null, operation, "Invalid operation. Supported operations: add, subtract, multiply, divide");
        }
    }

    @Override
    public CalculatorResponse add(Double operand1, Double operand2) {
        Double result = operand1 + operand2;
        return new CalculatorResponse(result, "add", "Success");
    }

    @Override
    public CalculatorResponse subtract(Double operand1, Double operand2) {
        Double result = operand1 - operand2;
        return new CalculatorResponse(result, "subtract", "Success");
    }

    @Override
    public CalculatorResponse multiply(Double operand1, Double operand2) {
        Double result = operand1 * operand2;
        return new CalculatorResponse(result, "multiply", "Success");
    }

    @Override
    public CalculatorResponse divide(Double operand1, Double operand2) {
        if (operand2 == 0) {
            return new CalculatorResponse(null, "divide", "Cannot divide by zero");
        }
        Double result = operand1 / operand2;
        return new CalculatorResponse(result, "divide", "Success");
    }
}
