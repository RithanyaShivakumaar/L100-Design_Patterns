# State Pattern – Food Order Management System

## Overview
This project demonstrates the **State Design Pattern** using a **Food Order Management System**.  
In a food delivery platform, orders go through different stages: from being placed to preparation, delivery, and completion. Instead of using complex conditional statements to handle each stage, the **State Pattern** encapsulates the behavior for each order state in separate classes.

The **State Pattern** helps:
- **Eliminate complex conditional logic** by encapsulating state-specific behavior
- **Make state transitions explicit** and easy to understand
- **Add new states easily** without modifying existing code
- **Maintain clean separation** between different order stages

---

## Use Case: Food Delivery Order Lifecycle
A food delivery system:
- **Orders progress through multiple stages**: New → Preparing → Out for Delivery → Delivered
- **Each stage has different behaviors**: Some allow cancellation, others don't
- **State transitions are well-defined**: Orders can only move forward or be canceled
- **Business rules vary by state**: Different actions are valid at different stages

The State Pattern creates a **state machine** where:
- **Each order stage** is represented by a separate state class
- **State transitions** are handled by the context (FoodOrder)
- **Behavior changes** automatically based on current state
- **Business rules** are enforced at the state level

---

## Folder Structure
```
├── src/
│ ├── context/
│ │ └── FoodOrder.java         # Context class that manages state
│ ├── state/
│ │ ├── OrderState.java         # State interface
│ │ ├── NewOrderState.java      # Initial state
│ │ ├── PreparingState.java     # Preparation state
│ │ ├── OutForDeliveryState.java # Delivery state
│ │ ├── DeliveredState.java     # Final state
│ │ └── CanceledState.java      # Cancellation state
│ └── Main.java                 # Main demonstration
```

## How It Works

### 1. **OrderState Interface**
- Defines **common methods** for all order states
- **next()**: Moves order to next state
- **cancel()**: Attempts to cancel the order
- **printStatus()**: Shows current order status

### 2. **FoodOrder (Context)**
- **Maintains current state** reference
- **Delegates operations** to current state object
- **Manages state transitions** via setState() method
- **Provides public interface** for client operations

### 3. **Concrete State Classes**
- **NewOrderState**: Initial state, allows cancellation
- **PreparingState**: Order being prepared, no cancellation
- **OutForDeliveryState**: Order in transit, no cancellation
- **DeliveredState**: Order completed, no further actions
- **CanceledState**: Order terminated, no progression

### 4. **State Transitions**
- **New → Preparing**: Order confirmed by restaurant
- **Preparing → Out for Delivery**: Order ready for delivery
- **Out for Delivery → Delivered**: Order successfully delivered
- **Any → Canceled**: Order cancellation (if allowed)

---


