import context.ErrorRecoveryContext;
import strategies.*;

public class Main {
    public static void main(String[] args) {
        // Start with Retry strategy
        ErrorRecoveryContext context = new ErrorRecoveryContext(new RetryStrategy());
        context.handleError(new Exception("API Timeout"));

        // Switch to Fallback strategy
        context.setStrategy(new FallbackStrategy());
        context.handleError(new Exception("Database unavailable"));

        // Switch to Log and Continue
        context.setStrategy(new LogAndContinueStrategy());
        context.handleError(new Exception("Minor validation issue"));

        // Switch to Escalation strategy
        context.setStrategy(new EscalationStrategy());
        context.handleError(new Exception("Critical system failure"));
    }
}
