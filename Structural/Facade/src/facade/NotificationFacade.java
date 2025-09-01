package facade;

import subsystems.*;

// Facade hides the complexity of multiple notification channels
public class NotificationFacade {
    private EmailService emailService;
    private SmsService smsService;
    private PushNotificationService pushService;
    private SlackService slackService;

    public NotificationFacade() {
        this.emailService = new EmailService();
        this.smsService = new SmsService();
        this.pushService = new PushNotificationService();
        this.slackService = new SlackService();
    }

    // Send high priority alerts via multiple channels
    public void sendHighPriorityAlert(String user, String message) {
        emailService.sendEmail(user, message);
        smsService.sendSms(user, message);
        pushService.sendPush(user, message);
    }

    // Send low priority updates via push only
    public void sendLowPriorityUpdate(String user, String message) {
        pushService.sendPush(user, message);
    }

    // Send team collaboration messages to Slack
    public void sendSlackNotification(String channel, String message) {
        slackService.sendSlackMessage(channel, message);
    }
}
