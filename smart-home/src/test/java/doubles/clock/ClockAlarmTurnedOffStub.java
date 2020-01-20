package doubles.clock;

import smarthome.itens.ClockAlarm;

public class ClockAlarmTurnedOffStub implements ClockAlarm {
    @Override
    public boolean isOn() {
        return false;
    }
}
