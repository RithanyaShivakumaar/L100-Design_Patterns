# Facade Pattern – Home Theater System

## Problem Statement
Complex systems with multiple interdependent components create challenges for clients trying to use them. The issues include:

1. **Complex Interface**: Clients need to understand multiple subsystem interfaces
2. **Tight Coupling**: Client code becomes tightly coupled to subsystem classes
3. **Difficult Usage**: Complex initialization and coordination sequences required
4. **Error-Prone Operations**: Easy to make mistakes when coordinating multiple components
5. **Maintenance Burden**: Changes in subsystems affect client code directly

**Without a proper pattern**: Client code would need to manage TV settings, audio system configuration, lighting controls, and DVD player operations individually.

## Solution: Facade Pattern
The Facade Pattern solves this by:
- **Providing a simplified interface** to complex subsystem functionality
- **Hiding subsystem complexity** from client code
- **Reducing coupling** between clients and subsystem components
- **Centralizing subsystem interactions** in a single facade class
- **Enabling easier system usage** through high-level operations

## Overview
This project demonstrates the **Facade Design Pattern** using a **Home Theater System**.  
The Facade Pattern provides a simplified interface to a complex subsystem, making it easier to use and understand while hiding the complexity of the underlying system.

## Use Case: Simplified Home Theater Control
A home entertainment system that simplifies complex operations:
- **Multiple Devices** - TV, DVD player, sound system, lighting
- **Complex Interactions** - device coordination and timing
- **Simplified Interface** - one button for common scenarios
- **Mode Management** - movie mode, music mode, party mode
- **Device Coordination** - ensures proper startup/shutdown sequence
- **Error Handling** - manages device failures gracefully

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Facade** | Provides simplified interface | `HomeTheaterFacade` |
| **Subsystem Classes** | Complex system components | `TV`, `DVDPlayer`, `SoundSystem` |
| **Client** | Uses the facade interface | `HomeTheaterClient` |

## How It Works

### 1. **Facade Class**
- **Provides simplified interface** to complex subsystem
- **Coordinates multiple devices** and their interactions
- **Handles complex logic** behind simple method calls
- **Manages device lifecycle** and state transitions

### 2. **Subsystem Components**
- **TV**: Handles display operations and settings
- **DVDPlayer**: Manages media playback and controls
- **SoundSystem**: Controls audio output and volume
- **Lighting**: Manages ambient lighting conditions
- Each component **has its own complex interface** and operations

### 3. **Simplified Operations**
- **watchMovie()**: Sets up complete movie viewing environment
- **listenToMusic()**: Configures system for music playback
- **endSession()**: Properly shuts down all devices
- **partyMode()**: Activates entertainment configuration
- Each operation **handles multiple device interactions** automatically

### 4. **Device Coordination**
- **Startup Sequence**: Ensures devices start in correct order
- **State Synchronization**: Keeps all devices in consistent states
- **Error Recovery**: Handles device failures and recovery
- **Resource Management**: Manages device resources efficiently

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Facade directory**
   ```bash
   cd Structural/Facade/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the home theater client**
   ```bash
   java ClientApp
   ```

### Expected Output
The program will demonstrate:
- Simplified home theater operations through facade interface
- Complex device coordination hidden from client code
- Multiple subsystems working together seamlessly
- Easy-to-use high-level operations (watchMovie, listenToMusic, etc.)
- Proper device startup and shutdown sequences

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `ClientApp.java`
3. Right-click and select "Run" or press the run button
4. View the home theater system output in the IDE console

### File Structure
- `facade/HomeTheaterFacade.java` - Simplified interface to complex subsystem (Facade)
- `subsystems/TV.java`, `DVDPlayer.java`, `SoundSystem.java`, `Lighting.java` - Complex subsystem components
- `ClientApp.java` - Client using the facade interface
