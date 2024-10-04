package Task2;

public class SMSNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Send SMS to " + recipient + ": " + message);
    }
}
