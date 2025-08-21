import abstraction.*;
import implementation.*;

public class Main {
    public static void main(String[] args) {
        Payment upi = new UpiPayment(new RazorPayGateway());
        upi.pay(500);

        Payment creditCard = new CreditCardPayment(new PayPalGateway());
        creditCard.pay(1200);

        Payment netBanking = new NetBankingPayment(new StripeGateway());
        netBanking.pay(2000);
    }
}
