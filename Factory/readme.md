# Factory Pattern – Vehicle Manufacturing System

## Overview
This project demonstrates the **Factory Design Pattern** using a **Vehicle Manufacturing System**.  
The Factory Pattern provides an interface for creating objects without specifying their exact classes, allowing subclasses to decide which class to instantiate.

## Use Case: Vehicle Type Creation
A manufacturing system that creates different types of vehicles:
- **Car Production** - sedans, SUVs, sports cars
- **Motorcycle Production** - cruisers, sport bikes, scooters
- **Truck Production** - pickup trucks, delivery trucks, dump trucks
- **Flexible Creation** - easy to add new vehicle types
- **Centralized Logic** - all creation logic in one place
- **Type Safety** - ensures correct vehicle type creation

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Factory Interface** | Defines creation method | `VehicleFactory` |
| **Concrete Factories** | Implement creation logic | `CarFactory`, `MotorcycleFactory` |
| **Product Interface** | Common interface for products | `Vehicle` |
| **Concrete Products** | Specific vehicle implementations | `Car`, `Motorcycle`, `Truck` |
| **Client** | Uses factory to create products | `ManufacturingClient` |

## How It Works

### 1. **Factory Interface**
- Defines **creation method** that all factories must implement
- Ensures **consistent interface** across different factory types
- Provides **polymorphic creation** of vehicle objects

### 2. **Concrete Factory Classes**
- **CarFactory**: Specializes in creating different types of cars
- **MotorcycleFactory**: Specializes in creating different types of motorcycles
- **TruckFactory**: Specializes in creating different types of trucks
- Each factory **knows how to create** its specific vehicle category

### 3. **Product Hierarchy**
- **Vehicle Interface**: Common contract for all vehicle types
- **Car Classes**: Sedan, SUV, SportsCar implementations
- **Motorcycle Classes**: Cruiser, SportBike, Scooter implementations
- **Truck Classes**: Pickup, Delivery, DumpTruck implementations
- All products **implement the same interface** for consistency

### 4. **Creation Process**
- **Client requests** specific vehicle type from appropriate factory
- **Factory determines** which concrete class to instantiate
- **Factory creates** and returns the requested vehicle
- **Client receives** vehicle without knowing the exact class
