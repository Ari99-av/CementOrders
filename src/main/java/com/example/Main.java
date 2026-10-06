package com.example;
import com.example.file.FileService;
import com.example.service.OrderCalculator;
import com.example.order.Order;
import com.example.order.OrderInvoice;
import com.example.parser.OrderParserFactory;
import com.example.parser.ParserAdapter;
import com.example.parser.OrderParserImpI;
import com.example.parser.OrderParser;
import manager.OrderManager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args){
            FileService fileService = new FileService();
            OrderCalculator calculator = new OrderCalculator();

        OrderManager manager = new OrderManager(fileService, calculator);
        String readPath = "src/main/resources/orders.txt";
        String writePath = "src/main/resources/result.txt";
        manager.manage(readPath, writePath, 0.5, 0.05,10.0);

    }

    }

