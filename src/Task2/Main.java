package Task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificationSender sender = new NotificationSender();

        Notification smsNotification = new SMSNotification();
        Notification emailNotification = new EmailNotification();
        Notification pushNotification = new PushNotification();
        Notification slackNotification = new SlackNotification();
        Notification whatsappNotification = new WhatsappNotification();

        List<String> recipients = Arrays.asList("user1", "user2", "user3");

        sender.sendNotification(smsNotification, "SMS", recipients);
        sender.sendNotification(emailNotification, "Email", recipients);
        sender.sendNotification(pushNotification, "Push", recipients);
        sender.sendNotification(slackNotification, "Slack", recipients);
        sender.sendNotification(whatsappNotification, "Whatsapp", recipients);
    }
}
