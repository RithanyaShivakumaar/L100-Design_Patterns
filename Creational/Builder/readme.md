# Builder Pattern – User Profile Construction

## Problem Statement
Creating complex objects like user profiles involves multiple optional parameters and validation rules. The challenges include:

1. **Constructor Overload**: Too many constructor parameters become unmanageable
2. **Optional Parameters**: Many fields are optional, leading to multiple constructor variations
3. **Validation Complexity**: Ensuring required fields are provided while keeping optional fields flexible
4. **Immutability**: Creating immutable objects while providing a flexible construction process
5. **Readability**: Complex object creation code becomes hard to read and maintain

**Without a proper pattern**: You'd have telescoping constructors or mutable objects that can be modified after creation, leading to inconsistent states.

## Solution: Builder Pattern
The Builder Pattern solves this by:
- **Step-by-step construction** with a fluent interface
- **Flexible parameter setting** without constructor overload
- **Validation at build time** ensuring object consistency
- **Immutable final objects** that cannot be modified after creation
- **Readable code** with method chaining

## Overview
This project demonstrates the **Builder Design Pattern** using a **User Profile Construction System**.  
The Builder Pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations of user profiles.

## Use Case: User Profile Creation System
A user management system that builds complex user profiles step-by-step:
- **Basic Information** - username and email (required fields)
- **Contact Details** - phone number, profile picture
- **Personal Information** - bio, preferences, linked accounts
- **Account Settings** - verification status, role assignment
- **Step-by-Step Building** - fluent interface for easy profile construction
- **Validation** - ensures required fields are provided
- **Immutable Objects** - profiles cannot be modified after creation

## Folder Structure
```
Creational/Builder/
├── README.md                           
├── src/                                
│   ├── models/                         
│   │   └── UserProfile.js              
│   ├── builders/                       
│   │   └── UserProfileBuilder.js       
│   └── demo/                           
│       └── main.js                     
```

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Builder Class** | Constructs user profiles step-by-step | `UserProfileBuilder` |
| **Product Class** | Complex object being built | `UserProfile` |
| **Client** | Uses builder to create profiles | `main.js` demo |
| **Build Method** | Finalizes and returns the object | `build()` method |

## How It Works

### 1. **UserProfileBuilder (Builder Class)**
- **Constructor Validation**: Ensures username and email are provided
- **Fluent Interface**: Method chaining for easy profile construction
- **Optional Field Methods**: Each method adds one aspect of the profile
- **Build Method**: Creates and returns the final UserProfile object
- **Error Handling**: Throws errors for invalid configurations

### 2. **UserProfile (Product Class)**
- **Complex Object**: Contains multiple fields and configurations
- **Constructor Pattern**: Accepts configuration object with defaults
- **Immutable Design**: Object.freeze() prevents post-creation modification
- **Default Values**: Sensible defaults for optional fields
- **Validation**: Ensures required fields are present

### 3. **Builder Method Chain**
- **withPhone()**: Adds phone number to profile
- **withBio()**: Adds biographical information
- **withProfilePicture()**: Sets profile picture path
- **withPreferences()**: Configures user preferences
- **withLinkedAccounts()**: Links external accounts
- **isVerified()**: Sets verification status
- **withRole()**: Assigns user role
- **build()**: Finalizes and returns the profile

### 4. **Client Usage Pattern**
- **Profile Creation**: Uses builder to construct different profile types
- **Method Chaining**: Fluent interface for readable code
- **Error Handling**: Try-catch blocks for validation errors
- **Multiple Profiles**: Creates different profiles with varying configurations

---

## 🚀 How to Run

### Prerequisites
- Node.js (v16 or higher)
- npm or yarn package manager
- TypeScript knowledge (optional but helpful)

### Installation & Execution Steps

1. **Navigate to the Builder directory**
   ```bash
   cd Creational/Builder
   ```

2. **Install dependencies**
   ```bash
   npm install
   ```

3. **Run in development mode (recommended)**
   ```bash
   npm run dev
   ```
   *This runs the TypeScript files directly without compilation*

4. **Or build and run in production mode**
   ```bash
   npm run build
   npm start
   ```

### Expected Output
The program will demonstrate:
- Creation of different user profiles using the builder pattern
- Step-by-step profile construction with method chaining
- Validation of required fields (username and email)
- Error handling for invalid profile configurations
- Immutable profile objects that cannot be modified after creation

### Available Scripts
- `npm run dev` - Run TypeScript files directly with ts-node
- `npm run build` - Compile TypeScript to JavaScript
- `npm start` - Run compiled JavaScript
- `npm run clean` - Remove compiled files

