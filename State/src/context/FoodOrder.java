package context;

import state.NewOrderState;
import state.OrderState;

public class FoodOrder {
    private OrderState state;

    public FoodOrder() {
        // Initial state = New order
        this.state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void cancelOrder() {
        state.cancel(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
