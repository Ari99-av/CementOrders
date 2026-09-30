package com.example.service;

import com.example.file.FileService;
import com.example.file.OrderCalculator;
import com.example.order.Order;
import com.example.order.OrderInvoice;
import com.example.parser.OrderParser;
import com.example.parser.OrderParserFactory;

import java.util.List;

public class OrderManager {
    private final OrderCalculator calculator;
    private FileService fileService;
    private OrderCalculator Calculator;

    public  OrderManager(FileService fileService, OrderCalculator  calculator){
        this.fileService = fileService;
    this.calculator = calculator;
    }
    public void manage(String readPath, String writePath) {
        OrderParserFactory factory = new OrderParserFactory();
        OrderParser parser = factory.getParser(readPath);
        fileService.read(readPath, parser);
        List<Order> orders = fileService.read(readPath, parser);
        List<OrderInvoice> invoices = calculator.calculate(orders);
        fileService.write(writePath, invoices);
    }
    }


