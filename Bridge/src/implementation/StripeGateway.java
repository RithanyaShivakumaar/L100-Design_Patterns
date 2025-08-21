package implementation;

public class StripeGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " via Stripe.");
    }
}
