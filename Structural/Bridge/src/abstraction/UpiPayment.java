package abstraction;

import implementation.PaymentGateway;

public class UpiPayment extends Payment {
    public UpiPayment(PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI Payment...");
        gateway.processPayment(amount);
    }
}
