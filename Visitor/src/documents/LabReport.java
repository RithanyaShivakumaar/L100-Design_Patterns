package documents;

import visitors.IVisitor;

public class LabReport implements IMedicalRecord {
    private final String testName;
    private final double cost;

    public LabReport(String testName, double cost) {
        this.testName = testName;
        this.cost = cost;
    }

    public String getTestName() { return testName; }
    public double getCost() { return cost; }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this); // Implements double dispatch
    }
}