package abstraction;

import implementation.PaymentGateway;

public class CreditCardPayment extends Payment {
    public CreditCardPayment(PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI Payment...");
        gateway.processPayment(amount);
    }
}
