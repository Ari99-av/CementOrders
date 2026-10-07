package com.example;
import com.example.service.FileService;
import com.example.service.OrderCalculator;
import manager.OrderManager;

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

