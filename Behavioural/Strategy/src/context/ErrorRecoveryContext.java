package context;

import strategies.RecoveryStrategy;

public class ErrorRecoveryContext {
    private RecoveryStrategy strategy;

    public ErrorRecoveryContext(RecoveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RecoveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void handleError(Exception e) {
        strategy.recover(e);
    }
}