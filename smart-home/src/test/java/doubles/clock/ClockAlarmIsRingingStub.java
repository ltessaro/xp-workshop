package doubles.clock;

import smarthome.itens.ClockAlarm;

public class ClockAlarmIsRingingStub implements ClockAlarm {
    @Override
    public boolean isOn() {
        return true;
    }
}
