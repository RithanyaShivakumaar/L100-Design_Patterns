# Iterator Pattern – Music Playlist System

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

