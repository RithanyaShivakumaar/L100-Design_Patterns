package decorator;

import component.Product;

public abstract class ProductDecorator implements Product {
    protected Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }
}
