# Memento Pattern – Text Editor with Undo/Redo

## Problem Statement
When implementing undo/redo functionality or state management systems, several challenges arise:

1. **Encapsulation Violation**: Direct access to object internals breaks encapsulation
2. **State Management Complexity**: Tracking and storing object states manually
3. **Memory Issues**: Inefficient storage of state snapshots
4. **Coupling Problems**: Tight coupling between state storage and business objects
5. **Limited Undo Levels**: Difficulty implementing multi-level undo/redo

**Without a proper pattern**: You'd either break encapsulation by exposing internal state or create complex, tightly coupled state management systems.

## Solution: Memento Pattern
The Memento Pattern solves this by:
- **Preserving encapsulation** while enabling state capture and restoration
- **Externalizing state storage** without exposing internal object structure
- **Enabling multiple snapshots** for comprehensive undo/redo functionality
- **Separating concerns** between state management and business logic
- **Supporting flexible state restoration** at any point in history

## Overview
This project demonstrates the **Memento Design Pattern** using a **Text Editor with Undo/Redo functionality**.  
The Memento Pattern allows you to capture and externalize an object's internal state so that the object can be restored to this state later, without violating encapsulation.

## Use Case: Text Editor with State History
A text editor that maintains a complete history of changes:
- **State Preservation** - save content at any point
- **Undo Functionality** - revert to previous states
- **Redo Functionality** - restore undone changes
- **History Management** - maintain undo/redo stacks
- **Encapsulation** - state restoration without exposing internal structure

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Originator** | Creates and restores mementos | `Editor` |
| **Memento** | Stores originator's state | `Memento` |
| **Caretaker** | Manages memento history | `History` |
| **Client** | Uses the originator and caretaker | `Main` class |

## How It Works

### 1. **Originator (Editor)**
- **Current State**: Maintains the current content
- **State Operations**: `type()`, `getContent()`
- **Memento Creation**: `save()` - creates memento with current state
- **State Restoration**: `restore()` - restores state from memento
- **Encapsulation**: Internal state is private, accessed only through mementos

### 2. **Memento**
- **Immutable State**: Stores a snapshot of the originator's state
- **State Access**: `getSavedState()` - provides access to saved content
- **Encapsulation**: Hides the internal structure of the saved state
- **Type Safety**: Strongly typed state storage

### 3. **Caretaker (History)**
- **Undo Stack**: Maintains history of saved states
- **Redo Stack**: Stores undone states for potential redo
- **State Management**: `save()`, `undo()`, `redo()` operations
- **Stack Operations**: Uses Stack data structure for LIFO behavior

### 4. **Client (Main)**
- **Workflow Demonstration**: Shows the complete undo/redo cycle
- **State Progression**: Builds content incrementally
- **History Navigation**: Demonstrates undo and redo operations

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Memento directory**
   ```bash
   cd Behavioural/Memento/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the text editor demo**
   ```bash
   java Main
   ```

### Expected Output
The program will demonstrate:
- Text editor with incremental content building
- State saving at various points during editing
- Undo functionality restoring previous states
- Redo functionality restoring undone changes
- Memento pattern preserving encapsulation while enabling state management

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `Main.java`
3. Right-click and select "Run" or press the run button
4. View the text editor state management output in the IDE console

### File Structure
- `originator/Editor.java` - Originator that creates and restores from mementos
- `memento/Memento.java` - Memento storing editor state snapshots
- `memento/History.java` - Caretaker managing memento history and undo/redo stacks
- `Main.java` - Main demonstration of memento pattern usage

