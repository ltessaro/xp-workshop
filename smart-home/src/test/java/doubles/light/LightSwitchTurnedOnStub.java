package doubles.light;

import smarthome.itens.LightSwitch;

public class LightSwitchTurnedOnStub implements LightSwitch {
    @Override
    public boolean isOn() {
        return true;
    }
}