package com.example.parser;
import com.example.order.Order;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class OrderParser1 implements com.example.OrderParser {
    public Order parse(String line) {
        String[] parts = line.split("\\|");
        //LocalDateTime time = LocalDateTime.parse(parts[0]);
        String companyName = parts[1];
        double kilograms = Double.parseDouble(parts[2]);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime time = LocalDateTime.parse(parts[0], formatter);
        Order order = new Order(companyName, kilograms, time);
        return order;

    }
}
