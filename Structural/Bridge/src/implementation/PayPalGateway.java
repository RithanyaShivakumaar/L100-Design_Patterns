package implementation;

public class PayPalGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " via PayPal.");
    }
}
