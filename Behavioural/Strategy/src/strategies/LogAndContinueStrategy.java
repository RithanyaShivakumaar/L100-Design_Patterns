package strategies;

public class LogAndContinueStrategy implements RecoveryStrategy {
    @Override
    public void recover(Exception e) {
        System.out.println("Logging error and continuing: " + e.getMessage());
        // Example: log to file/console
    }
}