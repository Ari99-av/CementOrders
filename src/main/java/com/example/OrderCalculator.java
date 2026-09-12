package com.example;
import com.example.order.Order;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class OrderCalculator {
    double startDiscount;
    double discountStep;
    double pricePerkg;

    public OrderCalculator(double startDiscount, double discountStep, double pricePerkg) {
        this.startDiscount = startDiscount;
        this.discountStep = discountStep;
        this.pricePerkg = pricePerkg;
    }

    public List<OrderInvoice> calculate(List<Order> orders) {
        List<OrderInvoice> invoices = new ArrayList<>();
        Map<String, Double> companyCosts = new HashMap<>();

        int orderNumber = 0;

        for (Order order : orders) {
            orderNumber++;

            double discount = startDiscount - discountStep * (orderNumber - 1);
            double cost = order.getKilograms() * pricePerkg * (1 - discount);
            companyCosts.put(order.getCompanyName(), companyCosts.getOrDefault(order.getCompanyName(), 0.0)+ cost);

            if (discount < 0) {
                discount = 0;
            }
        }
        for (Map.Entry<String, Double> entry : companyCosts.entrySet()) {
            OrderInvoice invoice = new OrderInvoice(entry.getKey(), entry.getValue());
            invoices.add(invoice);
        }

        return invoices;
    }
}
void main() {
}