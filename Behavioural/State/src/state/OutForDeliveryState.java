package state;

import context.FoodOrder;

public class OutForDeliveryState implements OrderState {

    @Override
    public void next(FoodOrder order) {
        System.out.println("Order delivered successfully!");
        order.setState(new DeliveredState());
    }

    @Override
    public void cancel(FoodOrder order) {
        System.out.println("Order cannot be canceled, it is already out for delivery!");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is on the way to your location.");
    }
}
