package doubles.light;

import smarthome.itens.LightBulb;

public class LightBulbIsOffStub implements LightBulb {
    @Override
    public void turnOff() {
    }

    @Override
    public void turnOn() {
    }

    @Override
    public boolean isOn() {
        return false;
    }
}
