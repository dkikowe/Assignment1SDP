package Task1;

import Task1.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment: $" + amount);
    }
}
