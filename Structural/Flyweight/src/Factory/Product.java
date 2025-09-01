package Factory;

public class Product {
    private final String productId;
    private final String name;
    private final String description;
    private final double basePrice;

    public Product(String productId, String name, String description, double basePrice) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
    }

    public void displayProductInfo() {
        System.out.println("[Product] " + name + " (" + productId + ") - " + description + " | Base Price: $" + basePrice);
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getProductId() {
        return productId;
    }
}

