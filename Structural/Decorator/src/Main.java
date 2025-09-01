import component.Product;
import decorator.*;

public class Main {
    public static void main(String[] args) {
        // Base product
        Product basicProduct = new Product() {
            @Override
            public double getPrice() {
                return 500;
            }

            @Override
            public String getDescription() {
                return "Smartphone";
            }
        };

        System.out.println("=== Base Product ===");
        System.out.println(basicProduct.getDescription() + ": $" + basicProduct.getPrice());

        // Apply decorators
        Product decoratedProduct = new GiftWrapDecorator(
                                        new DiscountDecorator(
                                            new ExpressDeliveryDecorator(
                                               (basicProduct)
                                            )
                                        )
                                    );

        System.out.println("\n=== Decorated Product ===");
        System.out.println(decoratedProduct.getDescription() + ": $" + decoratedProduct.getPrice());
    }
}
