package com.example.parser;
import com.example.order.Order;

public interface OrderParser {
    Order parse(String line);
}
