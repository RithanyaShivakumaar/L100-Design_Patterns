package devices;

import mediator.HomeMediator;

public abstract class Device {
    protected HomeMediator mediator;
    protected String name;

    public Device(String name, HomeMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerDevice(this);
    }

    public String getName() {
        return name;
    }

    public abstract void execute(String action);

    public void sendEvent(String event) {
        mediator.notify(this, event);
    }
}
