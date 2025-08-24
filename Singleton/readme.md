# Singleton Pattern – Configuration Manager

## Overview
This project demonstrates the **Singleton Design Pattern** using a **Configuration Manager**.  
The Singleton Pattern ensures that a class has only one instance and provides a global point of access to that instance throughout the application.

## Use Case: Application Configuration Management
A system that manages global application settings:
- **Single Configuration Source** - one place for all application settings
- **Global Access** - any part of the application can access configuration
- **Lazy Initialization** - configuration loaded only when first needed
- **Thread Safety** - safe access in multi-threaded environments
- **Resource Management** - centralized control over shared resources
- **Consistent State** - ensures all parts use the same configuration

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Singleton Class** | Manages single instance | `ConfigurationManager` |
| **Private Constructor** | Prevents external instantiation | `private ConfigurationManager()` |
| **Static Instance** | Holds the single instance | `private static ConfigurationManager instance` |
| **Public Access Method** | Provides global access | `public static ConfigurationManager getInstance()` |

## How It Works

### 1. **Private Constructor**
- **Prevents external instantiation** of the class
- **Ensures only one instance** can ever be created
- **Controls object creation** completely within the class
- **Enforces singleton behavior** at the language level

### 2. **Static Instance Variable**
- **Holds the single instance** of the class
- **Class-level storage** - shared across all objects
- **Lazy initialization** - created only when first accessed
- **Thread-safe access** - protected from concurrent modification

### 3. **Public Access Method**
- **Provides global access** to the singleton instance
- **Creates instance if needed** (lazy initialization)
- **Returns the same instance** every time it's called
- **Ensures single point of access** to the configuration

### 4. **Configuration Management**
- **Stores application settings** in a centralized location
- **Provides getter/setter methods** for configuration values
- **Maintains configuration state** throughout application lifecycle
- **Enables dynamic configuration** updates when needed
