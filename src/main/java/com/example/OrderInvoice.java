package com.example;

import com.example.order.Order;

public class OrderInvoice {
    String companyName;
    double totalCost;
    public OrderInvoice(String companyName, double totalCost) {
        this.companyName = companyName;
        this.totalCost = totalCost;
    }
    public String getCompanyName(){

        return companyName;
    }
    public double getTotalCost() {
        return totalCost;
    }
}