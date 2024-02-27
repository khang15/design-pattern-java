package khangna.observer.observers;

import khangna.observer.Observer;
import khangna.observer.entity.Apartment;
import khangna.observer.entity.Project;

public class ProjectObserver implements Observer {
    @Override
    public void update(Apartment apartment) {
        Project project = apartment.getProject();
        project.setTotalApartment(project.getTotalApartment() - 1);
        System.out.println("Total apartment of this project: " + project.getTotalApartment());
    }
}
