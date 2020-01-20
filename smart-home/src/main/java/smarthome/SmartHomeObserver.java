package smarthome;

import observer.Observer;
import observer.SubjectObserver;
import smarthome.itens.LightSwitch;

public class SmartHomeObserver {
    private final LightSwitch lightSwitch;
    private final SubjectObserver subjectObserver;

    public SmartHomeObserver(LightSwitch lightSwitch) {
        this.lightSwitch = lightSwitch;
        this.subjectObserver = new SubjectObserver();
    }

    public void addObservers(Observer observer) {
        this.subjectObserver.add(observer);
    }

    public void run() {
        this.subjectObserver.notify(lightSwitch.isOn() ? "on" : "off");
    }
}