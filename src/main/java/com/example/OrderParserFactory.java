package com.example;

import com.example.parser.OrderParser1;
import com.example.parser.ParserAdapter;

public class OrderParserFactory {
    public OrderParser getParser(String filePath){

        if (filePath.endsWith(".txt")) {
            return new OrderParser1();

        }
        return new ParserAdapter(new OrderParser1());

    }
}
