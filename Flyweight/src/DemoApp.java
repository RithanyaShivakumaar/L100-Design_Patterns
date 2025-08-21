import client.ShoppingCart;
import Factory.ProductFactory;

public class DemoApp {
    public static void main(String[] args) {
        // User 1's cart
        ShoppingCart cart1 = new ShoppingCart("User1");
        cart1.addItem("P1001", "iPhone 15 Pro", "Latest Apple flagship", 1200.0, "Blue 128GB", 1);
        cart1.addItem("P1002", "Sony WH-1000XM5", "Noise Cancelling Headphones", 400.0, "Black", 2);

        // User 2's cart (shares product flyweights)
        ShoppingCart cart2 = new ShoppingCart("User2");
        cart2.addItem("P1001", "iPhone 15 Pro", "Latest Apple flagship", 1200.0, "White 256GB", 1);
        cart2.addItem("P1002", "Sony WH-1000XM5", "Noise Cancelling Headphones", 400.0, "Silver", 1);

        // Display carts
        cart1.displayCart();
        System.out.println("Total: $" + cart1.calculateTotal());

        cart2.displayCart();
        System.out.println("Total: $" + cart2.calculateTotal());

        // Check how many unique products were actually created
        System.out.println("\nTotal unique products in memory: " + ProductFactory.getTotalProductsCreated());
    }
}
