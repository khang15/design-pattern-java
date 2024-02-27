package khangna.observer;

import khangna.observer.entity.Apartment;

import java.util.ArrayList;
import java.util.List;

public class ApartmentService implements ApartmentStatusSubject {
    private Apartment apartment;

    private List<Observer> observers = new ArrayList<>();

    public ApartmentService(Apartment apartment) {
        this.apartment = apartment;
    }

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(apartment);
        }
    }

    public void userPay() {
        System.out.println("User pay apartment with id: " + apartment.getId());
        this.notifyAllObserver();
    }
}
