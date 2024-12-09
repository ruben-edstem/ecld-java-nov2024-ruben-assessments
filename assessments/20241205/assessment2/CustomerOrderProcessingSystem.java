package com.edstem.ecld.assessment2;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CustomerOrderProcessingSystem {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter order type (1 for Regular, 2 for Priority, 0 to exit): ");
            int orderType = scanner.nextInt();
            if (orderType == 0) {
                break;
            }

            System.out.print("Enter Order ID: ");
            String orderId = scanner.next();
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.next();
            LocalDateTime orderDate = LocalDateTime.now();

            Order order = null;
            if (orderType == 1) {
                order = new RegularOrder(orderId, customerName, orderDate);
            } else if (orderType == 2) {
                System.out.print("Is express shipping required? (true/false): ");
                boolean expressShipping = scanner.nextBoolean();
                System.out.print("Enter additional fee: ");
                double additionalFee = scanner.nextDouble();
                order = new PriorityOrder(orderId, customerName, orderDate, expressShipping, additionalFee);
            } else {
                System.out.println("Invalid order type. Please try again.");
                continue;
            }

            while (true) {
                System.out.print("Enter Product ID (or 'done' to finish adding items): ");
                String productId = scanner.next();
                if (productId.equalsIgnoreCase("done")) {
                    break;
                }
                System.out.print("Enter Quantity: ");
                int quantity = scanner.nextInt();
                System.out.print("Enter Price per Unit: ");
                double pricePerUnit = scanner.nextDouble();

                order.addItem(new OrderItem(productId, quantity, pricePerUnit));
            }

            orderProcessor.processOrder(order);
            System.out.println("Order processed successfully!\n");
        }


        System.out.println("Total Revenue: $" + orderProcessor.getTotalRevenue());

        System.out.println("Average Order Value: $" + orderProcessor.getAverageOrderValue());

        System.out.print("Enter customer name to retrieve orders: ");
        String customerName = scanner.next();
        List<Order> customerOrders = orderProcessor.getOrdersByCustomer(customerName);
        System.out.println("Orders for " + customerName + ":");
        for (Order order : customerOrders) {
            System.out.println("Order ID: " + order.orderId + ", Total Value: $" + order.getOrderValue());
        }

        System.out.print("Top 3 customers by order value: ");
        List<String> topCustomers = orderProcessor.getTopCustomers(3);
        System.out.println("Top Customers:");
        for (String topCustomer : topCustomers) {
            System.out.println(topCustomer);
        }

        System.out.println("Processing order in FIFO manner:");
        Iterator<Order> orderIterator = orderProcessor.iterator();
        while (orderIterator.hasNext()) {
            Order order = orderIterator.next();
            System.out.println("Processing Order ID: " + order.orderId + ", Total Value: $" + order.getOrderValue());
        }
    }
}
