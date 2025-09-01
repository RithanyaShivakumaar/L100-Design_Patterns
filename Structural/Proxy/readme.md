# Proxy Pattern – Learning Management System (LMS) Access Control

## Problem Statement
When building secure systems that need to control access to resources, direct access to sensitive objects creates security vulnerabilities. The challenges include:

1. **Unrestricted Access**: Direct access to sensitive resources without proper validation
2. **Security Vulnerabilities**: No role-based or permission-based access control
3. **Lack of Audit Trail**: No logging of access attempts and user activities
4. **Resource Management**: No control over expensive or limited resources
5. **Coupling Issues**: Security logic mixed with business logic

**Without a proper pattern**: Any user could access any lesson regardless of their role or enrollment status, creating security and business logic violations.

## Solution: Proxy Pattern
The Proxy Pattern solves this by:
- **Controlling access** to the real object through a surrogate
- **Adding security layers** without modifying the original object
- **Implementing access logging** and audit trails transparently
- **Managing resource access** and lifecycle efficiently
- **Separating concerns** by keeping security logic separate from business logic

## Overview
This project demonstrates the **Proxy Design Pattern** using a **Learning Management System with Role-Based Access Control**.  
The Proxy Pattern provides a surrogate or placeholder for another object to control access to it, add functionality, or manage resource-intensive operations.

## Use Case: Learning Management System with Role-Based Access Control
A learning platform that controls access to educational content based on user roles and enrollment:
- **Role-Based Access Control** - restrict lesson access based on user roles (TEACHER/STUDENT)
- **Enrollment Validation** - students can only access lessons they're enrolled in
- **Permission Management** - teachers have unrestricted access to all lessons
- **Access Logging** - track all lesson access attempts with user details
- **Security Proxy** - control access to sensitive educational resources
- **User Authentication** - validate user identity and permissions before content access

## Pattern Components

| Component | Purpose | Example |
|-----------|---------|---------|
| **Subject Interface** | Defines common interface | `ContentService` |
| **Real Subject** | Actual content service | `RealContentService` |
| **Proxy** | Controls access to content | `ContentProxy` |
| **Client** | Uses content service | `ProxyLessonDemo` |

## How It Works

### 1. **Subject Interface**
- Defines **common contract** that both real subject and proxy implement
- Ensures **transparency** - client doesn't know it's using a proxy
- Provides **consistent API** for lesson viewing operations

### 2. **Real Subject**
- **Actual content service** with full lesson viewing functionality
- **Implements core operations** like viewing lessons
- **May contain sensitive educational content** requiring access control
- **Handles the actual lesson display logic**

### 3. **Proxy Class**
- **Implements the same interface** as the real content service
- **Controls access** to lessons based on user role and enrollment
- **Adds security functionality** like role validation and enrollment checking
- **Manages access permissions** before delegating to real service

### 4. **Access Control Logic**
- **Role Validation**: Checks if user is TEACHER or STUDENT
- **Enrollment Checking**: For students, validates if they're enrolled in the requested lesson
- **Permission Enforcement**: Teachers get unrestricted access, students get restricted access
- **Access Logging**: Records user details and access attempts
- **Exception Handling**: Throws appropriate access denied messages for unauthorized attempts

## Implementation Details

### User Roles
- **TEACHER**: Can access all lessons without restrictions
- **STUDENT**: Can only access lessons they're enrolled in

### Access Control Flow
1. User requests to view a lesson
2. Proxy validates user role and permissions
3. If access is granted, request is forwarded to real service
4. If access is denied, appropriate exception is thrown

### Example Usage
```java
User teacher = new User("Alice", "TEACHER", Arrays.asList());
User student = new User("Bob", "STUDENT", Arrays.asList("L1", "L3"));

ContentService teacherAccess = new ContentProxy(teacher);
ContentService studentAccess = new ContentProxy(student);

// Teacher can access any lesson
teacherAccess.viewLesson("L2");  // Success

// Student can access enrolled lessons
studentAccess.viewLesson("L3");  // Success

// Student cannot access unenrolled lessons
studentAccess.viewLesson("L5");  // Access Denied Exception
```

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution Steps

1. **Navigate to the Proxy directory**
   ```bash
   cd Structural/Proxy/src
   ```

2. **Compile all Java files**
   ```bash
   javac *.java */*.java
   ```

3. **Run the LMS access control demo**
   ```bash
   java ProxyLessonDemo
   ```

### Expected Output
The program will demonstrate:
- Role-based access control for teachers and students
- Enrollment validation for student access
- Access logging and audit trail functionality
- Security proxy controlling access to lesson content
- Exception handling for unauthorized access attempts

### Alternative IDE Execution
1. Open the project in your Java IDE
2. Navigate to `ProxyLessonDemo.java`
3. Right-click and select "Run" or press the run button
4. View the access control demonstration output in the IDE console

### File Structure
- `interfaces/ContentService.java` - Common interface for content access (Subject)
- `service/RealContentService.java` - Actual content service implementation (Real Subject)
- `proxy/ContentProxy.java` - Security proxy controlling access (Proxy)
- `model/User.java` - User model with role and enrollment information
- `ProxyLessonDemo.java` - Main demonstration of proxy pattern usage
