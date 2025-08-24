import context.FoodOrder;

public class Main {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();

        order.printStatus();
        order.nextState();   // Preparing
        order.printStatus();
        order.nextState();   // Out for Delivery
        order.printStatus();
        order.nextState();   // Delivered
        order.printStatus();

        System.out.println("\nTrying to cancel after delivery:");
        order.cancelOrder();
    }
}
