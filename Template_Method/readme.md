# Template Method Pattern - Report Generation System

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

