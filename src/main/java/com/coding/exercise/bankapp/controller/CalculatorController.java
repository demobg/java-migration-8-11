package com.coding.exercise.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coding.exercise.bankapp.domain.CalculatorRequest;
import com.coding.exercise.bankapp.domain.CalculatorResponse;
import com.coding.exercise.bankapp.service.CalculatorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("calculator")
@Api(tags = { "Calculator REST endpoints" })
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping(path = "/calculate")
    @ApiOperation(value = "Perform calculation", notes = "Perform arithmetic operation on two operands")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 500, message = "Internal Server Error") })
    public ResponseEntity<CalculatorResponse> calculate(@RequestBody CalculatorRequest request) {
        CalculatorResponse response = calculatorService.calculate(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/add")
    @ApiOperation(value = "Add two numbers", notes = "Add operand1 and operand2")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 500, message = "Internal Server Error") })
    public ResponseEntity<CalculatorResponse> add(
            @RequestParam Double operand1,
            @RequestParam Double operand2) {
        CalculatorResponse response = calculatorService.add(operand1, operand2);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/subtract")
    @ApiOperation(value = "Subtract two numbers", notes = "Subtract operand2 from operand1")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 500, message = "Internal Server Error") })
    public ResponseEntity<CalculatorResponse> subtract(
            @RequestParam Double operand1,
            @RequestParam Double operand2) {
        CalculatorResponse response = calculatorService.subtract(operand1, operand2);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/multiply")
    @ApiOperation(value = "Multiply two numbers", notes = "Multiply operand1 and operand2")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 500, message = "Internal Server Error") })
    public ResponseEntity<CalculatorResponse> multiply(
            @RequestParam Double operand1,
            @RequestParam Double operand2) {
        CalculatorResponse response = calculatorService.multiply(operand1, operand2);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/divide")
    @ApiOperation(value = "Divide two numbers", notes = "Divide operand1 by operand2")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 500, message = "Internal Server Error") })
    public ResponseEntity<CalculatorResponse> divide(
            @RequestParam Double operand1,
            @RequestParam Double operand2) {
        CalculatorResponse response = calculatorService.divide(operand1, operand2);
        return ResponseEntity.ok(response);
    }
}
