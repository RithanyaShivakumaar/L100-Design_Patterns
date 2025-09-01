
package composite;

import java.util.ArrayList;
import java.util.List;
import component.Employee;

public class Manager implements Employee {
    private String name;
    private String role;
    private int salary;
    private List<Employee> team = new ArrayList<>();

    public Manager(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void add(Employee e) {
        team.add(e);
    }

    public void remove(Employee e) {
        team.remove(e);
    }

    public void showDetails(String indent) {
        System.out.println(indent + name + " - " + role + " ($" + salary + ")");
        for (Employee e : team) {
            e.showDetails(indent + "  ");
        }
    }

    public int getAnnualCost() {
        int total = salary;
        for (Employee e : team) {
            total += e.getAnnualCost();
        }
        return total;
    }
}