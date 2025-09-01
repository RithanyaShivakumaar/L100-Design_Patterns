# Bridge Design Pattern - Payment Processing Demo

## Problem Statement
In payment processing systems, you need to support multiple payment methods and multiple payment gateways. The challenges include:

1. **Cartesian Product Problem**: Supporting N payment methods with M gateways requires N×M classes
2. **Tight Coupling**: Payment methods directly coupled to specific gateways
3. **Difficult Extension**: Adding new methods or gateways requires extensive code changes
4. **Code Duplication**: Similar logic repeated across different combinations
5. **Maintenance Complexity**: Changes in one gateway affect multiple payment methods

**Without a proper pattern**: You'd have an explosion of classes like `UpiRazorpay`, `UpiPayPal`, `CreditCardRazorpay`, `CreditCardPayPal`, etc.

## Solution: Bridge Pattern
The Bridge Pattern solves this by:
- **Separating abstraction from implementation** allowing independent variation
- **Using composition over inheritance** to avoid class explosion
- **Enabling runtime binding** of payment methods with gateways
- **Supporting easy extension** of both methods and gateways independently
- **Reducing coupling** between payment logic and gateway implementation

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

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Bridge directory**
   ```bash
   cd Structural/Bridge/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the payment processing demo**
   ```bash
   java Main
   ```

### Expected Output
The program will demonstrate:
- UPI payment processed through Razorpay gateway
- Credit card payment processed through PayPal gateway
- Net banking payment processed through Stripe gateway
- Different payment methods working with different gateways seamlessly
- Bridge pattern enabling flexible payment method and gateway combinations

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `Main.java`
3. Right-click and select "Run" or press the run button
4. View the payment processing output in the IDE console

### File Structure
- `abstraction/Payment.java` - Abstract payment class (Abstraction)
- `abstraction/UpiPayment.java`, `CreditCardPayment.java`, `NetBankingPayment.java` - Concrete payment methods
- `implementation/PaymentGateway.java` - Gateway interface (Implementation)
- `implementation/RazorPayGateway.java`, `PayPalGateway.java`, `StripeGateway.java` - Concrete gateways
- `Main.java` - Demonstration of bridge pattern usage

---