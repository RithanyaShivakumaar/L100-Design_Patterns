package without_composite;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private String name;
    private String role;
    private int salary;
    private List<Manager> subManagers = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();

    public Manager(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void addManager(Manager m) {
        subManagers.add(m);
    }

    public void addStaff(Staff s) {
        staffMembers.add(s);
    }

    public void showDetails(String indent) {
        System.out.println(indent + name + " - " + role + " ($" + salary + ")");
        for (Staff s : staffMembers) {
            s.showDetails(indent + "  ");
        }
        for (Manager m : subManagers) {
            m.showDetails(indent + "  ");
        }
    }

    public int getTotalCost() {
        int total = salary;
        for (Staff s : staffMembers) {
            total += s.getSalary();
        }
        for (Manager m : subManagers) {
            total += m.getTotalCost();
        }
        return total;
    }
}
