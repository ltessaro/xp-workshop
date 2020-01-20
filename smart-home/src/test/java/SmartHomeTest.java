import doubles.clock.ClockAlarmIsNotRingingStub;
import doubles.clock.ClockAlarmIsRingingStub;
import doubles.clock.ClockAlarmTurnedOffStub;
import doubles.coffee.CoffeeMakerMachineDummy;
import doubles.coffee.CoffeeMakerMachineSpy;
import doubles.light.LightBulbDummy;
import doubles.light.LightBulbSpy;
import doubles.light.LightSwitchTurnedOffStub;
import doubles.light.LightSwitchTurnedOnStub;
import org.junit.Test;
import smarthome.*;
import smarthome.itens.ClockAlarm;
import smarthome.itens.LightSwitch;

import static org.junit.Assert.assertTrue;

public class SmartHomeTest {
    @Test
    public void shouldLightBulbTurnOnWhenSwitchIsOn() {
        final LightSwitch lightSwitch = new LightSwitchTurnedOnStub();
        final ClockAlarm clockAlarm = new ClockAlarmTurnedOffStub();

        final LightBulbSpy lightBulb = new LightBulbSpy();
        SmartHome smartHome = new SmartHome(clockAlarm, lightSwitch, lightBulb, new CoffeeMakerMachineDummy());

        smartHome.run();

        assertTrue(lightBulb.hasTurnedOn);
    }

    @Test
    public void shouldLightBulbTurnOffWhenSwitchIsOff() {
        final LightSwitch lightSwitch = new LightSwitchTurnedOffStub();
        final ClockAlarm clockAlarm = new ClockAlarmTurnedOffStub();
        final LightBulbSpy lightBulb = new LightBulbSpy();
        SmartHome smartHome = new SmartHome(clockAlarm, lightSwitch, lightBulb, new CoffeeMakerMachineDummy());

        smartHome.run();

        assertTrue(lightBulb.hasTurnedOff);
    }

    @Test
    public void shouldCoffeeMakerIsOnWhenAlarmClockIsRinging() {
        final ClockAlarm clockAlarm = new ClockAlarmIsRingingStub();
        final LightSwitch lightSwitch = new LightSwitchTurnedOffStub();
        final CoffeeMakerMachineSpy coffeeMakerMachine = new CoffeeMakerMachineSpy();
        SmartHome smartHome = new SmartHome(clockAlarm, lightSwitch, new LightBulbDummy(), coffeeMakerMachine);

        smartHome.run();

        assertTrue(coffeeMakerMachine.hasTurnedOn);
    }

    @Test
    public void shouldCoffeeMakerIsOffWhenAlarmClockIsNotRinging() {
        final ClockAlarm clockAlarm = new ClockAlarmIsNotRingingStub();
        final LightSwitch lightSwitch = new LightSwitchTurnedOffStub();
        final CoffeeMakerMachineSpy coffeeMakerMachine = new CoffeeMakerMachineSpy();
        SmartHome smartHome = new SmartHome(clockAlarm, lightSwitch, new LightBulbDummy(), coffeeMakerMachine);

        smartHome.run();

        assertTrue(coffeeMakerMachine.hasTurnedOff);
    }

    @Test
    public void shouldCoffeeMakerIsOffWhenAlarmClockIsNotRinging_And_LightIsOffWhenSwitchIsOff() {
        final ClockAlarm clockAlarm = new ClockAlarmIsNotRingingStub();
        final LightSwitch lightSwitch = new LightSwitchTurnedOffStub();
        final LightBulbSpy lightBulb = new LightBulbSpy();
        final CoffeeMakerMachineSpy coffeeMakerMachine = new CoffeeMakerMachineSpy();
        SmartHome smartHome = new SmartHome(clockAlarm, lightSwitch, lightBulb, coffeeMakerMachine);

        smartHome.run();

        assertTrue(coffeeMakerMachine.hasTurnedOff);
        assertTrue(lightBulb.hasTurnedOff);
    }

    @Test
    public void shouldCoffeeMakerIsOnWhenAlarmClockIsRinging_And_LightIsOnWhenSwitchIsOn() {
        final ClockAlarm clockAlarm = new ClockAlarmIsRingingStub();
        final LightSwitch lightSwitch = new LightSwitchTurnedOnStub();
        final LightBulbSpy lightBulb = new LightBulbSpy();
        final CoffeeMakerMachineSpy coffeeMakerMachine = new CoffeeMakerMachineSpy();
        SmartHome smartHome = new SmartHome(clockAlarm, lightSwitch, lightBulb, coffeeMakerMachine);

        smartHome.run();

        assertTrue(coffeeMakerMachine.hasTurnedOn);
        assertTrue(lightBulb.hasTurnedOn);
    }

    @Test
    public void shouldCoffeeMakerIsOffWhenAlarmClockIsNotRinging_And_LightIsOnWhenSwitchIsOn() {
        final ClockAlarm clockAlarm = new ClockAlarmIsNotRingingStub();
        final LightSwitch lightSwitch = new LightSwitchTurnedOnStub();
        final LightBulbSpy lightBulb = new LightBulbSpy();
        final CoffeeMakerMachineSpy coffeeMakerMachine = new CoffeeMakerMachineSpy();
        SmartHome smartHome = new SmartHome(clockAlarm, lightSwitch, lightBulb, coffeeMakerMachine);

        smartHome.run();

        assertTrue(coffeeMakerMachine.hasTurnedOff);
        assertTrue(lightBulb.hasTurnedOn);
    }

    @Test
    public void shouldCoffeeMakerIsOnWhenAlarmClockIsRinging_And_LightIsOffWhenSwitchIsOff() {
        final ClockAlarm clockAlarm = new ClockAlarmIsRingingStub();
        final LightSwitch lightSwitch = new LightSwitchTurnedOffStub();
        final LightBulbSpy lightBulb = new LightBulbSpy();
        final CoffeeMakerMachineSpy coffeeMakerMachine = new CoffeeMakerMachineSpy();
        SmartHome smartHome = new SmartHome(clockAlarm, lightSwitch, lightBulb, coffeeMakerMachine);

        smartHome.run();

        assertTrue(coffeeMakerMachine.hasTurnedOn);
        assertTrue(lightBulb.hasTurnedOff);
    }
}