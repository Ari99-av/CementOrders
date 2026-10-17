package com.example.manager;

import com.example.order.OrderInvoice;
import com.example.parser.OrderParser;
import com.example.service.FileService;
import com.example.service.OrderCalculator;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.time.LocalDateTime;
import java.util.List;

import static javax.management.Query.eq;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class OrderManagerTest {
    @Mock
    private FileService fileService;

    @Mock
    private OrderCalculator calculator;

    @InjectMocks
    private OrderManager manager;

    @Test void manage_shouldReadOrders_calculateInvoices_andWriteResult() {
        String readPath = "src/main/resources/orders.txt";
        String writePath = "src/main/resources/result.txt";
        double startDiscount = 0.5;
        double discountStep = 0.05;
        double pricePerKg = 10.0;

        List<Order> orders = List.of(new Order("Test", 100, LocalDateTime.of(2021, 1,
                1, 10, 0)));

        List<OrderInvoice> invoices = List.of( new OrderInvoice("Test", 500.0));

        when(fileService.read(eq(readPath), any(OrderParser.class))).thenReturn(orders);

        when(calculator.calculate(eq(orders), eq(startDiscount), eq(discountStep), eq(pricePerKg)))
                .thenReturn(invoices);




        

    }


}
