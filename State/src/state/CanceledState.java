package state;

import context.FoodOrder;

public class CanceledState implements OrderState {

    @Override
    public void next(FoodOrder order) {
        System.out.println("Cannot proceed, order is canceled.");
    }

    @Override
    public void cancel(FoodOrder order) {
        System.out.println("Order is already canceled.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order has been canceled.");
    }
}
