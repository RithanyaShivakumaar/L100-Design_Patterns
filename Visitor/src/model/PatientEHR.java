package model;

import documents.IMedicalRecord;
import visitors.IVisitor;
import java.util.ArrayList;
import java.util.List;

// The Object Structure: Holds the elements and provides a way to iterate them.
public class PatientEHR {
    private final List<IMedicalRecord> records = new ArrayList<>();

    public void addRecord(IMedicalRecord record) {
        records.add(record);
    }

    // This is the key method that allows a visitor to process all records.
    public void processWith(IVisitor visitor) {
        for (IMedicalRecord record : records) {
            record.accept(visitor);
        }
    }
}