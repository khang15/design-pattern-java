package khangna.observer.observers;

import khangna.observer.Observer;
import khangna.observer.entity.Apartment;
import khangna.observer.entity.Building;
import khangna.observer.entity.Project;

public class BuildingObserver implements Observer {
    @Override
    public void update(Apartment apartment) {
        Building building = apartment.getBuilding();
        building.setTotalApartment(building.getTotalApartment() - 1);
        System.out.println("Total apartment of this building: " + building.getTotalApartment());
    }
}
