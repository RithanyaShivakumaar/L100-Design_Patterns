package subsystems;

// Simulates sending SMS
public class SmsService {
    public void sendSms(String user, String message) {
        System.out.println("SMS sent to " + user + ": " + message);
    }
}
