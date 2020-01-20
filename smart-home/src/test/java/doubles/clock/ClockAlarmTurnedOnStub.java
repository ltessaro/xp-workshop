package doubles.clock;

import smarthome.itens.ClockAlarm;

public class ClockAlarmTurnedOnStub implements ClockAlarm {
    @Override
    public boolean isOn() {
        return false;
    }
}
