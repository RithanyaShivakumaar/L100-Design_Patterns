# Strategy Pattern – Error Recovery System

## Overview
This project demonstrates the **Strategy Design Pattern** using an **Error Recovery System**.  
In software applications, different types of errors require different recovery approaches. Instead of using complex conditional statements or hardcoded error handling, the **Strategy Pattern** allows us to encapsulate different error recovery algorithms and switch between them at runtime.

The **Strategy Pattern** helps:
- **Encapsulate algorithms** - each recovery strategy is a separate class
- **Enable runtime strategy switching** - change recovery behavior without changing client code
- **Maintain open/closed principle** - add new strategies without modifying existing code
- **Eliminate conditional complexity** - no more if-else chains for different error types

---

## Use Case: Error Recovery System
A robust application that needs to handle various types of errors:
- **API Timeouts** - might benefit from retry logic
- **Database Failures** - might need fallback mechanisms
- **Validation Issues** - might just need logging and continuation
- **Critical Failures** - might require escalation to human operators

The Strategy Pattern creates a **flexible error handling system**:
- **Context** (ErrorRecoveryContext) manages the current recovery strategy
- **Strategies** (RecoveryStrategy implementations) define different recovery approaches
- **Runtime switching** allows changing recovery behavior based on error context

---

## Folder Structure
```
├── src/
│ ├── strategies/
│ │ ├── RecoveryStrategy.java        
│ │ ├── RetryStrategy.java           
│ │ ├── FallbackStrategy.java        
│ │ ├── LogAndContinueStrategy.java  
│ │ └── EscalationStrategy.java      
│ ├── context/
│ │ └── ErrorRecoveryContext.java   
│ └── Main.java                     
```

## How It Works

### 1. **Strategy Interface**
- Defines the **contract** that all recovery strategies must implement
- **RecoveryStrategy** interface with `recover(Exception e)` method
- Allows for **polymorphic behavior** across different strategies

### 2. **Concrete Strategies**
- **RetryStrategy**: Attempts to retry the failed operation
- **FallbackStrategy**: Uses alternative resources or methods
- **LogAndContinueStrategy**: Logs the error and continues execution
- **EscalationStrategy**: Escalates critical errors to human operators

### 3. **Context Class**
- **ErrorRecoveryContext** manages the current strategy
- **Composition over inheritance** - has-a relationship with strategies
- **Strategy switching** at runtime via `setStrategy()` method
- **Delegates error handling** to the current strategy

### 4. **Client Code**
- **Main class** demonstrates strategy switching
- **No conditional logic** - clean, readable code
- **Easy to extend** with new recovery strategies

---
