package com.example.service;
import com.example.order.Order;
import com.example.order.OrderInvoice;

import java.util.Comparator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OrderCalculator {


    public List<OrderInvoice> calculate(
            List<Order> orders,
            double startDiscount,
            double discountStep,
            double pricePerkg) {

        List<Order> sortedOrders = orders.stream()
                .sorted(Comparator.comparing(Order::getTime))
                .collect(Collectors.toList());


        Map<String, Double> companyCosts = IntStream.range(0, sortedOrders.size())
                .mapToObj(index -> Map.entry(index, sortedOrders.get(index)))
                .collect(
                        Collectors.groupingBy(
                                entry -> entry.getValue().getCompanyName(),
                                Collectors.summingDouble(entry -> {
                                    double discount = Math.max(0, startDiscount - discountStep * entry.getKey());
                                    double cost = entry.getValue().getKilograms() * pricePerkg * (1 - discount);
                                    return cost;
                                })
                        )
                );

                        List<OrderInvoice> invoices = companyCosts.entrySet().stream()
                                .map(entry -> new OrderInvoice(
                                        entry.getKey(),
                                        entry.getValue()
                                ))
                                .collect(Collectors.toList());
                        return invoices;
    }
    }
