# Abstract Factory Pattern – UI Component System

## Overview
This project demonstrates the **Abstract Factory Design Pattern** using a **UI Component System**.  
The Abstract Factory Pattern provides an interface for creating families of related objects without specifying their concrete classes, ensuring that the created objects are compatible with each other.

## Use Case: Cross-Platform UI Components
A UI framework that creates consistent component families:
- **Windows Components** - buttons, text fields, checkboxes for Windows
- **Mac Components** - buttons, text fields, checkboxes for macOS
- **Linux Components** - buttons, text fields, checkboxes for Linux
- **Component Consistency** - ensures all components in a family work together
- **Platform Abstraction** - client code doesn't know about specific platform implementations

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Abstract Factory** | Defines interface for creating families | `UIFactory` |
| **Concrete Factory** | Implements creation of specific family | `WindowsFactory`, `MacFactory` |
| **Abstract Product** | Defines interface for product family | `Button`, `TextField` |
| **Concrete Product** | Implements specific platform products | `WindowsButton`, `MacButton` |
| **Client** | Uses factory to create products | `Main` class |

## How It Works

### 1. **Abstract Factory Interface**
- Defines **creation methods** for each product type
- Ensures **compatibility** between products in the same family
- Provides **platform-independent** interface for clients

### 2. **Concrete Factory Implementations**
- **WindowsFactory**: Creates Windows-style UI components
- **MacFactory**: Creates macOS-style UI components
- **LinuxFactory**: Creates Linux-style UI components
- Each factory ensures **consistent styling** across all components

### 3. **Abstract Product Interfaces**
- **Button**: Defines common button behavior
- **TextField**: Defines common text field behavior
- **Checkbox**: Defines common checkbox behavior
- Each interface ensures **consistent API** across platforms

### 4. **Concrete Product Implementations**
- **Windows Products**: Implement Windows-specific UI behavior
- **Mac Products**: Implement macOS-specific UI behavior
- **Linux Products**: Implement Linux-specific UI behavior
- All products in a family are **designed to work together**
