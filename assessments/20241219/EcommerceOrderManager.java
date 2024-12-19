package com.edstem.ecommerce;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

class EcommerceOrderManager implements OrderProcessor {
    private List<Order> recentOrders;
    private List<Order> historicalOrders;

    public EcommerceOrderManager() {
        this.recentOrders = new ArrayList<>();
        this.historicalOrders = new LinkedList<>();
    }

    @Override
    public void addOrder(Order order) {
        if (order.getOrderTime().isAfter(LocalDateTime.now().minusDays(1))) {
            recentOrders.add(order);
        } else {
            historicalOrders.add(order);
        }
    }

    @Override
    public void updateOrderStatus(Long orderId, OrderStatus newStatus) {
        Order order = getOrderById(orderId);
        if (order != null) {
            order.setStatus(newStatus);
        } else {
            throw new NoSuchElementException("Order not found: " + orderId);
        }
    }

    @Override
    public List<Order> getOrdersByCustomer(Long customerId) {
        return recentOrders.stream()
                .filter(order -> order.getCustomerId().equals(customerId))
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Order> getOrdersByDateRange(LocalDateTime start, LocalDateTime end) {
        List<Order> filteredOrders = recentOrders.stream()
                .filter(order -> !order.getOrderTime().isBefore(start) && !order.getOrderTime().isAfter(end))
                .collect(Collectors.toList());
        return filteredOrders.iterator();
    }

    @Override
    public List<Order> searchByStatus(OrderStatus status) {
        return recentOrders.stream()
                .filter(order -> order.getStatus() == status)
                .collect(Collectors.toList());
    }

    @Override
    public Order getOrderById(Long orderId) {
        return recentOrders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Order> searchByCustomerId(Long customerId) {
        return recentOrders.stream()
                .filter(order -> order.getCustomerId().equals(customerId))
                .collect(Collectors.toList());
    }

    @Override
    public List<Order> searchByOrderId(Long orderId) {
        return recentOrders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Order> iterator() {
        List<Order> allOrders = new ArrayList<>(recentOrders);
        allOrders.addAll(historicalOrders);
        return allOrders.iterator();
    }

    public Iterator<Order> iteratorByDate() {
        return recentOrders.stream()
                .sorted(Comparator.comparing(Order::getOrderTime))
                .iterator();
    }

    public Iterator<Order> iteratorByStatus(OrderStatus status) {
        return recentOrders.stream()
                .filter(order -> order.getStatus() == status)
                .iterator();
    }

    public Iterator<Order> iteratorByCustomer(Long customerId) {
        return recentOrders.stream()
                .filter(order -> order.getCustomerId().equals(customerId))
                .iterator();
    }
}