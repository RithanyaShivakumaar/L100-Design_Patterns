package leaf;

import component.Employee;

public class Staff implements Employee {
    private String name;
    private String role;
    private int salary;

    public Staff(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void showDetails(String indent) {
        System.out.println(indent + name + " - " + role + " ($" + salary + ")");
    }

    public int getAnnualCost() {
        return salary;
    }
}