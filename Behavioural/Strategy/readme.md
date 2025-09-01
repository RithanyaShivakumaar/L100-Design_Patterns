# Strategy Pattern – Error Recovery System

## Problem Statement
In applications that need to handle different scenarios with varying algorithms, traditional approaches create several challenges:

1. **Algorithm Coupling**: Client code tightly coupled to specific algorithm implementations
2. **Conditional Complexity**: Large switch/if-else statements for algorithm selection
3. **Difficult Extension**: Adding new algorithms requires modifying existing client code
4. **Code Duplication**: Similar algorithm selection logic scattered throughout the application
5. **Runtime Inflexibility**: Cannot change algorithms dynamically based on context

**Without a proper pattern**: You'd have complex conditional logic determining which algorithm to use, making the system difficult to extend and maintain.

## Solution: Strategy Pattern
The Strategy Pattern solves this by:
- **Encapsulating algorithms** in separate strategy classes with a common interface
- **Enabling runtime algorithm selection** without changing client code
- **Supporting easy extension** with new algorithms without modifying existing code
- **Eliminating conditional complexity** by delegating to strategy objects
- **Promoting algorithm reusability** across different contexts

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

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Strategy directory**
   ```bash
   cd Behavioural/Strategy/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the error recovery system demo**
   ```bash
   java Main
   ```

### Expected Output
The program will demonstrate:
- Different error recovery strategies being applied to various error scenarios
- Runtime strategy switching based on error type and context
- Strategy pattern eliminating complex conditional logic
- Flexible error handling through pluggable recovery algorithms
- Easy extension with new recovery strategies

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `Main.java`
3. Right-click and select "Run" or press the run button
4. View the error recovery system output in the IDE console

### File Structure
- `strategies/RecoveryStrategy.java` - Strategy interface defining recovery contract
- `strategies/RetryStrategy.java`, `FallbackStrategy.java`, etc. - Concrete strategy implementations
- `context/ErrorRecoveryContext.java` - Context class managing current strategy
- `Main.java` - Main demonstration of strategy pattern usage

---
