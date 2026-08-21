package com.example;
import com.example.order.Order;

public interface OrderParserInterface {
    Order parse(String line);
}
