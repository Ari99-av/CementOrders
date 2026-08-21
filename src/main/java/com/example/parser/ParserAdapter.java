package com.example.parser;

import com.example.OrderParserInterface;
import com.example.order.Order;

public class ParserAdapter implements OrderParserInterface {
    private OrderParser parser;
    public ParserAdapter(OrderParser parser) {
        this.parser = parser;
        }
    public Order parse(String line){
        String correctLine = line.replace("#", "|");
        System.out.println(correctLine);
        parser.parse(correctLine);
        return parser.parse(correctLine);

    }



    }

