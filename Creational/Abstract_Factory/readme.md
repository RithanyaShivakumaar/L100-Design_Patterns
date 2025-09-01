# Abstract Factory Pattern – Brand Product System

## Problem Statement
In e-commerce or retail applications, you often need to create families of related products that belong to the same brand (Nike shoes, Nike pricing, Nike delivery info, etc.). The challenge is:

1. **Brand Consistency**: All components must be from the same brand family
2. **Scalability**: Easy addition of new brands without modifying existing code
3. **Coupling Issues**: Client code shouldn't depend on specific brand implementations
4. **Product Family Management**: Ensuring all related objects work together

**Without a proper pattern**: You'd have complex conditional logic scattered throughout the code, making it hard to maintain and extend.

## Solution: Abstract Factory Pattern
The Abstract Factory Pattern solves this by:
- **Creating families of related objects** without specifying their concrete classes
- **Ensuring product compatibility** within the same brand family
- **Providing a unified interface** for creating brand-specific products
- **Enabling easy extension** with new brands without changing existing code

## Overview
This project demonstrates the **Abstract Factory Design Pattern** using a **Brand Product System**.  
The Abstract Factory Pattern provides an interface for creating families of related objects without specifying their concrete classes, ensuring that the created objects are compatible with each other within the same brand family.

## Use Case: Multi-Brand Product Management
A product management system that creates consistent product families for different brands:
- **Nike Products** - shoes, pricing, specs, delivery, and ratings with Nike branding
- **Adidas Products** - shoes, pricing, specs, delivery, and ratings with Adidas branding
- **Product Family Consistency** - ensures all components (product, pricing, specs, delivery, rating) work together
- **Brand Abstraction** - client code doesn't know about specific brand implementations
- **Unified Interface** - same methods work across different brands

## Folder Structure
```
Creational/Abstract_Factory/
├── README.md                           
├── src/                                
│   ├── index.js                        
│   ├── interfaces/                     
│   │   ├── BrandFactory.js             
│   │   ├── Product.js                  
│   │   ├── Pricing.js                  
│   │   ├── Specs.js                    
│   │   ├── DeliveryInfo.js             
│   │   └── Rating.js                   
│   ├── brands/                        
│   │   ├── nike/                       
│   │   │   ├── NikeFactory.js          
│   │   │   ├── NikeProduct.js          
│   │   │   ├── NikePricing.js          
│   │   │   ├── NikeSpecs.js            
│   │   │   ├── NikeDeliveryInfo.js     
│   │   │   └── NikeRating.js           
│   │   └── adidas/                     
│   │       ├── AdidasFactory.js        
│   │       ├── AdidasProduct.js        
│   │       ├── AdidasPricing.js        
│   │       ├── AdidasSpecs.js          
│   │       ├── AdidasDeliveryInfo.js   
│   │       └── AdidasRating.js         
│   └── client/                          
│       └── renderBrand.js              
```

## Data Flow

### **Factory Creation Process**
```
Client → BrandFactory (Abstract) → Concrete Factory (Nike/Adidas)
        ↓
        Factory creates product family
        ↓
        All components are brand-consistent
```

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Abstract Factory** | Defines interface for creating product families | `BrandFactory` |
| **Concrete Factory** | Implements creation of specific brand family | `NikeFactory`, `AdidasFactory` |
| **Abstract Products** | Define interfaces for product components | `Product`, `Pricing`, `Specs`, etc. |
| **Concrete Products** | Implement brand-specific components | `NikeProduct`, `AdidasProduct`, etc. |
| **Client** | Uses factory to create product families | `renderBrand.js` |

## How It Works

### 1. **BrandFactory (Abstract Factory)**
- **Defines Creation Methods**: createProduct(), createPricing(), createSpecs(), etc.
- **Ensures Compatibility**: All products from the same factory work together
- **Brand Independence**: Client code doesn't know specific brand implementations
- **Unified Interface**: Same methods work across different brands

### 2. **Concrete Factory Implementations**
- **NikeFactory**: Creates Nike-branded product family
- **AdidasFactory**: Creates Adidas-branded product family
- **Brand Consistency**: Each factory ensures all components match the brand
- **Product Compatibility**: All components from one factory are designed to work together

### 3. **Abstract Product Interfaces**
- **Product**: Common product behavior (getName, getDescription, getCategory, getBrandName)
- **Pricing**: Common pricing behavior (getPrice, getCurrency, getPricingType)
- **Specs**: Common specifications (getMaterial, getDimensions, getWeight, etc.)
- **DeliveryInfo**: Common delivery behavior (getDeliveryModes, getETA, getSizesAvailable)
- **Rating**: Common rating behavior (getRatingValue, getTotalReviews)

### 4. **Concrete Product Implementations**
- **Nike Products**: Implement Nike-specific product details and behavior
- **Adidas Products**: Implement Adidas-specific product details and behavior
- **Brand Consistency**: All products in a family share the same brand characteristics
- **Interchangeable**: Products can be swapped within the same brand family

---

## 🚀 How to Run

### Prerequisites
- Node.js (v16 or higher)
- npm or yarn package manager
- TypeScript knowledge (optional but helpful)

### Installation & Execution Steps

1. **Navigate to the Abstract Factory directory**
   ```bash
   cd Creational/Abstract_Factory
   ```

2. **Install dependencies**
   ```bash
   npm install
   ```

3. **Run in development mode (recommended)**
   ```bash
   npm run dev
   ```
   *This runs the TypeScript files directly without compilation*

4. **Or build and run in production mode**
   ```bash
   npm run build
   npm start
   ```

### Expected Output
The program will demonstrate:
- Creation of Nike product family (shoes, pricing, specs, delivery, rating)
- Creation of Adidas product family (shoes, pricing, specs, delivery, rating)
- Brand-specific details for each product family
- Consistent branding across all products in the same family

### Available Scripts
- `npm run dev` - Run TypeScript files directly with ts-node
- `npm run build` - Compile TypeScript to JavaScript
- `npm start` - Run compiled JavaScript
- `npm run clean` - Remove compiled files
