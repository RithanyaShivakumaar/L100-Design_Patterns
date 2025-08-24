package strategies;

public class FallbackStrategy implements RecoveryStrategy {
    @Override
    public void recover(Exception e) {
        System.out.println("Using fallback due to error: " + e.getMessage());
        // Example: return cached/default data
    }
}