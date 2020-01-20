package doubles.light;

import smarthome.itens.LightSwitch;

public class LightSwitchDummy implements LightSwitch {
    @Override
    public boolean isOn() {
        return false;
    }
}
