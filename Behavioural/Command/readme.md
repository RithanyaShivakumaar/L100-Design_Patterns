# Command Pattern – Form Wizard System

## Problem Statement
In interactive applications with complex user workflows, managing operations and their reversibility creates several challenges:

1. **Tight Coupling**: Direct method calls between UI and business logic
2. **No Undo Support**: Difficulty in implementing undo/redo functionality
3. **Complex State Management**: Hard to track and reverse application state changes
4. **Inflexible Operations**: Operations cannot be queued, logged, or delayed
5. **Maintenance Issues**: Changes in business logic affect UI components directly

**Without a proper pattern**: You'd have tightly coupled code where UI components directly call business methods, making undo functionality nearly impossible to implement.

## Solution: Command Pattern
The Command Pattern solves this by:
- **Encapsulating requests as objects** with execute and undo methods
- **Decoupling invoker from receiver** through command objects
- **Enabling undo/redo functionality** by storing command history
- **Supporting operation queuing** and batch processing
- **Allowing flexible operation management** including logging and scheduling

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

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Command directory**
   ```bash
   cd Behavioural/Command/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the form wizard demo**
   ```bash
   java Main
   ```

### Expected Output
The program will demonstrate:
- Form wizard progression through multiple steps
- Command execution for adding contact information and survey answers
- Undo functionality reversing form steps
- Command history management and state preservation
- Decoupled form operations through command objects

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `Main.java`
3. Right-click and select "Run" or press the run button
4. View the command pattern workflow output in the IDE console

### File Structure
- `command/ICommand.java` - Command interface defining execute/undo methods
- `command/AddContactInfoCommand.java` - Command for adding contact information
- `command/AddSurveyAnswersCommand.java` - Command for adding survey responses
- `model/FormData.java` - Receiver object containing form data
- `ui/FormWizard.java` - Invoker managing command execution and history
- `Main.java` - Main demonstration of command pattern usage

