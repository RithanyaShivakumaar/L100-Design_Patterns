package devices;

import mediator.HomeMediator;

public class Thermostat extends Device {
    public Thermostat(String name, HomeMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void execute(String action) {
        System.out.println("[Thermostat] " + name + " -> " + action);
    }
}
