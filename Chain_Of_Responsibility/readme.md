# Chain of Responsibility Pattern – Content Review Workflow

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