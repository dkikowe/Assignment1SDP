package Task1;

import Task1.Payment;

public class BankTransferPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Bank transfer payment: $" + amount);
    }
}
