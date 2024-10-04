package Task2;

public class WhatsappNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Send whatsapp message to " + recipient + ": " + message);
    }
}
