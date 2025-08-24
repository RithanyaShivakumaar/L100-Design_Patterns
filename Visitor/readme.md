# Visitor Pattern – Medical Records System

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