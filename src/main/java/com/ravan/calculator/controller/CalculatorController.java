package com.ravan.calculator.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public int add(@RequestParam int x, @RequestParam int y) {
        return x + y;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int x, @RequestParam int y) {
        return x - y;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int x, @RequestParam int y) {
        return x * y;
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double x, @RequestParam double y) {
        if(y == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return x / y;
    }
}

