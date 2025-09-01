# Composite Pattern – File System Structure

## Problem Statement
When dealing with hierarchical structures like file systems, organizational charts, or UI components, you face several challenges:

1. **Complex Tree Structures**: Managing nested hierarchies with varying depths
2. **Uniform Treatment**: Need to treat individual items and containers the same way
3. **Recursive Operations**: Operations need to cascade through entire hierarchies
4. **Type Checking**: Client code shouldn't need to distinguish between leaves and composites
5. **Scalability Issues**: Adding new types of components requires extensive code changes

**Without a proper pattern**: You'd have complex conditional logic to handle different node types, making the code difficult to maintain and extend.

## Solution: Composite Pattern
The Composite Pattern solves this by:
- **Treating individual objects and compositions uniformly** through a common interface
- **Enabling recursive operations** that work seamlessly across the hierarchy
- **Simplifying client code** by eliminating type-specific handling
- **Supporting easy extension** with new component types
- **Providing transparent hierarchy traversal** without exposing internal structure

## Overview
This project demonstrates the **Composite Design Pattern** using a **File System Structure**.  
The Composite Pattern composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions uniformly.

## Use Case: Hierarchical File System
A file management system that handles nested structures:
- **Files and Folders** - both are treated as file system items
- **Nested Structures** - folders can contain other folders and files
- **Uniform Interface** - same operations work on files and folders
- **Recursive Operations** - operations cascade through the hierarchy
- **Size Calculations** - total size of folders includes all contents
- **Search Operations** - find files across the entire structure

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Component Interface** | Defines common interface | `FileSystemItem` |
| **Leaf** | Represents individual objects | `File` |
| **Composite** | Represents compositions | `Folder` |
| **Client** | Uses the component interface | `FileManager` |

## How It Works

### 1. **Component Interface**
- Defines **common operations** that all file system items support
- Ensures **uniform treatment** of files and folders
- Provides **polymorphic behavior** across the hierarchy

### 2. **Leaf Classes (Files)**
- **Individual files** that cannot contain other items
- **Implement component operations** directly
- **Terminal nodes** in the tree structure
- **Store file-specific data** like size, name, and content

### 3. **Composite Classes (Folders)**
- **Containers** that can hold other file system items
- **Manage collections** of child components
- **Delegate operations** to child components
- **Aggregate results** from multiple children

### 4. **Recursive Operations**
- **Size calculation** - sums sizes of all contained items
- **Search operations** - traverses entire tree structure
- **Display operations** - shows hierarchical structure
- **Maintenance operations** - operations that affect entire subtrees

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Composite directory**
   ```bash
   cd Structural/Composite/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the company structure demo**
   ```bash
   java CompanyStructure
   ```

### Expected Output
The program will demonstrate:
- Creation of a hierarchical company structure with managers and staff
- Uniform treatment of individual employees and manager groups
- Recursive salary calculations across the entire organization
- Display of organizational hierarchy with proper indentation
- Composite pattern enabling seamless hierarchy management

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `CompanyStructure.java`
3. Right-click and select "Run" or press the run button
4. View the organizational structure output in the IDE console

### File Structure
- `component/Employee.java` - Common interface for all employees (Component)
- `leaf/Staff.java` - Individual employee implementation (Leaf)
- `composite/Manager.java` - Manager with subordinates implementation (Composite)
- `CompanyStructure.java` - Main demonstration of the composite pattern
