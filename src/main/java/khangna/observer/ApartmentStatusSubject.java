package khangna.observer;

public interface ApartmentStatusSubject {
    void attach(Observer observer);
    void detach(Observer observer);

    void notifyAllObserver();
}
