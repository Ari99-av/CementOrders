package com.example.parser;

import com.example.order.Order;

public class ParserAdapter implements OrderParser {

    private final OrderParserImpI parser;
    public ParserAdapter(OrderParserImpI parser) {
        this.parser = parser;
        }
    @Override
    public Order parse(String line) {
        String correctLine = line.replace("#", "|");
        return parser.parse(correctLine);

    }

    }

