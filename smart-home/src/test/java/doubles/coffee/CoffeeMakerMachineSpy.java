package doubles.coffee;

import smarthome.itens.CoffeeMakerMachine;

public class CoffeeMakerMachineSpy implements CoffeeMakerMachine {
    public boolean hasTurnedOff;
    public boolean hasTurnedOn;
    @Override
    public void turnOn() {
        hasTurnedOn = true;
    }

    @Override
    public void turnOff() {
        hasTurnedOff = true;
    }
}
