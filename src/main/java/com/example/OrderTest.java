package com.example;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class OrderTest {

    public static void main(String[] args){
        List<Order> orders = new ArrayList<>();
        LocalDateTime time1 = LocalDateTime.parse("2021-02-09T16:00:22");
        Order order1 = new Order("Industrial", 8800, time1);
        orders.add(order1);
        }

    }

