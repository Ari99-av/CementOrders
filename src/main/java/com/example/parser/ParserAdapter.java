package com.example.parser;

import com.example.order.Order;

public class ParserAdapter implements OrderParser {
    private OrderParserImpI parser;
    public ParserAdapter(OrderParserImpI parser) {
        this.parser = parser;
        }
    public Order parse(String line){
        String correctLine = line.replace("#", "|");
        System.out.println(correctLine);
        parser.parse(correctLine);
        return parser.parse(correctLine);

    }



    }

