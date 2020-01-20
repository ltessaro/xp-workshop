package doubles.observer;

import observer.Observer;

public class ObserverSpy implements Observer {
    public boolean wasNotified;


    @Override
    public void update(String state) {
        wasNotified = true;
    }
}
