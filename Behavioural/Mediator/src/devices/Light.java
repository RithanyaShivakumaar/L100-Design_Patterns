package devices;

import mediator.HomeMediator;

public class Light extends Device {
    public Light(String name, HomeMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void execute(String action) {
        System.out.println("[Light] " + name + " -> " + action);
    }
}
