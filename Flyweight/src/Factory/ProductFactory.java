package Factory;

import java.util.HashMap;
import java.util.Map;

// Ensures each unique product is stored only once
public class ProductFactory {
    private static final Map<String, Product> productPool = new HashMap<>();

    public static Product getProduct(String productId, String name, String description, double basePrice) {
        if (!productPool.containsKey(productId)) {
            productPool.put(productId, new Product(productId, name, description, basePrice));
            System.out.println("Loading new Product into catalog: " + name);
        }
        return productPool.get(productId);
    }

    public static int getTotalProductsCreated() {
        return productPool.size();
    }
}
