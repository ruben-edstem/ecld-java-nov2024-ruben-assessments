package com.edstem.ecld.assessment2;

import java.time.LocalDateTime;

class RegularOrder extends Order {
    private static final double minimumForDiscount = 100.0;
    private static final double discountPercent = 0.10;

    public RegularOrder(String orderId, String customerName, LocalDateTime orderDate) {
        super(orderId, customerName, orderDate);
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    @Override
    public double calculateDiscount() {
        double total = calculateTotal();
        return total >= minimumForDiscount ? total * discountPercent : 0;
    }
}
