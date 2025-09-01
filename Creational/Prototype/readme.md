# Prototype Pattern – Event Ticketing System

## Problem Statement
When creating multiple similar objects (like event tickets), traditional object creation can be inefficient and repetitive. The challenges include:

1. **Expensive Object Creation**: Complex objects with heavy initialization costs
2. **Repetitive Setup**: Setting the same base properties for multiple objects
3. **Performance Issues**: Multiple constructor calls for similar objects
4. **Code Duplication**: Repeating initialization logic across the application
5. **Maintenance Overhead**: Changes to base properties require updates in multiple places

**Without a proper pattern**: You'd have expensive object creation, repeated initialization code, and performance bottlenecks when creating many similar objects.

## Solution: Prototype Pattern
The Prototype Pattern solves this by:
- **Cloning existing objects** instead of creating from scratch
- **Reusing initialized state** from prototype objects
- **Improving performance** by avoiding expensive constructor calls
- **Centralizing base configuration** in prototype templates
- **Enabling efficient mass object creation** with customization

## Overview
This project demonstrates the **Prototype Design Pattern** using an **Event Ticketing System**.  
The Prototype Pattern creates new objects by cloning an existing object, known as the prototype, instead of creating new instances from scratch through constructors.

## Use Case: Event Ticketing System
A ticketing system that efficiently creates multiple tickets for the same event:
- **Template-Based Creation** - one prototype ticket serves as a template for all others
- **Rapid Cloning** - create new tickets instantly by cloning the prototype
- **Consistent Base Properties** - all tickets share the same event name, price, and structure
- **Customizable Unique Properties** - each ticket gets unique seat, holder name, and barcode
- **Performance Optimization** - avoid expensive constructor calls for similar objects
- **Maintenance Efficiency** - change event details in one place, affects all future tickets

## Folder Structure
```
Creational/Prototype/
├── README.md                           # This documentation file
└── src/                                # Source code directory
    ├── interfaces/                     # Interface definitions
    │   └── TicketPrototype.java        # Prototype interface defining clone contract
    ├── prototype/                      # Concrete prototype implementations
    │   └── EventTicket.java            # Concrete prototype implementation with cloning logic
    └── demo/                           # Client demonstrations
        └── ProtoTypeDemo.java          # Main demonstration of prototype pattern usage
```

## Data Flow

### 1. **Prototype Creation**
```
Main → Create EventTicket prototype → Set base properties (eventName, price)
       ↓
       Prototype ready with shared properties
       ↓
       Prototype serves as template for all future tickets
```

### 2. **Ticket Cloning Process**
```
Request for new ticket → Get prototype instance → Call prototype.clone()
                        ↓
                        New ticket created with copied base properties
                        ↓
                        Customize unique properties (seat, holderName, barcode)
                        ↓
                        Return customized ticket
```

### 3. **Property Inheritance & Customization**
```
Base Properties (Shared):
├── eventName: "Concert Night"     ← Same for all tickets
├── price: $99.99                  ← Same for all tickets
└── structure: Ticket format       ← Same for all tickets

Unique Properties (Customized):
├── seat: A1, A2, A3...           ← Different for each ticket
├── holderName: Alice, Bob, Carol ← Different for each ticket
└── barcode: BC123, BC456, BC789  ← Different for each ticket
```

### 4. **Comparison: With vs Without Prototype**
```
WITH PROTOTYPE (Efficient):
Prototype → Clone → Customize → Done
(1 constructor call + customization)

WITHOUT PROTOTYPE (Traditional):
Constructor → Set all properties → Done
(Full constructor call for each ticket)
```

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Prototype Interface** | Defines cloning contract | `TicketPrototype.clone()` |
| **Concrete Prototype** | Implements cloning logic | `EventTicket.clone()` |
| **Client** | Requests object cloning | `PrototypeDemo.main()` |
| **Clone Operation** | Creates copy of prototype | `prototype.clone()` |

## How It Works

### 1. **Prototype Interface (TicketPrototype)**
- **Defines clone method** that all prototypes must implement
- **Ensures consistent cloning behavior** across different object types
- **Provides type-safe cloning** with proper return types
- **Establishes contract** for prototype implementations

### 2. **Concrete Prototype (EventTicket)**
- **Implements clone method** with custom logic
- **Copies base properties** (eventName, price) to new instance
- **Generates unique properties** (barcode) for each clone
- **Allows customization** of variable properties (seat, holderName)

### 3. **Cloning Implementation**
- **Efficient copying** of shared properties
- **Unique identifier generation** for each clone
- **Customization hooks** for specific properties
- **Performance optimization** over constructor-based creation

### 4. **Client Usage (PrototypeDemo)**
- **Creates prototype once** with base properties
- **Clones prototype multiple times** for different tickets
- **Customizes each clone** with unique information
- **Demonstrates efficiency** of prototype approach

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Prototype directory**
   ```bash
   cd Creational/Prototype/src
   ```

2. **Compile the Java files**
   ```bash
   javac interfaces/*.java prototype/*.java demo/*.java
   ```

3. **Run the demonstration**
   ```bash
   java demo.ProtoTypeDemo
   ```

### Expected Output
The program will demonstrate:
- Creation of a prototype ticket with base event information
- Cloning the prototype to create multiple tickets
- Customization of each cloned ticket with unique details (seat, holder name)
- Performance comparison between prototype cloning and traditional object creation
- Display of all created tickets with their unique properties

### File Structure
- `interfaces/TicketPrototype.java` - Interface defining the clone contract
- `prototype/EventTicket.java` - Concrete prototype implementation with cloning logic
- `demo/ProtoTypeDemo.java` - Main class demonstrating the pattern usage

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `demo/ProtoTypeDemo.java`
3. Right-click and select "Run" or press the run button
4. View the output in the IDE console

### Architecture Benefits
This improved folder structure provides:
- **Clear Separation of Concerns**: Interfaces, implementations, and demos are organized separately
- **Better Maintainability**: Easy to locate and modify specific components
- **Scalability**: Simple to add new prototypes or demo scenarios
- **Professional Organization**: Follows standard Java project structure conventions
- **Enhanced Readability**: Clear understanding of component relationships and dependencies

