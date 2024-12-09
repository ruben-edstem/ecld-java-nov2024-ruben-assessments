Requirements
Implement a customer order processing system that handles different types of orders
and demonstrates usage of polymorphism, collections, and iterators.
Classes to Implement
1. Order (Abstract class)
- orderId: String
- customerName: String
- orderDate: LocalDateTime
- items: List<OrderItem>
+ abstract double calculateTotal()
+ abstract double calculateDiscount()
2. OrderItem
- productId: String
- quantity: int
- pricePerUnit: double
3. RegularOrder (extends Order)
- minimumForDiscount: double (default 100)
- discountPercent: double (default 10%)
4. PriorityOrder (extends Order)
- expressShipping: boolean
- additionalFee: double
5. OrderProcessor
- orders: List<Order>
+ processOrder(Order order)
+ getOrdersByCustomer(String customerName)
+ getTotalRevenue()
+ getAverageOrderValue()
+ getTopCustomers(int n)
Required Functionality
1. Implement order processing with different calculation strategies
2. Use LinkedList for storing orders (to demonstrate understanding of when to use
LinkedList)
3. Implement custom Iterator for processing orders
4. Use proper exception handling
5. Implement sorting and filtering using Comparator
Tasks
1. Process different types of orders with their specific discount rules
2. Calculate total revenue for all orders
3. Find top customers by order value
4. Process orders in FIFO manner
5. Handle concurrent order processing
