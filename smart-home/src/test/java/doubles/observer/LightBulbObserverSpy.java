package doubles.observer;

import observer.Observer;
import smarthome.itens.LightBulb;

public class LightBulbObserverSpy implements LightBulb, Observer {
    public boolean hasTurnedOn;
    public boolean hasTurnedOff;

    @Override
    public void turnOff() {
        hasTurnedOff = true;
    }

    @Override
    public void turnOn() {
        hasTurnedOn = true;
    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void update(String state) {
        if ("on".equals(state)) turnOn();
        else turnOff();
    }
}
