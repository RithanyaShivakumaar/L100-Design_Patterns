import devices.Device;
import devices.DoorLock;
import devices.Fan;
import devices.Light;
import devices.Thermostat;
import mediator.HomeMediator;
import mediator.SmartHub;

public class Main {
    public static void main(String[] args) {
        HomeMediator hub = new SmartHub();

        Device light = new Light("Living Room Light", hub);
        Device fan = new Fan("Ceiling Fan", hub);
        Device thermostat = new Thermostat("Thermostat", hub);
        Device doorLock = new DoorLock("Main Door", hub);

        System.out.println("\n--- Motion Detected ---");
        light.sendEvent("MOTION_DETECTED");

        System.out.println("\n--- No Motion ---");
        doorLock.sendEvent("NO_MOTION");

        System.out.println("\n--- Hot Temperature ---");
        thermostat.sendEvent("HOT");

        System.out.println("\n--- Cold Temperature ---");
        thermostat.sendEvent("COLD");
    }
}
