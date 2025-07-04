# E-Commerce System (Java OOP Project)

A simple console-based e-commerce system built in Java using object-oriented programming principles.

## Features

- Define products with name, price, quantity
- Handle different product types:
  - Expirable products (e.g. Cheese, Biscuits)
  - Shippable products with weight (e.g. TV, Mobile)
- Add products to a shopping cart
- Perform checkout with:
  - Subtotal calculation
  - Shipping cost calculation
  - Total paid amount
  - Balance update
  - Error handling for:
    - Expired products
    - Out-of-stock items
    - Insufficient balance
    - Empty cart
- Shipping service displays a shipment summary

## Technologies

- Java
- OOP concepts (inheritance, interfaces, encapsulation, polymorphism)

## File Structure

src/
│
├── App.java # Entry point of the app
├── Product.java # Base class for all products
├── ExpirableProduct.java # Subclass for products with expiration
├── Shippable.java # Interface for shippable products
├── ShippableProduct.java # Product that can be shipped
├── Customer.java # Customer with name and balance
└── Cart.java # Handles cart logic and checkout

## Sample Output

** Checkout receipt **
2x Scratch Card 20.00

---

Subtotal: 20.00
Shipping: 0.00
Total Paid: 20.00
Remaining Balance: 80.00
