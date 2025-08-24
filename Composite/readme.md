# Composite Pattern – File System Structure

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
