package com.example.parser;

public class OrderParserFactory {
    public OrderParser getParser(String filePath){

        if (filePath.endsWith(".txt")) {
            return new OrderParserImpI();

        }
        return new ParserAdapter(new OrderParserImpI());

    }
}
