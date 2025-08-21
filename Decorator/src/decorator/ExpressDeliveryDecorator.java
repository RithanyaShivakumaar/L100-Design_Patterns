package decorator;

import component.Product;

public class ExpressDeliveryDecorator extends ProductDecorator {

    public ExpressDeliveryDecorator(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 100; // Express delivery charge
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " + Express Delivery";
    }
}
