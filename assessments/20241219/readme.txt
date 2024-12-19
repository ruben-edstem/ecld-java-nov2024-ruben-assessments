Exercise 1: E-Commerce Order Processing System


Background

You are tasked with building an order processing system for a large e-commerce
platform that handles millions of orders daily. The system needs to efficiently manage
both recent and historical orders while supporting frequent updates and queries.

Requirements

1. Implement a dual-list system:
	Recent orders (last 24 hours) requiring frequent updates and access
	Historical orders requiring mostly read operations

2. Support order searching by:
	Order ID
	Customer ID
	Order status

3. Implement efficient order status updates

4. Create custom iteration patterns for different views:
	By date
	By status
	By customer

5. Handle primitive type order amounts through autoboxing


Code Structure

class Order {
	private Long orderId;
	private Long customerId;
	private double amount;
	private OrderStatus status;
	private LocalDateTime orderTime;
	// Add constructors, getters, setters
}

interface OrderProcessor extends Iterable<Order> {
	void addOrder(Order order);
	void updateOrderStatus(Long orderId, OrderStatus newStatus);
	List<Order> getOrdersByCustomer(Long customerId);
	Iterator<Order> getOrdersByDateRange(LocalDateTime start, LocalDateTime end);
	// Add other necessary methods
}

class EcommerceOrderManager implements OrderProcessor {
	private List<Order> recentOrders; // Choose appropriate List implementation
	private List<Order> historicalOrders; // Choose appropriate List implementation
	// Implement all required methods
}