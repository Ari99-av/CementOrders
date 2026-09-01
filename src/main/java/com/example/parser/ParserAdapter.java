package com.example.parser;

import com.example.OrderParser;
import com.example.order.Order;

public class ParserAdapter implements OrderParser {
    private OrderParser1 parser;
    public ParserAdapter(OrderParser1 parser) {
        this.parser = parser;
        }
    public Order parse(String line){
        String correctLine = line.replace("#", "|");
        System.out.println(correctLine);
        parser.parse(correctLine);
        return parser.parse(correctLine);

    }



    }

