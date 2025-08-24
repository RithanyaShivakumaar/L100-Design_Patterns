package strategies;

public class RetryStrategy implements RecoveryStrategy {
    @Override
    public void recover(Exception e) {
        System.out.println("Retrying operation after error: " + e.getMessage());
        // Simulate retry logic (could implement exponential backoff here)
    }
}