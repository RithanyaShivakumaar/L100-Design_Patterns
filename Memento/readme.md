# Memento Pattern – Text Editor with Undo/Redo

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

