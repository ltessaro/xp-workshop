package doubles.light;

import smarthome.itens.LightSwitch;

public class LightSwitchTurnedOffStub implements LightSwitch {
    @Override
    public boolean isOn() {
        return false;
    }
}
