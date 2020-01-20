import doubles.light.LightSwitchTurnedOffStub;
import doubles.light.LightSwitchTurnedOnStub;
import doubles.observer.LightBulbObserverSpy;
import org.junit.Test;
import smarthome.SmartHomeObserver;
import smarthome.itens.LightSwitch;

import static org.junit.Assert.assertTrue;

public class SmartHomeObserverTest {
    @Test
    public void shouldLightBulbTurnOnWhenSwitchIsOn() {
        final LightSwitch lightSwitch = new LightSwitchTurnedOnStub();
        final LightBulbObserverSpy lightBulbObserverSpy = new LightBulbObserverSpy();

        SmartHomeObserver smartHomeObserver = new SmartHomeObserver(lightSwitch);
        smartHomeObserver.addObservers(lightBulbObserverSpy);

        smartHomeObserver.run();

        assertTrue(lightBulbObserverSpy.hasTurnedOn);
    }

    @Test
    public void shouldLightBulbTurnOffWhenSwitchIsOff() {
        final LightSwitch lightSwitch = new LightSwitchTurnedOffStub();
        final LightBulbObserverSpy lightBulbObserverSpy = new LightBulbObserverSpy();

        SmartHomeObserver smartHomeObserver = new SmartHomeObserver(lightSwitch);
        smartHomeObserver.addObservers(lightBulbObserverSpy);

        smartHomeObserver.run();

        assertTrue(lightBulbObserverSpy.hasTurnedOff);
    }
}
