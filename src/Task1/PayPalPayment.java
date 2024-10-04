package Task1;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal payment: $" + amount);
    }
}
