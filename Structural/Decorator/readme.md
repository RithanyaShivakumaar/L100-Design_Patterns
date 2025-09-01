# Decorator Pattern – Coffee Ordering System

## Problem Statement
When building customizable systems like coffee ordering, you face the challenge of supporting numerous combinations of features. The problems include:

1. **Subclass Explosion**: Creating classes for every combination (CoffeeWithMilk, CoffeeWithSugar, CoffeeWithMilkAndSugar, etc.)
2. **Static Combinations**: Subclassing creates fixed combinations that can't be changed at runtime
3. **Code Duplication**: Similar functionality repeated across multiple classes
4. **Inflexibility**: Difficult to add or remove features dynamically
5. **Maintenance Nightmare**: Changes to base functionality affect all subclasses

**Without a proper pattern**: You'd need exponentially growing classes like `CoffeeWithMilkSugarWhippedCreamSyrup` for every possible combination.

## Solution: Decorator Pattern
The Decorator Pattern solves this by:
- **Adding responsibilities dynamically** without altering the object structure
- **Using composition over inheritance** to avoid class explosion
- **Enabling flexible feature combinations** at runtime
- **Supporting transparent layering** of functionalities
- **Maintaining consistent interface** across all decorated objects

## Overview
This project demonstrates the **Decorator Design Pattern** using a **Coffee Ordering System**.  
The Decorator Pattern attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.

## Use Case: Customizable Coffee Orders
A coffee shop system that builds complex orders:
- **Base Coffee** - simple coffee as the foundation
- **Additives** - milk, sugar, whipped cream, syrups
- **Custom Combinations** - mix and match different additives
- **Dynamic Pricing** - cost calculated based on selected items
- **Flexible Ordering** - customers can customize their drinks
- **Extensible System** - easy to add new coffee types and additives

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Component Interface** | Defines common interface | `Coffee` |
| **Concrete Component** | Basic object to be decorated | `SimpleCoffee` |
| **Decorator Abstract** | Base class for all decorators | `CoffeeDecorator` |
| **Concrete Decorators** | Add specific functionality | `MilkDecorator`, `SugarDecorator` |
| **Client** | Uses decorated objects | `CoffeeShop` |

## How It Works

### 1. **Component Interface**
- Defines **core operations** that all coffee objects support
- Ensures **consistent interface** across base coffee and decorators
- Provides **polymorphic behavior** for all coffee types

### 2. **Concrete Component**
- **SimpleCoffee**: Basic coffee without any additives
- **Implements core functionality** like cost calculation and description
- **Serves as foundation** for all decorated variations
- **Cannot be decorated further** - it's the base object

### 3. **Decorator Abstract Class**
- **Wraps a coffee component** and adds new behavior
- **Maintains reference** to the wrapped component
- **Delegates core operations** to the wrapped component
- **Provides base structure** for all concrete decorators

### 4. **Concrete Decorators**
- **MilkDecorator**: Adds milk functionality and cost
- **SugarDecorator**: Adds sugar functionality and cost
- **WhippedCreamDecorator**: Adds whipped cream functionality and cost
- **SyrupDecorator**: Adds flavored syrup functionality and cost
- Each decorator **extends the base functionality** in a specific way

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Decorator directory**
   ```bash
   cd Structural/Decorator/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the coffee shop demo**
   ```bash
   java Main
   ```

### Expected Output
The program will demonstrate:
- Creation of a simple coffee base
- Dynamic addition of decorators (milk, sugar, whipped cream, syrup)
- Flexible combinations of coffee customizations
- Cost calculation that includes all decorators
- Description building that shows all added features

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `Main.java`
3. Right-click and select "Run" or press the run button
4. View the coffee customization output in the IDE console

### File Structure
- `component/Coffee.java` - Common interface for all coffee objects (Component)
- `component/SimpleCoffee.java` - Basic coffee implementation (Concrete Component)
- `decorator/CoffeeDecorator.java` - Base decorator class (Decorator)
- `decorator/MilkDecorator.java`, `SugarDecorator.java`, etc. - Concrete decorators
- `Main.java` - Demonstration of decorator pattern usage
