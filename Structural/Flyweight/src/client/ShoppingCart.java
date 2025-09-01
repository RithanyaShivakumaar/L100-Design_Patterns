package client;

import Extrinstic.CartItem;
import Factory.ProductFactory;
import Factory.Product;

import java.util.ArrayList;
import java.util.List;

// A shopping cart belonging to a specific user
public class ShoppingCart {
    private final String userId;
    private final List<CartItem> items;

    public ShoppingCart(String userId) {
        this.userId = userId;
        this.items = new ArrayList<>();
    }

    public void addItem(String productId, String name, String description, double basePrice, String variant, int quantity) {
        Product product = ProductFactory.getProduct(productId, name, description, basePrice);
        CartItem item = new CartItem(product, userId, variant, quantity);
        items.add(item);
    }

    public void displayCart() {
        System.out.println("\nShopping Cart for User: " + userId);
        for (CartItem item : items) {
            item.displayCartItem();
        }
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(CartItem::getTotalPrice).sum();
    }
}
