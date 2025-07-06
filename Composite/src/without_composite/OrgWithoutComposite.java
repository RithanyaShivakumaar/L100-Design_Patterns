package without_composite;
public class OrgWithoutComposite {
    public static void main(String[] args) {
        // Staff
        Staff charlie = new Staff("Charlie", "Backend Developer", 80000);
        Staff emily = new Staff("Emily", "Frontend Lead", 100000);
        Staff eva = new Staff("Eva", "HR Executive", 60000);

        // Managers
        Manager raj = new Manager("Raj", "Backend Lead", 110000);
        raj.addStaff(charlie);

        Manager dave = new Manager("Dave", "Engineering Head", 150000);
        dave.addStaff(emily);
        dave.addManager(raj);

        Manager fiona = new Manager("Fiona", "HR Head", 120000);
        fiona.addStaff(eva);

        Manager grace = new Manager("Grace", "CEO", 200000);
        grace.addManager(dave);
        grace.addManager(fiona);

        grace.showDetails("");
        System.out.println("\n\n Total Company Cost: $" + grace.getTotalCost());
    }
}
