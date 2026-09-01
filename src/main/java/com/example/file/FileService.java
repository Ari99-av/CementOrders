package com.example.file;

import com.example.OrderParser;
import com.example.order.Order;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public List<Order> read(String filePath, OrderParser parser){
        Path path = Path.of(filePath);
        try {
            List<String> lines = Files.readAllLines(path);
            List<Order> orders = new ArrayList<>();
            for (String Line : lines){
                String line = lines;
                Order order = parser.parse(line);
                orders.add(order);
            }
            return orders;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
