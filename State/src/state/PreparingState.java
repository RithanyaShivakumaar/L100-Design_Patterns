package state;

import context.FoodOrder;

public class PreparingState implements OrderState {

    @Override
    public void next(FoodOrder order) {
        System.out.println("Order is out for delivery...");
        order.setState(new OutForDeliveryState());
    }

    @Override
    public void cancel(FoodOrder order) {
        System.out.println("Order cannot be canceled now, it is already being prepared!");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is being prepared by the restaurant.");
    }
}
