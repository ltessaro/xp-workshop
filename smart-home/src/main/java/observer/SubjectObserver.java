package observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectObserver {
    List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public int size() {
        return observers.size();
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notify(String state) {
        observers.stream().forEach(o -> o.update(state));
    }
}
