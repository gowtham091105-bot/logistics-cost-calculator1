package com.example.logistics.service;

import org.springframework.stereotype.Service;

@Service
public class CostCalculatorService {

    public double calculateCost(double weight, double distance, String type) {

        if (weight <= 0 || distance <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        double baseRate = 5.0;

        if (type.equalsIgnoreCase("EXPRESS")) {
            baseRate = 10.0;
        }

        return baseRate * weight * distance;
    }
}