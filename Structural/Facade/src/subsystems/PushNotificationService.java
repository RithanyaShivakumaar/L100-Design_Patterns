package subsystems;

// Simulates push notifications
public class PushNotificationService {
    public void sendPush(String user, String message) {
        System.out.println("Push notification sent to " + user + ": " + message);
    }
}
