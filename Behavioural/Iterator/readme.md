# Iterator Pattern – Music Playlist System

## Problem Statement
When working with collections, direct access to internal structures creates several challenges:

1. **Tight Coupling**: Client code depends on specific collection implementations
2. **Exposed Internals**: Collection's internal structure is visible to clients
3. **Limited Traversal**: Inflexible navigation options (only forward, or only one way)
4. **Collection Dependency**: Changing collection type requires updating all client code
5. **Multiple Traversal Needs**: Different clients may need different traversal strategies

**Without a proper pattern**: Clients would directly access collection internals like `list.get(index)`, making the code tightly coupled and difficult to maintain.

## Solution: Iterator Pattern
The Iterator Pattern solves this by:
- **Providing uniform access** to collection elements regardless of internal structure
- **Hiding collection internals** behind a consistent iterator interface
- **Supporting multiple traversal types** (forward, backward, filtered, etc.)
- **Enabling collection independence** - clients work with iterators, not collections
- **Allowing concurrent iterations** over the same collection

## Overview
This project demonstrates the **Iterator Design Pattern** using a **Music Playlist System**.  
The Iterator Pattern provides a way to access elements of a collection without exposing its underlying representation, supporting both forward and backward traversal.

## Use Case: Bidirectional Music Playlist
A music player that allows users to navigate through songs:
- **Forward Playback** - play songs in sequence
- **Backward Playback** - replay previous songs
- **Collection Management** - add songs without affecting traversal logic
- **Flexible Navigation** - move forward and backward through the playlist

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Collection** | Defines iterator creation | `Playlist` |
| **Concrete Collection** | Implements collection operations | `PlaylistImpl` |
| **Iterator** | Defines basic traversal methods | `Iterator<T>` |
| **Concrete Iterator** | Implements traversal logic | `SongIterator` |
| **Element** | Data being traversed | `Song` |

## How It Works

### 1. **Collection Interface**
- `addSong(Song song)` - adds songs to the collection
- `createIterator()` - creates a new iterator instance
- Returns `BidirectionalIterator<Song>` for flexible traversal

### 2. **Concrete Collection**
- **PlaylistImpl**: Manages list of songs using ArrayList
- Implements `createIterator()` to return `SongIterator`
- Encapsulates data structure details from clients

### 3. **Iterator Interface**
- **Iterator<T>**: Basic forward-only traversal
- **BidirectionalIterator<T>**: Extends with backward traversal
- Generic type support for different element types

### 4. **Concrete Iterator**
- **SongIterator**: Implements bidirectional traversal
- `hasNext()/next()` - forward navigation
- `hasPrevious()/previous()` - backward navigation
- Maintains current position in the collection

### 5. **Element Model**
- **Song**: Contains title and artist information
- Custom `toString()` for readable output
- Immutable design for data integrity

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Iterator directory**
   ```bash
   cd Behavioural/Iterator/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the music playlist demo**
   ```bash
   java Main
   ```

### Expected Output
The program will demonstrate:
- Creation of a music playlist with multiple songs
- Forward iteration through the playlist
- Backward iteration through the playlist
- Iterator pattern hiding collection implementation details
- Bidirectional navigation without exposing internal structure

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `Main.java`
3. Right-click and select "Run" or press the run button
4. View the playlist iteration output in the IDE console

### File Structure
- `collection/Playlist.java` - Collection interface for creating iterators
- `collection/PlaylistImpl.java` - Concrete collection managing songs
- `iterator/Iterator.java` - Basic iterator interface
- `iterator/BidirectionalIterator.java` - Extended iterator with backward traversal
- `iterator/SongIterator.java` - Concrete iterator implementation
- `model/Song.java` - Song data model
- `Main.java` - Main demonstration of iterator pattern usage

