package mediator;

import java.util.ArrayList;
import java.util.List;

import devices.*;

public class SmartHub implements HomeMediator {
    private List<Device> devices = new ArrayList<>();

    @Override
    public void registerDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void notify(Device sender, String event) {
        System.out.println("[SmartHub] Event from " + sender.getName() + ": " + event);

        switch (event) {
            case "MOTION_DETECTED":
                devices.forEach(d -> {
                    if (d instanceof Light) d.execute("TURN_ON");
                    if (d instanceof DoorLock) d.execute("UNLOCK");
                });
                break;

            case "NO_MOTION":
                devices.forEach(d -> {
                    if (d instanceof Light) d.execute("TURN_OFF");
                    if (d instanceof DoorLock) d.execute("LOCK");
                });
                break;

            case "HOT":
                devices.forEach(d -> {
                    if (d instanceof Fan) d.execute("TURN_ON");
                    if (d instanceof Thermostat) d.execute("COOL");
                });
                break;

            case "COLD":
                devices.forEach(d -> {
                    if (d instanceof Fan) d.execute("TURN_OFF");
                    if (d instanceof Thermostat) d.execute("HEAT");
                });
                break;
        }
    }
}
