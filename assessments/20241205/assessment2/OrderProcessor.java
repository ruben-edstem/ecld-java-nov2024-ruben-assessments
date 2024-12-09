package com.edstem.ecld.assessment2;

import java.util.*;

class OrderProcessor {
    private List<Order> orders;

    public OrderProcessor() {
        this.orders = new LinkedList<>();
    }

    public void processOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersByCustomer(String customerName) {
        List<Order> customerOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCustomerName().equalsIgnoreCase(customerName)) {
                customerOrders.add(order);
            }
        }
        return customerOrders;
    }

    public double getTotalRevenue() {
        return orders.stream().mapToDouble(Order::getOrderValue).sum();
    }

    public double getAverageOrderValue() {
        return orders.isEmpty() ? 0 : getTotalRevenue() / orders.size();
    }

    public List<String> getTopCustomers(int n) {
        Map<String, Double> customerTotals = new HashMap<>();
        for (Order order : orders) {
            customerTotals.put(order.getCustomerName(), customerTotals.getOrDefault(order.getCustomerName(), 0.0) + order.getOrderValue());
        }

        return customerTotals.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(n)
                .map(Map.Entry::getKey)
                .toList();
    }

    public Iterator<Order> iterator() {
        return orders.iterator();
    }
}
