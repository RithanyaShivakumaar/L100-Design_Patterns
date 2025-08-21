package abstraction;

import implementation.PaymentGateway;

public class NetBankingPayment extends Payment {
    public NetBankingPayment(PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing NetBanking Payment...");
        gateway.processPayment(amount);
    }
}
