# Mediator Pattern – Smart Home Automation Hub

## Problem Statement
In systems with multiple interacting objects, direct communication creates several challenges:

1. **Tight Coupling**: Objects directly reference and depend on each other
2. **Complex Dependencies**: Many-to-many relationships between objects
3. **Difficult Maintenance**: Changes in one object affect multiple others
4. **Reusability Issues**: Objects cannot be reused without their dependencies
5. **Communication Chaos**: No centralized control over object interactions

**Without a proper pattern**: Each smart home device would need to know about and communicate directly with every other device, creating a web of dependencies.

## Solution: Mediator Pattern
The Mediator Pattern solves this by:
- **Centralizing communication** through a mediator object
- **Reducing coupling** by eliminating direct object-to-object communication
- **Simplifying relationships** from many-to-many to one-to-many
- **Enabling flexible interactions** through configurable mediation logic
- **Improving maintainability** by localizing interaction logic

## Overview
This project demonstrates the **Mediator Design Pattern** using a **Smart Home Automation Hub**.  
In a smart home, devices like **lights, fans, thermostats, and door locks** need to communicate with each other. Instead of each device interacting directly (which would make the system tightly coupled), a **SmartHub mediator** coordinates their communication.  

The **Mediator Pattern** helps:
- Centralize communication between devices  
- Reduce dependencies among devices  
- Make the system more maintainable and scalable  

---

## Use Case: Smart Home Automation
Imagine you have multiple devices at home:
- A **Light** that turns on/off  
- A **Fan** for air circulation  
- A **Thermostat** to control heating/cooling  
- A **Door Lock** for security  

Instead of devices talking directly to each other, they send events to the **SmartHub mediator**:
- If **motion is detected** → the hub turns on the light & unlocks the door  
- If **no motion** → the hub turns off the light & locks the door  
- If **temperature is hot** → the hub turns on the fan & cools the thermostat  
- If **temperature is cold** → the hub turns off the fan & heats the thermostat  

---

## Folder Structure
```
├── Mediator/
│ ├── HomeMediator.java 
│ └── SmartHub.java 
├── devices/
│ ├── Device.java 
│ ├── Light.java 
│ ├── Fan.java 
│ ├── Thermostat.java 
│ └── DoorLock.java 
└── Main.java 
```
## How It Works
1. **HomeMediator** defines the mediator interface.  
2. **SmartHub** implements the mediator logic to handle events.  
3. **Device** is the abstract class for all smart devices.  
4. **Concrete devices** (`Light`, `Fan`, `Thermostat`, `DoorLock`) interact only via the mediator.  
5. **Main.java** simulates different smart home scenarios.

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Mediator directory**
   ```bash
   cd Behavioural/Mediator/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the smart home automation demo**
   ```bash
   java Main
   ```

### Expected Output
The program will demonstrate:
- Smart home devices communicating through the mediator hub
- Centralized coordination of device interactions
- Motion detection triggering multiple device responses
- Temperature changes affecting fan and thermostat coordination
- Mediator pattern reducing device coupling and dependencies

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `Main.java`
3. Right-click and select "Run" or press the run button
4. View the smart home automation output in the IDE console

### File Structure
- `mediator/HomeMediator.java` - Mediator interface defining communication contract
- `mediator/SmartHub.java` - Concrete mediator coordinating device interactions
- `devices/Device.java` - Abstract base class for all smart devices
- `devices/Light.java`, `Fan.java`, `Thermostat.java`, `DoorLock.java` - Concrete devices
- `Main.java` - Main demonstration of mediator pattern usage  
