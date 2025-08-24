package state;

import context.FoodOrder;

public class NewOrderState implements OrderState {

    @Override
    public void next(FoodOrder order) {
        System.out.println("Order is being prepared...");
        order.setState(new PreparingState());
    }

    @Override
    public void cancel(FoodOrder order) {
        System.out.println("Order canceled successfully.");
        order.setState(new CanceledState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order placed, waiting for restaurant confirmation.");
    }
}
