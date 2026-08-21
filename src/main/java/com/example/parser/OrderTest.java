package com.example.parser;
import com.example.OrderParserFactory;
import com.example.OrderParserInterface;
import com.example.order.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class OrderTest {

    public static void main(String[] args){
        List<Order> orders = new ArrayList<>();
        LocalDateTime time1 = LocalDateTime.parse("2021-02-09T16:00:22");
        Order order1 = new Order("Industrial", 8800, time1);
        orders.add(order1);


        String line = "2021-02-09T16:00:22|Industrial|8800";
        OrderParser parser = new OrderParser();
        Order order = parser.parse(line);
        System.out.println(order);

        String lineWithHash = "2021-02-09T16:00:22#Industrial#8800";
        ParserAdapter adapter = new ParserAdapter(parser);
        Order order2 = adapter.parse(lineWithHash);
        System.out.println(order2);

        OrderParserFactory factory = new OrderParserFactory();
        OrderParserInterface fileparser = factory.getParser("orders.txt");
        OrderParserInterface fileparser2 = factory.getParser("orders");

        System.out.println(fileparser.getClass());
        System.out.println(fileparser2.getClass());


    }

    }

