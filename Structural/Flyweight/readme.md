# Flyweight Pattern – E-commerce Shopping Cart Optimization

## Problem Statement
In large-scale applications like e-commerce platforms, creating individual objects for similar data leads to significant memory waste. The challenges include:

1. **Memory Explosion**: Thousands of users creating duplicate product objects
2. **Resource Waste**: Storing the same product information multiple times
3. **Performance Degradation**: Excessive object creation and garbage collection
4. **Scalability Issues**: Memory usage grows linearly with user count
5. **System Inefficiency**: Similar data stored redundantly across the system

**Without a proper pattern**: If 10,000 users add the same iPhone to their carts, you'd have 10,000 identical product objects consuming unnecessary memory.

## Solution: Flyweight Pattern
The Flyweight Pattern solves this by:
- **Sharing common data** (intrinsic state) across multiple objects
- **Separating user-specific data** (extrinsic state) from shared data
- **Reducing memory footprint** through object reuse
- **Improving performance** by minimizing object creation
- **Enabling efficient scaling** regardless of user count

## Overview
This project demonstrates the **Flyweight Design Pattern** using an **E-commerce Shopping Cart System**.  
In an e-commerce platform, thousands of users might add the same products to their carts. Instead of creating duplicate product objects for each user (which would waste memory), the **Flyweight Pattern** shares common product data while keeping user-specific information separate.

The **Flyweight Pattern** helps:
- **Reduce memory usage** by sharing common data across multiple objects
- **Improve performance** by avoiding duplicate object creation
- **Optimize resource usage** in memory-intensive applications

---

## Use Case: E-commerce Product Management
In an e-commerce platform, 
- **Product information** (name, description, base price) is the same for all users
- **User-specific data** (variant, quantity, user ID) varies for each cart item
- **Thousands of users** might add the same iPhone or headphones to their carts

Instead of creating separate product objects for each user, we:
- **Share product data** (flyweight) across all users
- **Store user-specific data** (extrinsic state) separately in cart items
- **Reuse existing products** from a factory pool

---

## Folder Structure
```
├── src/
│ ├── Factory/
│ │ ├── Product.java           # Flyweight object (shared data)
│ │ └── ProductFactory.java    # Factory with product pool
│ ├── Extrinstic/
│ │ └── CartItem.java          # Extrinsic state (user-specific)
│ ├── client/
│ │ └── ShoppingCart.java      # Client using flyweights
│ └── DemoApp.java             # Main demonstration
```

## How It Works

### 1. **Product (Flyweight)**
- Contains **intrinsic state**: product ID, name, description, base price
- **Shared across all users** - same product object used multiple times
- **Immutable** - cannot be changed once created

### 2. **ProductFactory**
- **Maintains a pool** of existing products
- **Creates new products** only when they don't exist
- **Returns existing products** when requested again
- **Tracks total products** created in memory

### 3. **CartItem (Extrinsic State)**
- Contains **user-specific data**: user ID, variant, quantity
- **References the shared product** flyweight
- **Calculates total price** using shared base price × quantity

### 4. **ShoppingCart**
- **Manages user's cart items**
- **Uses ProductFactory** to get/create products
- **Creates CartItems** with user-specific data

---

## Memory Optimization Example

**Without Flyweight Pattern:**
```
User1 Cart: iPhone 15 Pro (new object) + Sony Headphones (new object)
User2 Cart: iPhone 15 Pro (new object) + Sony Headphones (new object)
Total: 4 product objects in memory
```

**With Flyweight Pattern:**
```
User1 Cart: iPhone 15 Pro (shared) + Sony Headphones (shared)
User2 Cart: iPhone 15 Pro (shared) + Sony Headphones (shared)
Total: 2 product objects in memory (50% reduction!)
```

---

## Key Benefits

✅ **Memory Efficiency**: Shared product data reduces memory usage  
✅ **Performance**: Faster object creation and retrieval  
✅ **Scalability**: Handles thousands of users efficiently  
✅ **Maintainability**: Centralized product management  

## When to Use Flyweight

- **Large number of similar objects** need to be created
- **Memory usage is a concern**
- **Object state can be divided** into intrinsic (shared) and extrinsic (unique) parts
- **Application needs to be memory-efficient**

---

## Real-World Applications

- **Gaming**: Character models, textures, sound effects
- **Graphics**: Font rendering, icon systems
- **E-commerce**: Product catalogs, inventory systems
- **Document Processing**: Character formatting, style objects

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Flyweight directory**
   ```bash
   cd Structural/Flyweight/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the e-commerce demo**
   ```bash
   java DemoApp
   ```

### Expected Output
The program will demonstrate:
- Creation of shared product flyweights through factory
- Multiple users adding the same products to their carts
- Memory optimization through object reuse
- Separation of intrinsic (shared) and extrinsic (user-specific) state
- Flyweight pattern reducing memory usage significantly

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `DemoApp.java`
3. Right-click and select "Run" or press the run button
4. View the shopping cart optimization output in the IDE console

### File Structure
- `Factory/Product.java` - Flyweight object containing shared product data (Flyweight)
- `Factory/ProductFactory.java` - Factory managing flyweight pool (FlyweightFactory)
- `Extrinstic/CartItem.java` - Extrinsic state containing user-specific data (Context)
- `client/ShoppingCart.java` - Client using flyweights
- `DemoApp.java` - Main demonstration of flyweight pattern


