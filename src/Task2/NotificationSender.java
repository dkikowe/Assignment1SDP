package Task2;

import java.util.List;

public class NotificationSender {
    public void sendNotification(Notification notification, String message, List<String> recipients) {
        for (String recipient : recipients) {
            notification.send(message, recipient);
        }
    }
}
