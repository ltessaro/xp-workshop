package doubles.clock;

import smarthome.itens.ClockAlarm;

public class ClockAlarmIsNotRingingStub implements ClockAlarm {
    @Override
    public boolean isOn() {
        return false;
    }
}
