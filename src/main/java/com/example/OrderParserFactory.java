package com.example;

import com.example.parser.ParserAdapter;
import org.OrderParser1;

public class OrderParserFactory {
    public OrderParser getParser(String filePath){

        if (filePath.endsWith(".txt")) {
            return new OrderParser1();

        }
        return new ParserAdapter(new OrderParser1());

    }
}
