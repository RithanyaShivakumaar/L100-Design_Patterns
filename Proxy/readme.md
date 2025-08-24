# Proxy Pattern – Access Control System

## Overview
This project demonstrates the **Proxy Design Pattern** using an **Access Control System**.  
The Proxy Pattern provides a surrogate or placeholder for another object to control access to it, add functionality, or manage resource-intensive operations.

## Use Case: Secure Document Access System
A document management system with controlled access:
- **Access Control** - restrict document access based on user permissions
- **Lazy Loading** - load expensive resources only when needed
- **Caching** - store frequently accessed documents in memory
- **Logging** - track all document access attempts
- **Virtual Proxy** - represent large objects without loading them
- **Protection Proxy** - control access to sensitive resources

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Subject Interface** | Defines common interface | `Document` |
| **Real Subject** | Actual object being proxied | `RealDocument` |
| **Proxy** | Controls access to real subject | `DocumentProxy` |
| **Client** | Uses subject interface | `DocumentClient` |

## How It Works

### 1. **Subject Interface**
- Defines **common contract** that both real subject and proxy implement
- Ensures **transparency** - client doesn't know it's using a proxy
- Provides **consistent API** for document operations

### 2. **Real Subject**
- **Actual document object** with full functionality
- **Expensive to create** or contains sensitive information
- **Implements core operations** like read, write, delete
- **May be remote** or require special access permissions

### 3. **Proxy Class**
- **Implements the same interface** as the real subject
- **Controls access** to the real subject based on conditions
- **Adds functionality** like logging, caching, or access control
- **Manages lifecycle** of the real subject (lazy loading, cleanup)

### 4. **Access Control Logic**
- **Permission Checking**: Validates user access rights before operations
- **Authentication**: Ensures user identity before granting access
- **Audit Logging**: Records all access attempts and operations
- **Resource Management**: Controls when real objects are created/destroyed
