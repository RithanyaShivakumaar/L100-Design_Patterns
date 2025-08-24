# Adapter Pattern – Legacy System Integration

## Overview
This project demonstrates the **Adapter Design Pattern** using a **Legacy System Integration**.  
The Adapter Pattern allows incompatible interfaces to work together by wrapping an existing class with a new interface, enabling collaboration between classes that couldn't otherwise work together.

## Use Case: Legacy Payment System Integration
A modern e-commerce system that needs to integrate with:
- **Modern Payment Gateway** - new credit card processing system
- **Legacy Payment System** - old bank transfer system
- **Unified Interface** - single payment method for all transactions
- **Backward Compatibility** - existing code continues to work
- **Seamless Integration** - new and old systems work together

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Target Interface** | Expected interface by client | `PaymentProcessor` |
| **Adaptee** | Existing incompatible class | `LegacyBankSystem` |
| **Adapter** | Wraps adaptee to match target | `BankPaymentAdapter` |
| **Client** | Uses target interface | `EcommerceSystem` |

## How It Works

### 1. **Target Interface**
- Defines the **expected interface** that clients will use
- Represents the **modern, standardized** way of doing operations
- Ensures **consistency** across different payment methods

### 2. **Adaptee (Legacy System)**
- **Existing class** with incompatible interface
- Contains **valuable functionality** that needs to be preserved
- Has **different method names** and parameter structures

### 3. **Adapter Class**
- **Wraps the adaptee** to match the target interface
- **Translates calls** from target interface to adaptee methods
- **Maintains functionality** while providing new interface
- **Handles data conversion** between different formats

### 4. **Client Code**
- **Uses only the target interface** without knowing about adapters
- **Treats all payment methods** the same way
- **Benefits from unified interface** across different systems
