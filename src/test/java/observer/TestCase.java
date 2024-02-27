package observer;

import khangna.observer.ApartmentService;
import khangna.observer.entity.Apartment;
import khangna.observer.entity.Building;
import khangna.observer.entity.Project;
import khangna.observer.observers.AdminObserver;
import khangna.observer.observers.BuildingObserver;
import khangna.observer.observers.ProjectObserver;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestCase {

    @Test
    public void userPayAnApartment() {

        // Init project with 100 apartments
        // Init builing with 30 aparments
        Project project = new Project(100);
        Building building = new Building(30);

        // Init an apartment is in project and building with id = 1
        Apartment apartment = new Apartment(1, project, building);


        ApartmentService apartmentService = new ApartmentService(apartment);

        apartmentService.attach(new AdminObserver());
        apartmentService.attach(new ProjectObserver());
        apartmentService.attach(new BuildingObserver());

        apartmentService.userPay();
    }
}
