# Smart Notification System with Facade

## Overview
This project demonstrates the **Facade Design Pattern** using a **Smart Notification System**.  
The goal is to simplify the integration of multiple notification sources (system alerts, reminders, chats, promotions) into a unified interface for the Dashboard UI.  

Instead of the UI dealing with multiple services directly, a **NotificationFacade** acts as the single entry point, reducing complexity and improving maintainability.

---

## The Use Case: Smart Notifications
Users can receive notifications from multiple sources:

- **System Alerts** – e.g., `"Your session will expire soon."`
- **Messages/Chats** – e.g., `"Your colleague commented on your document."`
- **Reminders** – e.g., `"Meeting at 3 PM."`
- **Promotions/News** – e.g., `"New course available."`

Each of these comes from different services/systems:

- `MessageService` → fetches unread chats  
- `ReminderService` → fetches calendar events  
- `SystemAlertService` → checks infra/session status  
- `NewsService` → fetches backend announcements  

---

##  Why Facade is Needed
The **Facade Pattern** gives a unified interface (`NotificationFacade`) that:

- Talks to all services behind the scenes.  
- Aggregates notifications into a standard format (title, message, type, time).  
- Filters/Prioritizes notifications (urgent > normal > promotions).  
- Exposes just **one clean method** to the UI, e.g.:  

## 📂 Folder Structure

```
Facade/
├── src/
│ ├── facade/
│ │ └── NotificationFacade.java
│ ├── services/
│ │ ├── MessageService.java
│ │ ├── ReminderService.java
│ │ ├── SystemAlertService.java
│ │ └── NewsService.java
│ ├── model/
│ │ └── Notification.java
│ └── App.java
└── README.md
```
