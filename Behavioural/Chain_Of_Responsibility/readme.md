# Chain of Responsibility Pattern – Content Review Workflow

## Problem Statement
In content management and review systems, handling requests through multiple processing stages creates several challenges:

1. **Monolithic Processing**: One large handler trying to manage all review stages
2. **Tight Coupling**: Client code directly coupled to specific handler implementations
3. **Inflexible Workflow**: Difficult to add, remove, or reorder processing steps
4. **Code Duplication**: Similar handling logic repeated across different workflows
5. **Scalability Issues**: Hard to extend with new review stages or requirements

**Without a proper pattern**: You'd have complex conditional logic determining which handler processes what, making the system difficult to maintain and extend.

## Solution: Chain of Responsibility Pattern
The Chain of Responsibility Pattern solves this by:
- **Creating a chain of handlers** where each handles specific aspects of the request
- **Enabling flexible processing** by passing requests along the chain
- **Supporting dynamic configuration** of handler sequences
- **Promoting loose coupling** between senders and receivers
- **Allowing easy extension** with new handlers without modifying existing code

## Overview
This project demonstrates the **Chain of Responsibility (CoR) Design Pattern** using a **Content Review Workflow**.  
In real-world scenarios like **PR (Pull Request) review** or **content creation**, a document passes through multiple stages before it is approved and published.  

Instead of one massive review handler that does everything, the **Chain of Responsibility** allows us to:  
- Process a request step by step  
- Pass it along a chain of handlers until it is fully complete  
- Add or remove steps without changing the entire system  

---

## Use Case: Content Review
A document (or article/PR) goes through **three main stages**:  
1. **Reviewer** – checks for correctness and initial approval  
2. **Editor** – improves formatting, grammar, or code quality  
3. **Publisher** – publishes the document only if it is reviewed & edited  

If any stage is skipped, the chain ensures the next steps won’t execute incorrectly.  

---

## Folder Structure
```
ChainOfResponsibility/
├── handler/
│ ├── ReviewHandler.java 
│ ├── Reviewer.java 
│ ├── Editor.java
│ └── Publisher.java
├── model/
│ └── Document.java
└── Main.java
```

## How It Works
1. **ReviewHandler** defines the base structure for all handlers in the chain.  
2. **Reviewer**, **Editor**, and **Publisher** implement specific review steps.  
3. **Document** acts as the request, carrying status flags (`reviewed`, `edited`, `published`).  
4. The chain is linked as: Reviewer → Editor → Publisher
5. Each handler decides whether to process the document or pass it along.

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Chain of Responsibility directory**
   ```bash
   cd Behavioural/Chain_Of_Responsibility/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the content review workflow demo**
   ```bash
   java main
   ```

### Expected Output
The program will demonstrate:
- Document passing through the review chain (Reviewer → Editor → Publisher)
- Each handler processing the document if it meets the criteria
- Chain progression showing document status at each stage
- Complete workflow from initial review to final publication
- Handler chain coordination and document state management

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `main.java`
3. Right-click and select "Run" or press the run button
4. View the chain of responsibility workflow output in the IDE console

### File Structure
- `handler/ReviewHandler.java` - Abstract base handler defining the chain interface
- `handler/Reviewer.java` - First handler in chain for content review
- `handler/Editor.java` - Second handler for content editing
- `handler/Publisher.java` - Final handler for content publication
- `model/Document.java` - Request object containing document state
- `main.java` - Main demonstration of chain of responsibility pattern  