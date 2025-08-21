# Decorator Design Pattern - Online Shopping Cart Demo

## Overview
This project demonstrates the **Decorator Design Pattern** using an **Online Shopping Cart** example.  
It allows dynamically adding **extra features** to products without modifying the original product class.

- **Component:** Product (Smartphone, Laptop, etc.)  
- **Decorators:** Gift Wrap, Discount, Express Delivery  

This design ensures flexibility and scalability in e-commerce systems, allowing multiple features to be layered dynamically.

---

## Folder Structure

```
├── component/
│ └── Product.java
├── decorator/
│ ├── ProductDecorator.java
│ ├── GiftWrapDecorator.java
│ ├── DiscountDecorator.java
│ └── ExpressDeliveryDecorator.java
├── Main.java
```

---

## How It Works
1. **Product** (interface) defines the basic product operations.  
2. **ProductDecorator** (abstract class) implements the Product interface and holds a reference to a Product object.  
3. Concrete decorators (`GiftWrapDecorator`, `DiscountDecorator`, `ExpressDeliveryDecorator`) extend `ProductDecorator` and override methods to add new behavior.  
4. The decorator pattern allows **dynamic composition** of product features without altering the original class.
