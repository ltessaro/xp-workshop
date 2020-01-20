import doubles.observer.ObserverDummy;
import doubles.observer.ObserverSpy;
import observer.Observer;
import observer.SubjectObserver;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ObserverSubjectTest {
    @Test
    public void addObserverToSubject() {
        final SubjectObserver subjectObserver = new SubjectObserver();
        final Observer observer = new ObserverDummy();

        subjectObserver.add(observer);

        assertEquals(1, subjectObserver.size());
    }

    @Test
    public void removeObserverFromSubject() {
        final SubjectObserver subjectObserver = new SubjectObserver();
        final Observer observer = new ObserverDummy();

        subjectObserver.add(observer);
        assertEquals(1, subjectObserver.size());

        subjectObserver.remove(observer);
        assertEquals(0, subjectObserver.size());
    }

    @Test
    public void notifyObserversOnSubject() {
        final SubjectObserver subjectObserver = new SubjectObserver();
        final ObserverSpy observer = new ObserverSpy();

        subjectObserver.add(observer);

        subjectObserver.notify("on");

        assertTrue(observer.wasNotified);
    }
}
