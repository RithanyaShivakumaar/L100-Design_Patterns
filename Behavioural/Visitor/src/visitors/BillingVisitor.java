package visitors;

import documents.*;

// A Concrete Visitor: Implements an operation (Billing).
public class BillingVisitor implements IVisitor {
    private double totalBill = 0.0;

    @Override
    public void visit(LabReport report) {
        System.out.println("Billing: Adding cost for Lab Report '" + report.getTestName() + "'.");
        totalBill += report.getCost();
    }

    @Override
    public void visit(Prescription prescription) {
        System.out.println("Billing: Adding cost for Medication '" + prescription.getMedication() + "'.");
        totalBill += prescription.getMedicationCost();
    }

    public double getTotalBill() {
        return totalBill;
    }
}