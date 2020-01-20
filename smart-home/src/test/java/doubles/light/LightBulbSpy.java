package doubles.light;

import smarthome.itens.LightBulb;

public class LightBulbSpy implements LightBulb {
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
}
