package state;

import context.FoodOrder;

public class DeliveredState implements OrderState {

    @Override
    public void next(FoodOrder order) {
        System.out.println("Order already delivered. No next state.");
    }

    @Override
    public void cancel(FoodOrder order) {
        System.out.println("Cannot cancel, order already delivered.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order has been delivered. Enjoy your meal!");
    }
}
