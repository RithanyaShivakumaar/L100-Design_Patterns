package visitors;

import documents.*;

// Another Concrete Visitor: Implements a different operation (Summarizing).
public class HistorySummaryVisitor implements IVisitor {
    private final StringBuilder summary = new StringBuilder();

    @Override
    public void visit(LabReport report) {
        summary.append("- Lab Test: ").append(report.getTestName()).append("\n");
    }

    @Override
    public void visit(Prescription prescription) {
        summary.append("- Prescription: ").append(prescription.getMedication()).append("\n");
    }

    public String getSummary() {
        return summary.toString();
    }
}