

import component.Employee;
import composite.Manager;
import leaf.Staff;

public class CompanyStructure {
    public static void main(String[] args) {
        // Individual Contributors
        Employee charlie = new Staff("Charlie", "Backend Developer", 80000);
        Employee emily = new Staff("Emily", "Frontend Lead", 100000);
        Employee eva = new Staff("Eva", "HR Executive", 60000);

        // Leads & Managers
        Manager raj = new Manager("Raj", "Backend Lead", 110000);
        raj.add(charlie);

        Manager dave = new Manager("Dave", "Engineering Head", 150000);
        dave.add(emily);
        dave.add(raj);

        Manager fiona = new Manager("Fiona", "HR Head", 120000);
        fiona.add(eva);

        // CEO
        Manager grace = new Manager("Grace", "CEO", 200000);
        grace.add(dave);
        grace.add(fiona);

        // Display
        grace.showDetails("");
        System.out.println("\n\n Total Company Cost: $" + grace.getAnnualCost());
    }
}