package khangna.observer.entity;

public class Apartment {
    private int id;

    private Project project;

    private Building building;

    public Apartment(int id, Project project, Building building) {
        this.id = id;
        this.project = project;
        this.building = building;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }


    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                '}';
    }
}
