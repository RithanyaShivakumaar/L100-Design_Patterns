package visitors;

import documents.*;

// The Visitor Interface: Overloaded methods for each element type.
public interface IVisitor {
    void visit(LabReport report);
    void visit(Prescription prescription);
}