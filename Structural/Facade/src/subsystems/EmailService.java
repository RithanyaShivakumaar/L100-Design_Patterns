package subsystems;

// Simulates sending emails
public class EmailService {
    public void sendEmail(String user, String message) {
        System.out.println("Email sent to " + user + ": " + message);
    }
}
