Exercise 1: Library Book Management System
Requirements
Create a simple library book management system that demonstrates your understanding of
OOP concepts, inheritance, polymorphism, and collection handling.
Classes to Implement
1. LibraryItem (Abstract class)
- id: String
- title: String
- available: boolean
+ abstract double calculateLateFee(int daysLate)
2. Book (extends LibraryItem)
- author: String
- isbn: String
- lateFeePerDay: double (default $2)
3. Magazine (extends LibraryItem)
- issueDate: LocalDate
- publisher: String
- lateFeePerDay: double (default $1)
4. Library (Main management class)
- items: List<LibraryItem>
+ addItem(LibraryItem item)
+ removeItem(String id)
+ searchByTitle(String title)
+ borrowItem(String id)
+ returnItem(String id)
+ getOverdueItems(int daysOverdue)
Required Functionality
1. Implement proper inheritance hierarchy
2. Use ArrayList to store library items
3. Implement search functionality using Streams API
4. Handle proper exception cases
5. Implement unit tests for core functionality
