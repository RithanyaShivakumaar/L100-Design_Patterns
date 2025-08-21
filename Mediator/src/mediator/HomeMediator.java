package mediator;

import devices.Device;

public interface HomeMediator {
    void registerDevice(Device device);
    void notify(Device sender, String event);
}
