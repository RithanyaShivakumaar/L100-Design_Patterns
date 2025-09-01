# Interpreter Pattern – Expression Evaluation

## Problem Statement
When building systems that need to evaluate expressions or implement domain-specific languages, traditional approaches create several challenges:

1. **Complex Parsing Logic**: Hardcoded parsing for different expression types
2. **Inflexible Grammar**: Difficult to add new operations or modify existing ones
3. **Monolithic Evaluation**: One large method handling all expression types
4. **Poor Extensibility**: Adding new operators requires modifying existing code
5. **Maintenance Issues**: Grammar changes affect the entire parsing system

**Without a proper pattern**: You'd have complex switch statements or if-else chains to handle different expression types, making the system hard to extend and maintain.

## Solution: Interpreter Pattern
The Interpreter Pattern solves this by:
- **Representing grammar rules as classes** with each rule having its own interpretation logic
- **Creating composable expression trees** that can be evaluated recursively
- **Enabling easy extension** with new operators without modifying existing code
- **Separating parsing from evaluation** through clear abstraction layers
- **Supporting complex expressions** through hierarchical composition

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

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Interpreter directory**
   ```bash
   cd Behavioural/Interpreter/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the expression evaluation demo**
   ```bash
   java Main
   ```

### Expected Output
The program will demonstrate:
- Creation of mathematical expression trees
- Evaluation of complex arithmetic expressions
- Context-based variable binding and evaluation
- Hierarchical expression composition and recursive evaluation
- Interpreter pattern enabling extensible expression language

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `Main.java`
3. Right-click and select "Run" or press the run button
4. View the expression evaluation output in the IDE console

### File Structure
- `expressions/MarkdownExpression.java` - Abstract expression interface
- `expressions/PlainTextExpression.java` - Terminal expression for text values
- `expressions/BoldExpression.java` - Non-terminal expression for bold formatting
- `expressions/ItalicExpression.java` - Non-terminal expression for italic formatting
- `parser/MarkdownParser.java` - Parser for building expression trees
- `Main.java` - Main demonstration of interpreter pattern usage
