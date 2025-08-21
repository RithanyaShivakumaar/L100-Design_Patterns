package decorator;

import component.Product;

public class GiftWrapDecorator extends ProductDecorator {

    public GiftWrapDecorator(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 50; // Gift wrap cost
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " + Gift Wrap";
    }
}
