package Task2;

public class SlackNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Send slack to " + recipient + ": " + message);
    }
}
