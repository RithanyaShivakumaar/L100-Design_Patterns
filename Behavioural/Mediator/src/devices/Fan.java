package devices;

import mediator.HomeMediator;

public class Fan extends Device {
    public Fan(String name, HomeMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void execute(String action) {
        System.out.println("[Fan] " + name + " -> " + action);
    }
}
