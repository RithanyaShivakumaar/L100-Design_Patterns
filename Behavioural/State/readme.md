# State Pattern – Food Order Management System

## Problem Statement
In systems where objects need to change behavior based on their internal state, traditional approaches create several challenges:

1. **Complex Conditional Logic**: Large switch/if-else statements for different states
2. **Monolithic Classes**: One class handling all state-specific behaviors
3. **Difficult State Management**: Hard to add new states or modify existing ones
4. **Code Duplication**: Similar state-checking logic scattered throughout methods
5. **Maintenance Issues**: Changes to one state affect the entire state management code

**Without a proper pattern**: You'd have methods filled with conditional statements checking the current state, making the code difficult to understand and maintain.

## Solution: State Pattern
The State Pattern solves this by:
- **Encapsulating state-specific behavior** in separate state classes
- **Eliminating conditional statements** by delegating behavior to state objects
- **Making state transitions explicit** and manageable
- **Enabling easy extension** with new states without modifying existing code
- **Localizing state logic** to specific state classes

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

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the State directory**
   ```bash
   cd Behavioural/State/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the food order management demo**
   ```bash
   java Main
   ```

### Expected Output
The program will demonstrate:
- Food order progressing through different states (New → Preparing → Out for Delivery → Delivered)
- State-specific behaviors for each order stage
- State transitions and business rule enforcement
- Cancellation attempts with state-dependent results
- State pattern eliminating complex conditional logic

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `Main.java`
3. Right-click and select "Run" or press the run button
4. View the food order state management output in the IDE console

### File Structure
- `state/OrderState.java` - State interface defining common state operations
- `state/NewOrderState.java`, `PreparingState.java`, `OutForDeliveryState.java`, etc. - Concrete state classes
- `context/FoodOrder.java` - Context class managing current state and delegating operations
- `Main.java` - Main demonstration of state pattern usage

---


