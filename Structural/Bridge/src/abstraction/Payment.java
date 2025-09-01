package abstraction;

import implementation.PaymentGateway;

public abstract class Payment {
    protected PaymentGateway gateway;

    public Payment(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public abstract void pay(double amount);
}
