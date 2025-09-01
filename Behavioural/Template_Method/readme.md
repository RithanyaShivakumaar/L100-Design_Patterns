# Template Method Pattern - Report Generation System

## Problem Statement
When implementing similar algorithms with varying steps, traditional approaches create several challenges:

1. **Code Duplication**: Similar workflow logic repeated across different implementations
2. **Inconsistent Algorithms**: No guarantee that all implementations follow the same structure
3. **Difficult Maintenance**: Changes to the common workflow require updates in multiple places
4. **Inflexible Structure**: Hard to enforce a consistent algorithm skeleton
5. **Scattered Logic**: Common steps implemented differently across various classes

**Without a proper pattern**: Each report type would implement its own complete generation logic, leading to code duplication and inconsistent workflows.

## Solution: Template Method Pattern
The Template Method Pattern solves this by:
- **Defining algorithm skeleton** in a base class with fixed workflow structure
- **Allowing step customization** through abstract methods implemented by subclasses
- **Providing common implementations** for shared steps to reduce duplication
- **Enforcing consistent workflow** across all implementations
- **Supporting flexible extension** through hook methods for optional customization

## Overview
This project demonstrates the **Template Method Design Pattern** using a **Report Generation System** as an example.  
The system generates **daily, weekly, and monthly reports** while keeping the workflow consistent and reusable.  

- **Template Method:** `generateReport()` → defines the overall workflow  
- **Abstract Steps:** `fetchData()`, `parseData()` → must be implemented by each report type  
- **Optional Steps:** `analyzeData()`, `composeReport()`, `sendReport()` → shared by default in the base class  
- **Hooks:** `beforeReport()`, `afterReport()` → optional extension points for customization  

This design reduces code duplication, enforces a consistent workflow, and allows customization of individual steps in subclasses.

---

## Folder Structure
```
Template_Method/
└── reports/
    ├── AbstractReport.java
    ├── DailyReport.java
    ├── WeeklyReport.java
    └── MonthlyReport.java
└── Main.java
```

---

## How It Works
1. **AbstractReport** defines the **template method** `generateReport()` with a fixed workflow.  
2. **Subclasses** (`DailyReport`, `WeeklyReport`, `MonthlyReport`) implement abstract steps and optionally override hooks.  
3. Optional steps are implemented in the base class so that all report types can share common functionality.  
4. Hooks provide extension points **before** and **after** the main workflow, without enforcing implementation.

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Template Method directory**
   ```bash
   cd Behavioural/Template_Method/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the report generation demo**
   ```bash
   java Main
   ```

### Expected Output
The program will demonstrate:
- Different report types (Daily, Weekly, Monthly) following the same generation workflow
- Template method defining consistent algorithm structure
- Subclasses customizing specific steps while maintaining overall workflow
- Hook methods providing optional extension points
- Template method pattern reducing code duplication and enforcing consistency

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `Main.java`
3. Right-click and select "Run" or press the run button
4. View the report generation workflow output in the IDE console

### File Structure
- `reports/AbstractReport.java` - Abstract base class defining template method and common steps
- `reports/DailyReport.java`, `WeeklyReport.java`, `MonthlyReport.java` - Concrete report implementations
- `Main.java` - Main demonstration of template method pattern usage

