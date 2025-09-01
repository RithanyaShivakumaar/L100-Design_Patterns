package devices;

import mediator.HomeMediator;

public class DoorLock extends Device {
    public DoorLock(String name, HomeMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void execute(String action) {
        System.out.println("[DoorLock] " + name + " -> " + action);
    }
}
