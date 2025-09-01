# Visitor Pattern – Medical Records System

## Problem Statement
When you need to perform multiple operations on a collection of objects with different types, traditional approaches create several challenges:

1. **Polluted Classes**: Adding new operations requires modifying existing classes
2. **Violation of Single Responsibility**: Classes contain both data and various operations
3. **Difficult Extension**: Adding new operations affects all existing classes
4. **Type-Specific Logic**: Complex conditional statements to handle different object types
5. **Maintenance Issues**: Operations scattered across multiple classes instead of being centralized

**Without a proper pattern**: Each time you need a new operation (billing, reporting, analysis), you'd have to modify every existing class, violating the open/closed principle.

## Solution: Visitor Pattern
The Visitor Pattern solves this by:
- **Separating operations from data structures** by moving operations to visitor classes
- **Enabling easy addition of new operations** without modifying existing classes
- **Centralizing related operations** in dedicated visitor implementations
- **Supporting type-safe operations** through double dispatch mechanism
- **Maintaining clean separation of concerns** between data and operations

## Overview
This project demonstrates the **Visitor Design Pattern** using a **Medical Records System**.  
The Visitor Pattern allows you to add new operations to existing object structures without modifying the classes themselves, promoting separation of concerns and extensibility.

## Use Case: Electronic Health Records (EHR)
A healthcare system that processes different types of medical documents:
- **Lab Reports** - blood tests, diagnostic procedures
- **Prescriptions** - medications and treatments
- **Operations** - billing calculations, history summaries
- **Extensibility** - add new document types and operations easily

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Element** | Defines accept method | `IMedicalRecord` |
| **Concrete Element** | Implements accept method | `LabReport`, `Prescription` |
| **Visitor** | Defines visit methods for each element | `IVisitor` |
| **Concrete Visitor** | Implements specific operations | `BillingVisitor`, `HistorySummaryVisitor` |
| **Object Structure** | Manages element collection | `PatientEHR` |

## How It Works

### 1. **Element Interface**
- `accept(IVisitor visitor)` - enables visitor access
- Each concrete element implements this method
- Calls `visitor.visit(this)` for double dispatch

### 2. **Concrete Elements**
- **LabReport**: Contains test name and cost
- **Prescription**: Contains medication and cost
- Both implement `accept()` method for visitor access

### 3. **Visitor Interface**
- Overloaded `visit()` methods for each element type
- Enables type-specific operations
- Supports double dispatch mechanism

### 4. **Concrete Visitors**
- **BillingVisitor**: Calculates total costs
- **HistorySummaryVisitor**: Generates medical summaries
- Each implements different operations on the same data

### 5. **Object Structure**
- **PatientEHR**: Manages collection of medical records
- `processWith(IVisitor)` - applies visitor to all records

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Visitor directory**
   ```bash
   cd Behavioural/Visitor/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the medical records system demo**
   ```bash
   java Main
   ```

### Expected Output
The program will demonstrate:
- Different types of medical records (Lab Reports, Prescriptions) being processed
- Multiple visitors (BillingVisitor, HistorySummaryVisitor) performing different operations
- Visitor pattern enabling new operations without modifying existing record classes
- Double dispatch mechanism for type-safe visitor operations
- Separation of concerns between data structures and operations

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `Main.java`
3. Right-click and select "Run" or press the run button
4. View the medical records processing output in the IDE console

### File Structure
- `documents/IMedicalRecord.java` - Element interface defining accept method
- `documents/LabReport.java`, `Prescription.java` - Concrete elements (medical records)
- `visitors/IVisitor.java` - Visitor interface defining visit methods
- `visitors/BillingVisitor.java`, `HistorySummaryVisitor.java` - Concrete visitor implementations
- `model/PatientEHR.java` - Object structure managing medical records collection
- `Main.java` - Main demonstration of visitor pattern usage