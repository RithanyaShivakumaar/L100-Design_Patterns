package documents;

import visitors.IVisitor;

public class Prescription implements IMedicalRecord {
    private final String medication;
    private final double medicationCost;

    public Prescription(String medication, double medicationCost) {
        this.medication = medication;
        this.medicationCost = medicationCost;
    }

    public String getMedication() { return medication; }
    public double getMedicationCost() { return medicationCost; }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}