package Task1;

import Task1.*;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        Payment creditCard = new CreditCardPayment();
        paymentProcessor.process(creditCard, 150.0);

        Payment kaspi = new KaspiPayment();
        paymentProcessor.process(kaspi, 452);

        Payment paypal = new PayPalPayment();
        paymentProcessor.process(paypal, 200.0);

        Payment bankTransfer = new BankTransferPayment();
        paymentProcessor.process(bankTransfer, 300.0);
    }
}
