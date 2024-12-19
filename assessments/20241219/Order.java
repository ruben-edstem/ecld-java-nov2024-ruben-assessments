package com.edstem.ecommerce;

import java.time.LocalDateTime;

enum OrderStatus {
    PENDING, SHIPPED, DELIVERED, CANCELLED
}

class Order {
    private Long orderId;
    private Long customerId;
    private double amount;
    private OrderStatus status;
    private LocalDateTime orderTime;

    public Order(Long orderId, Long customerId, double amount, OrderStatus status, LocalDateTime orderTime) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.amount = amount;
        this.status = status;
        this.orderTime = orderTime;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public double getAmount() {
        return amount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    @Override
    public String toString() {
        return "Order[ID=" + orderId + ", CustomerID=" + customerId + ", Amount=" + amount + ", Status=" + status + ", Time=" + orderTime + "]";
    }
}