import documents.*;
import model.PatientEHR;
import visitors.*;

// The Client: Sets up the object structure and initiates the visitor operations.
public class Main {
    public static void main(String[] args) {
        // 1. Setup the patient's record with various documents
        PatientEHR ehr = new PatientEHR();
        ehr.addRecord(new LabReport("Blood Test", 3500.00));
        ehr.addRecord(new Prescription("Paracetamol", 250.00));

        System.out.println("Patient EHR setup complete.\n");

        // OPERATION 1: Generate a total bill 
        System.out.println("--- Running Billing Operation ---");
        BillingVisitor billingVisitor = new BillingVisitor();
        ehr.processWith(billingVisitor);
        System.out.printf("Total Bill Generated: ₹%.2f\n\n", billingVisitor.getTotalBill());

        // OPERATION 2: Generate a medical history summary 
        System.out.println("--- Running History Summary Operation ---");
        HistorySummaryVisitor summaryVisitor = new HistorySummaryVisitor();
        ehr.processWith(summaryVisitor);
        System.out.println("Medical History Summary Generated:\n" + summaryVisitor.getSummary());
    }
}