package com.edstem.ecommerce;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

interface OrderProcessor extends Iterable<Order> {
    void addOrder(Order order);
    void updateOrderStatus(Long orderId, OrderStatus newStatus);
    List<Order> getOrdersByCustomer(Long customerId);
    Iterator<Order> getOrdersByDateRange(LocalDateTime start, LocalDateTime end);
    List<Order> searchByStatus(OrderStatus status);
    Order getOrderById(Long orderId);
    List<Order> searchByCustomerId(Long customerId);
    List<Order> searchByOrderId(Long orderId);
}



