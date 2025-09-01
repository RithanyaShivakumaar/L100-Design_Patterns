package state;

import context.FoodOrder;

public interface OrderState {
    void next(FoodOrder order);
    void cancel(FoodOrder order);
    void printStatus();
}
