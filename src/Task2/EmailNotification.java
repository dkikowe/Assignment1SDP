package Task2;

public class EmailNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Send email to " + recipient + ": " + message);
    }
}
