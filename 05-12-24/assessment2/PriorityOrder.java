package com.edstem.ecld.assessment2;

import java.time.LocalDateTime;

class PriorityOrder extends Order {
    private boolean expressShipping;
    private double additionalFee;

    public PriorityOrder(String orderId, String customerName, LocalDateTime orderDate, boolean expressShipping, double additionalFee) {
        super(orderId, customerName, orderDate);
        this.expressShipping = expressShipping;
        this.additionalFee = additionalFee;
    }

    @Override
    public double calculateTotal() {
        double total = items.stream().mapToDouble(OrderItem::getTotalPrice).sum();
        if (expressShipping) {
            total += additionalFee;
        }
        return total;
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}