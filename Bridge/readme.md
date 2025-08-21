# Bridge Design Pattern - Payment Processing Demo

## Overview
This project demonstrates the **Bridge Design Pattern** using a **Payment Processing System** as an example.  
It decouples **payment methods** from **payment gateways**, allowing independent variations without modifying existing code.

- **Abstraction:** Payment methods (UPI, Credit Card, Net Banking)  
- **Implementation:** Payment gateways (Razorpay, PayPal, Stripe)

This design ensures flexibility and scalability for real-world applications like e-commerce platforms.

---

## Folder Structure

```
├── abstraction/
│ ├── Payment.java
│ ├── UpiPayment.java
│ ├── CreditCardPayment.java
│ └── NetBankingPayment.java
├── implementation/
│ ├── PaymentGateway.java
│ ├── RazorpayGateway.java
│ ├── PayPalGateway.java
│ └── StripeGateway.java
├── Main.java
```
---

## How It Works
1. **Payment** (abstract class) defines the generic payment operation.  
2. Concrete payment types (`UpiPayment`, `CreditCardPayment`, `NetBankingPayment`) extend `Payment` and delegate the processing to a **PaymentGateway**.  
3. **PaymentGateway** (interface) defines the method `processPayment()`.  
4. Concrete gateways (`RazorpayGateway`, `PayPalGateway`, `StripeGateway`) implement the actual payment processing.  
5. The **bridge** allows pairing any payment type with any gateway dynamically.

---