# Builder Pattern – Complex Object Construction

## Overview
This project demonstrates the **Builder Design Pattern** using a **Complex Object Construction**.  
The Builder Pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

## Use Case: Computer Configuration Builder
A computer assembly system that builds complex configurations:
- **CPU Selection** - different processor types and speeds
- **Memory Configuration** - RAM capacity and type
- **Storage Options** - SSD, HDD, or hybrid setups
- **Graphics Cards** - integrated or dedicated GPUs
- **Step-by-Step Building** - guided construction process
- **Validation** - ensures compatible component combinations

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Builder Interface** | Defines construction steps | `ComputerBuilder` |
| **Concrete Builder** | Implements construction logic | `GamingComputerBuilder` |
| **Director** | Orchestrates construction process | `ComputerEngineer` |
| **Product** | Complex object being built | `Computer` |
| **Client** | Uses director to build products | `Main` class |

## How It Works

### 1. **Builder Interface**
- Defines **construction methods** for each component
- Provides **fluent interface** for method chaining
- Ensures **consistent building process** across different builders

### 2. **Concrete Builder Implementation**
- **GamingComputerBuilder**: Specializes in gaming configurations
- **WorkstationBuilder**: Specializes in professional workstations
- **BudgetBuilder**: Specializes in cost-effective configurations
- Each builder **implements the same interface** with different logic

### 3. **Director Class**
- **Orchestrates the building process** using a builder
- **Defines the construction sequence** and order
- **Ensures all required steps** are completed
- **Provides high-level control** over the building process

### 4. **Product Object**
- **Complex object** with many components
- **Immutable once built** - cannot be modified after construction
- **Validates component compatibility** during construction
- **Provides access methods** to retrieve configuration details
