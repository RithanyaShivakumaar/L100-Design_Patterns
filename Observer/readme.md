# Observer Pattern – Quiz Notification System

## Overview
This project demonstrates the **Observer Design Pattern** using a **Quiz Notification System**.  
In an educational setting, when a quiz master adds new questions, all registered students need to be notified automatically. Instead of manually notifying each student, the **Observer Pattern** creates a subscription mechanism where students receive updates whenever new questions are added.

The **Observer Pattern** helps:
- **Decouple subjects from observers** - quiz master doesn't need to know about individual students
- **Enable dynamic subscriptions** - students can join/leave notifications at runtime
- **Maintain loose coupling** - changes in one component don't affect others

---

## Use Case: Educational Quiz System
Imagine a classroom scenario where:
- A **Quiz Master** creates and adds new questions
- **Students** want to be notified whenever new questions are posted
- **Dynamic registration** - students can join or leave the notification list
- **Automatic updates** - all registered students get notified simultaneously

The Observer Pattern creates a **publisher-subscriber relationship**:
- **Quiz Master** (Subject) publishes new questions
- **Students** (Observers) subscribe to receive notifications
- **Automatic notification** happens whenever questions are added

---

## Folder Structure
```
├── src/
│ ├── subscribers/
│ │ ├── Subject.java          # Interface for observable objects
│ │ └── Observer.java          # Interface for observers
│ ├── quiz/
│ │ ├── Quiz.java             # Concrete subject (quiz master)
│ │ └── Student.java          # Concrete observer (students)
│ └── Main.java               # Main demonstration
```

## How It Works

### 1. **Subject Interface**
- Defines methods to **register** and **remove** observers
- Defines method to **notify** all registered observers
- **Quiz class** implements this interface

### 2. **Observer Interface**
- Defines the **update method** that subjects call
- **Student class** implements this interface
- Each observer can define its own response to updates

### 3. **Quiz (Concrete Subject)**
- **Maintains a list** of registered students
- **Implements Subject interface** methods
- **Notifies all students** when new questions are added
- **Manages observer lifecycle** (add/remove students)

### 4. **Student (Concrete Observer)**
- **Implements Observer interface**
- **Receives automatic updates** when questions are posted
- **Defines personal response** to notifications
- **Can be dynamically added/removed** from the notification list

---

## Workflow Example

```
1. Quiz Master creates a new quiz
2. Students register as observers:
   - Alice subscribes to notifications
   - Bob subscribes to notifications  
   - Charlie subscribes to notifications

3. Quiz Master adds questions:
   - "What is the capital of France?" → All 3 students notified
   - "Solve: 5 * 6 = ?" → All 3 students notified

4. Bob unsubscribes from notifications

5. Quiz Master adds another question:
   - "Who developed Java?" → Only Alice and Charlie notified
```

---

## Key Benefits

✅ **Loose Coupling**: Subjects and observers are independent  
✅ **Dynamic Relationships**: Observers can join/leave at runtime  
✅ **Automatic Updates**: No manual notification needed  
✅ **Scalability**: Easy to add more observers without changing subjects  
✅ **Maintainability**: Changes in one component don't affect others  

## When to Use Observer

- **One-to-many relationships** between objects
- **Automatic notification** is needed when state changes
- **Dynamic subscription management** is required
- **Decoupling** between event source and event handlers

---

## Real-World Applications

- **Event Handling**: GUI frameworks, user interface updates
- **Model-View Architecture**: Data changes automatically update UI
- **Notification Systems**: Email alerts, push notifications
- **Game Development**: Score updates, achievement notifications
- **Social Media**: News feed updates, friend activity notifications

---

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Subject** | Manages observers and sends notifications | Quiz Master |
| **Observer** | Receives updates from subjects | Students |
| **Concrete Subject** | Implements subject interface | Quiz class |
| **Concrete Observer** | Implements observer interface | Student class |

---

## Implementation Notes

- **Subject maintains observer list** using ArrayList
- **Observer pattern with interfaces** for flexibility
- **Dynamic registration/removal** of observers
- **Automatic notification** on state changes
- **Clean separation** of concerns between quiz logic and student notifications


