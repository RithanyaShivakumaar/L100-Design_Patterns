package decorator;

import component.Product;

public class DiscountDecorator extends ProductDecorator {

    public DiscountDecorator(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() * 0.9; // 10% discount
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " + 10% Discount";
    }
}
