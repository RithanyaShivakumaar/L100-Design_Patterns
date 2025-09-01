package subsystems;

// Simulates Slack messages
public class SlackService {
    public void sendSlackMessage(String channel, String message) {
        System.out.println("Slack message sent to channel " + channel + ": " + message);
    }
}
