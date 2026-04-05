package com.example.logistics;

import com.example.logistics.service.CostCalculatorService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CostCalculatorServiceTest {

    CostCalculatorService service = new CostCalculatorService();

    @Test
    void testStandardPricing() {
        double cost = service.calculateCost(2, 10, "STANDARD");
        assertEquals(100.0, cost);
    }

    @Test
    void testExpressPricing() {
        double cost = service.calculateCost(2, 10, "EXPRESS");
        assertEquals(200.0, cost);
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.calculateCost(-1, 10, "STANDARD");
        });
    }
}