package documents;

import visitors.IVisitor;

public interface IMedicalRecord {
    void accept(IVisitor visitor);
}
