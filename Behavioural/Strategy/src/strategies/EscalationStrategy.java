package strategies;

public class EscalationStrategy implements RecoveryStrategy {
    @Override
    public void recover(Exception e) {
        System.out.println("Escalating error to admin: " + e.getMessage());
        // Example: send alert/notification
    }
}