# Adapter Pattern – Weather Service Integration

## Problem Statement
When integrating multiple third-party weather services, each API has different interfaces, data formats, and units of measurement. The challenges include:

1. **Incompatible Interfaces**: Different APIs have different method names and signatures
2. **Data Format Variations**: Some APIs return JSON, others return simple values
3. **Unit Inconsistencies**: Temperature in Fahrenheit, Kelvin, or Celsius
4. **Client Code Complexity**: Client needs to know about each API's specific interface
5. **Maintenance Overhead**: Changes in any API affect client code directly

**Without a proper pattern**: You'd have complex conditional logic in client code, tight coupling to specific APIs, and difficulty adding new weather services.

## Solution: Adapter Pattern
The Adapter Pattern solves this by:
- **Creating a unified interface** that all weather services can implement
- **Converting incompatible interfaces** to match the expected interface
- **Handling data transformation** (unit conversion, format parsing) transparently
- **Enabling seamless integration** of new weather services without client changes
- **Reducing coupling** between client code and third-party APIs

## Overview
This project demonstrates the **Adapter Design Pattern** using a **Weather Service Integration**.  
The Adapter Pattern allows incompatible interfaces to work together by wrapping an existing class with a new interface, enabling collaboration between classes that couldn't otherwise work together.

## Use Case: Weather API Integration
A weather dashboard that needs to integrate with multiple weather services:
- **AccuWeather API** - provides temperature in Fahrenheit
- **OpenWeather API** - provides temperature in Kelvin
- **WeatherStack API** - provides temperature in JSON format with Kelvin
- **Unified Interface** - single method to get temperature in Celsius
- **Seamless Integration** - different APIs work through same interface

## Project Structure
```
src/
├── interfaces/          # Target interfaces
│   └── WeatherService.java
├── apis/               # Third-party APIs (Adaptees)
│   ├── AccuWeatherAPI.java
│   ├── OpenWeatherAPI.java
│   └── WeatherStackAPI.java
├── adapters/           # Adapter implementations
│   ├── AccuWeatherAdapter.java
│   ├── OpenWeatherAdapter.java
│   └── WeatherStackAdapter.java
└── main/               # Client application
    └── WeatherDashboard.java
```

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Target Interface** | Expected interface by client | `WeatherService` |
| **Adaptee** | Existing incompatible class | `AccuWeatherAPI`, `OpenWeatherAPI`, `WeatherStackAPI` |
| **Adapter** | Wraps adaptee to match target | `AccuWeatherAdapter`, `OpenWeatherAdapter`, `WeatherStackAdapter` |
| **Client** | Uses target interface | `WeatherDashboard` |

## How It Works

### 1. **Target Interface** (`WeatherService`)
- Defines the **expected interface** that clients will use
- Provides **standardized methods**: `getTemperatureCelsius()` and `getSource()`
- Ensures **consistency** across different weather APIs

### 2. **Adaptee (Third-party APIs)**
- **AccuWeatherAPI**: Returns temperature in Fahrenheit
- **OpenWeatherAPI**: Returns temperature in Kelvin
- **WeatherStackAPI**: Returns temperature in JSON format with Kelvin
- Each has **different method names** and **data formats**

### 3. **Adapter Classes**
- **AccuWeatherAdapter**: Converts Fahrenheit to Celsius
- **OpenWeatherAdapter**: Converts Kelvin to Celsius  
- **WeatherStackAdapter**: Parses JSON and converts Kelvin to Celsius
- **Handles data conversion** between different formats and units

### 4. **Client Code** (`WeatherDashboard`)
- **Uses only the WeatherService interface** without knowing about adapters
- **Treats all weather sources** the same way
- **Calculates average temperature** from multiple sources seamlessly

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Adapter directory**
   ```bash
   cd Structural/Adapter/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the weather dashboard**
   ```bash
   java WeatherDashboard
   ```

### Expected Output
The program will demonstrate:
- Integration of three different weather APIs (AccuWeather, OpenWeather, WeatherStack)
- Automatic conversion of temperatures from different units to Celsius
- Unified interface usage for all weather services
- Calculation of average temperature from multiple sources
- Display of individual temperatures and sources

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `WeatherDashboard.java`
3. Right-click and select "Run" or press the run button
4. View the weather integration output in the IDE console

### File Structure
- `interfaces/WeatherService.java` - Common interface for all weather services
- `apis/` - Third-party weather API implementations (Adaptees)
- `weather_adapters/` - Adapter classes that convert APIs to common interface
- `WeatherDashboard.java` - Main client application demonstrating the pattern

## Benefits of This Structure
- **Separation of Concerns**: Each package has a specific responsibility
- **Easy to Maintain**: Changes to APIs don't affect adapters or client code
- **Testable**: Each component can be tested independently
- **Extensible**: New weather APIs can be added easily by creating new adapters
- **Clean Dependencies**: Clear import statements show relationships between components
