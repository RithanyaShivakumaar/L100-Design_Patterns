import facade.NotificationFacade;

public class ClientApp {
    public static void main(String[] args) {
        NotificationFacade notificationFacade = new NotificationFacade();

        System.out.println("=== Sending High Priority Alert ===");
        notificationFacade.sendHighPriorityAlert("user@example.com", "System down! Immediate attention required.");

        System.out.println("\n=== Sending Low Priority Update ===");
        notificationFacade.sendLowPriorityUpdate("user@example.com", "Your daily report is ready.");

        System.out.println("\n=== Sending Slack Notification ===");
        notificationFacade.sendSlackNotification("#dev-team", "Deployment completed successfully!");
    }
}
