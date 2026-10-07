package com.example.file;

import com.example.service.OrderCalculator;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import com.example.order.Order;

public class OrderCalculatorTest {

    @Test
    public void testSomething() {
        OrderCalculator calculator = new OrderCalculator(0.5, 0.05, 10.0);
        Order order = new Order("Test",
                100,
                LocalDateTime.of(2021, 1, 1, 10, 0));
    }
}