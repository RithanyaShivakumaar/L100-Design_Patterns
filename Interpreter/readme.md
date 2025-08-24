# Interpreter Pattern – Expression Evaluation

## Overview
This project demonstrates the **Interpreter Design Pattern** using an **Expression Evaluation System**.  
The Interpreter Pattern defines a representation for a language's grammar along with an interpreter that uses this representation to interpret sentences in the language.

## Use Case: Mathematical Expression Parser
A system that interprets and evaluates mathematical expressions:
- **Arithmetic Operations** - addition, subtraction, multiplication, division
- **Expression Trees** - hierarchical representation of operations
- **Context Evaluation** - variables and values in expressions
- **Grammar Rules** - parsing mathematical notation
- **Recursive Evaluation** - breaking down complex expressions
- **Extensible Language** - easy to add new operations

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Abstract Expression** | Defines interpretation interface | `Expression` |
| **Terminal Expression** | Represents basic values | `NumberExpression` |
| **Non-Terminal Expression** | Represents operations | `AddExpression`, `SubtractExpression` |
| **Context** | Contains global information | `EvaluationContext` |
| **Client** | Builds and evaluates expressions | `Main` class |

## How It Works

### 1. **Abstract Expression Interface**
- Defines **interpret method** that all expressions must implement
- Provides **common contract** for different expression types
- Enables **polymorphic evaluation** of expressions

### 2. **Terminal Expressions**
- **NumberExpression**: Represents literal numeric values
- **VariableExpression**: Represents variables that can be bound to values
- **Direct evaluation** - returns the actual value or bound variable value
- **Leaf nodes** in the expression tree structure

### 3. **Non-Terminal Expressions**
- **AddExpression**: Combines two expressions with addition
- **SubtractExpression**: Combines two expressions with subtraction
- **MultiplyExpression**: Combines two expressions with multiplication
- **DivideExpression**: Combines two expressions with division
- **Composite nodes** that contain other expressions

### 4. **Context Object**
- **Stores variable bindings** and global state
- **Provides lookup mechanism** for variable values
- **Maintains evaluation environment** for expressions
- **Enables dynamic expression evaluation** with different contexts
