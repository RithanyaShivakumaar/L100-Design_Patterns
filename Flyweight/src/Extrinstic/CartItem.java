package Extrinstic;

import Factory.Product;

// Represents product in a user's cart (extrinsic state)
public class CartItem {
    private final Product product;   // shared flyweight
    private final String userId;     // extrinsic
    private final String variant;    // extrinsic (color, storage, etc.)
    private final int quantity;      // extrinsic

    public CartItem(Product product, String userId, String variant, int quantity) {
        this.product = product;
        this.userId = userId;
        this.variant = variant;
        this.quantity = quantity;
    }

    public void displayCartItem() {
        product.displayProductInfo();  // shared data
        System.out.println(" -> User: " + userId + ", Variant: " + variant + ", Quantity: " + quantity);
    }

    public double getTotalPrice() {
        return product.getBasePrice() * quantity;
    }
}
