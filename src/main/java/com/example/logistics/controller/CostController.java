package com.example.logistics.controller;

import com.example.logistics.service.CostCalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CostController {

    private final CostCalculatorService service;

    public CostController(CostCalculatorService service) {
        this.service = service;
    }

    @GetMapping("/calculate")
    public double calculate(
            @RequestParam double weight,
            @RequestParam double distance,
            @RequestParam String type) {

        return service.calculateCost(weight, distance, type);
    }
}