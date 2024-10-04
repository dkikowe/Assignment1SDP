package Task2;

public class PushNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Send Push to " + recipient + ": " + message);
    }
}
