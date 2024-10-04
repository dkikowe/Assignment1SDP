package Task1;

import Task1.Payment;

public class KaspiPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Kaspi transfer payment: $" + amount);
    }
}
