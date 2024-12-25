package com.edstem.ecommerce;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EcommerceOrderManager manager = new EcommerceOrderManager();
        boolean state = true;

        while (state) {
            try {
                System.out.println("\nE-Commerce Order Processing System");
                System.out.println("1. Add Order");
                System.out.println("2. Update Order Status");
                System.out.println("3. Search by Order ID");
                System.out.println("4. Search by Customer ID");
                System.out.println("5. Search by Status");
                System.out.println("6. View All Orders");
                System.out.println("7. View Orders by Date");
                System.out.println("8. View Orders by Status");
                System.out.println("9. View Orders by Customer");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Order ID: ");
                        Long orderId = scanner.nextLong();
                        System.out.print("Enter Customer ID: ");
                        Long customerId = scanner.nextLong();
                        System.out.print("Enter Amount: ");
                        double amount = scanner.nextDouble();
                        if (amount <= 0) {
                            System.out.println("Amount must be positive.");
                            break;
                        }
                        System.out.print("Enter Status (PENDING, SHIPPED, DELIVERED, CANCELLED): ");
                        try {
                            OrderStatus status = OrderStatus.valueOf(scanner.next().toUpperCase());
                            Order order = new Order(orderId, customerId, amount, status, LocalDateTime.now());
                            manager.addOrder(order);
                            System.out.println("Order added successfully.");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid status. Try again.");
                        }
                        break;

                    case 2:
                        System.out.print("Enter Order ID to update: ");
                        Long updateOrderId = scanner.nextLong();
                        System.out.print("Enter new Status (PENDING, SHIPPED, DELIVERED, CANCELLED): ");
                        try {
                            OrderStatus newStatus = OrderStatus.valueOf(scanner.next().toUpperCase());
                            manager.updateOrderStatus(updateOrderId, newStatus);
                            System.out.println("Order status updated successfully.");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid status. Try again.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Order ID to search: ");
                        Long searchOrderId = scanner.nextLong();
                        Order foundOrder = manager.getOrderById(searchOrderId);
                        System.out.println(foundOrder != null ? foundOrder : "Order not found.");
                        break;

                    case 4:
                        System.out.print("Enter Customer ID to search: ");
                        Long searchCustomerId = scanner.nextLong();
                        manager.getOrdersByCustomer(searchCustomerId).forEach(System.out::println);
                        break;

                    case 5:
                        System.out.print("Enter Status to search (PENDING, SHIPPED, DELIVERED, CANCELLED): ");
                        try {
                            OrderStatus searchStatus = OrderStatus.valueOf(scanner.next().toUpperCase());
                            manager.searchByStatus(searchStatus).forEach(System.out::println);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid status. Try again.");
                        }
                        break;

                    case 6:
                        System.out.println("All Orders:");
                        manager.forEach(System.out::println);
                        break;

                    case 7:
                        System.out.println("Orders by Date:");
                        Iterator<Order> dateIterator = manager.iteratorByDate();
                        dateIterator.forEachRemaining(System.out::println);
                        break;

                    case 8:
                        System.out.print("Enter Status to view (PENDING, SHIPPED, DELIVERED, CANCELLED): ");
                        try {
                            OrderStatus viewStatus = OrderStatus.valueOf(scanner.next().toUpperCase());
                            Iterator<Order> statusIterator = manager.iteratorByStatus(viewStatus);
                            statusIterator.forEachRemaining(System.out::println);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid status. Try again.");
                        }
                        break;

                    case 9:
                        System.out.print("Enter Customer ID to view: ");
                        Long viewCustomerId = scanner.nextLong();
                        Iterator<Order> customerIterator = manager.iteratorByCustomer(viewCustomerId);
                        customerIterator.forEachRemaining(System.out::println);
                        break;

                    case 0:
                        state = false;
                        System.out.println("Exiting the system. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error occurred: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
