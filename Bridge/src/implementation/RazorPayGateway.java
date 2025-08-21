package implementation;

public class RazorPayGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " via Razorpay.");
    }
}
