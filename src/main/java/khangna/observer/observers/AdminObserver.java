package khangna.observer.observers;

import khangna.observer.Observer;
import khangna.observer.entity.Apartment;

public class AdminObserver implements Observer {
    @Override
    public void update(Apartment apartment) {
        System.out.println("Admin got notification: User pay apartment with id " + apartment.getId());
    }
}
