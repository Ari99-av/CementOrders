package com.example;

import com.example.parser.OrderParser;
import com.example.parser.ParserAdapter;

public class OrderParserFactory {
    public OrderParserInterface getParser(String filePath){

        if (filePath.endsWith(".txt")) {
            return new OrderParser();

        }
        return new ParserAdapter(new OrderParser());

    }
}
