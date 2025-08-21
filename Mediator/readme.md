# Mediator Pattern – Smart Home Automation Hub

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
