# Command Pattern – Form Wizard System

## Overview
This project demonstrates the **Command Design Pattern** using a **Form Wizard System**.  
The Command Pattern encapsulates a request as an object, allowing you to parameterize clients with different requests, queue operations, and support undoable operations.

## Use Case: Multi-Step Form Wizard
A form wizard that guides users through multiple steps:
- **Contact Information** - name and email
- **Survey Answers** - user feedback
- **Navigation** - Next/Back with undo capability
- **State Management** - track form progress and history

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Command** | Defines execute/undo interface | `ICommand` |
| **Concrete Command** | Implements specific actions | `AddContactInfoCommand`, `AddSurveyAnswersCommand` |
| **Receiver** | Knows how to perform operations | `FormData` |
| **Invoker** | Executes commands and manages history | `FormWizard` |
| **Client** | Creates and configures commands | `Main` class |

## How It Works

### 1. **Command Interface**
- `execute()` - performs the action
- `undo()` - reverses the action
- Each command stores previous state for perfect undo

### 2. **Concrete Commands**
- **AddContactInfoCommand**: Manages name and email
- **AddSurveyAnswersCommand**: Manages survey responses
- Both implement state preservation for undo operations

### 3. **FormWizard (Invoker)**
- Manages command execution order
- Maintains command history stack
- Provides Next/Back navigation with undo support

### 4. **FormData (Receiver)**
- Holds the actual form data
- Provides getter/setter methods
- Commands operate on this object

