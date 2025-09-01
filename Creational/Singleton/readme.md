# Singleton Pattern – Weather Data Caching System

## Problem Statement
In multi-threaded applications, managing shared resources like caches can lead to several issues:

1. **Multiple Instance Creation**: Different parts of the application creating separate cache instances
2. **Memory Waste**: Multiple cache instances consuming unnecessary memory
3. **Data Inconsistency**: Different caches holding different versions of the same data
4. **Synchronization Issues**: Thread-safe access to shared cache data
5. **Resource Contention**: Multiple instances competing for the same external resources (APIs)

**Without a proper pattern**: You'd have memory inefficiency, data inconsistency, and potential race conditions in multi-threaded environments.

## Solution: Singleton Pattern
The Singleton Pattern solves this by:
- **Ensuring single instance** throughout the application lifecycle
- **Providing global access point** to the shared resource
- **Thread-safe implementation** using double-checked locking
- **Memory efficiency** by preventing multiple instances
- **Consistent data access** across all application components

## Overview
This project demonstrates the **Singleton Design Pattern** using a **Weather Data Caching System**.  
The Singleton Pattern ensures that a class has only one instance and provides a global point of access to that instance throughout the application.

## Use Case: Weather Data Caching System
A multi-threaded weather application that demonstrates efficient data caching:
- **Centralized Cache Management** - single cache instance shared across all threads
- **API Call Optimization** - prevents redundant API calls for the same city
- **Thread-Safe Operations** - safe concurrent access to shared cache
- **Memory Efficiency** - single cache instance reduces memory footprint
- **Performance Improvement** - cached data eliminates expensive API calls
- **Consistent Data Access** - all threads access the same cached weather data

## Folder Structure
```
Creational/Singleton/
├── README.md                    
├── main/                        
│   └── Main.java               
├── service/                     
│   └── WeatherService.java     
├── cache/                       
│   └── WeatherCache.java       
└── threadtest/                  
    └── WeatherRequestThread.java 
```

## Data Flow

### 1. **Application Initialization**
```
Main.java → Creates multiple WeatherRequestThread instances
           → Each thread represents a city weather request
           → Threads start concurrently to simulate real-world usage
```

### 2. **Weather Data Request Flow**
```
WeatherRequestThread → WeatherCache.getInstance() → Singleton Cache Instance
                     ↓
                     Check if city exists in cache
                     ↓
                     If CACHED: Return cached weather data
                     If NOT CACHED: WeatherService.fetchWeatherFromAPI()
                     ↓
                     Store new data in cache
                     ↓
                     Return weather data to thread
```

### 3. **Singleton Cache Operations**
```
Thread Request → getInstance() → Double-Checked Locking → Cache Instance
               ↓
               Synchronized access to cache methods
               ↓
               contains() → Check if city exists
               get() → Retrieve cached weather data
               put() → Store new weather data
```

### 4. **Thread Safety Implementation**
```
Multiple Threads → Concurrent access to WeatherCache
                  ↓
                  Double-checked locking pattern
                  ↓
                  Synchronized cache operations
                  ↓
                  Safe concurrent read/write operations
```

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Singleton Class** | Manages single cache instance | `WeatherCache` |
| **Private Constructor** | Prevents external instantiation | `private WeatherCache()` |
| **Static Instance** | Holds the single instance | `private static volatile WeatherCache instance` |
| **Thread-Safe Access** | Provides synchronized access | `public static WeatherCache getInstance()` |
| **Cache Operations** | Manages weather data storage | `contains()`, `get()`, `put()` methods |

## Execution Flow Example
```
Thread-0 requests Chennai → Cache miss → API call → Store in cache
Thread-1 requests Mumbai → Cache miss → API call → Store in cache  
Thread-2 requests Chennai → Cache hit → Return cached data
Thread-3 requests Delhi → Cache miss → API call → Store in cache
Thread-4 requests Mumbai → Cache hit → Return cached data

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Singleton directory**
   ```bash
   cd Creational/Singleton
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the main application**
   ```bash
   java Main
   ```

### Expected Output
The program will demonstrate:
- Multiple threads requesting weather data concurrently
- Singleton cache instance being shared across all threads
- Cache hits and misses for different cities
- Thread-safe access to the shared cache
- Performance benefits of caching (avoiding redundant API calls)
- Demonstration of single instance creation across multiple threads

### File Structure
- `Main.java` - Main class that creates and starts multiple threads
- `cache/WeatherCache.java` - Singleton cache implementation
- `service/WeatherService.java` - Service for fetching weather data
- `threadtest/WeatherRequestThread.java` - Thread class for concurrent requests

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `Main.java`
3. Right-click and select "Run" or press the run button
4. View the multi-threaded execution output in the IDE console

### Key Observations
- Only one cache instance is created despite multiple threads
- Cache efficiently prevents redundant API calls for the same city
- Thread-safe operations ensure data consistency
- Performance improvement through shared cache usage