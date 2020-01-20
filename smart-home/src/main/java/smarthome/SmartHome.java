package smarthome;

import smarthome.itens.ClockAlarm;
import smarthome.itens.CoffeeMakerMachine;
import smarthome.itens.LightBulb;
import smarthome.itens.LightSwitch;

public class SmartHome {
    private final CoffeeMakerMachine coffeeMakerMachine;
    private final ClockAlarm clockAlarm;
    private LightSwitch lightSwitch;
    private LightBulb lightBulb;

    public SmartHome(final ClockAlarm clockAlarm,
                     final LightSwitch lightSwitch,
                     final LightBulb lightBulb,
                     final CoffeeMakerMachine coffeeMakerMachine) {
        this.clockAlarm = clockAlarm;
        this.coffeeMakerMachine = coffeeMakerMachine;
        this.lightSwitch = lightSwitch;
        this.lightBulb = lightBulb;
    }

    public void run() {
        if (lightSwitch.isOn()) {
            lightBulb.turnOn();
        } else {
            lightBulb.turnOff();
        }

        if (clockAlarm.isOn()) {
            coffeeMakerMachine.turnOn();
        } else {
            coffeeMakerMachine.turnOff();
        }
    }
}