
import handler.*;
import model.Document;

public class main {
    public static void main(String[] args) {
        // Create the chain: Reviewer -> Editor -> Publisher
        ReviewHandler reviewer = new Reviewer();
        ReviewHandler editor = new Editor();
        ReviewHandler publisher = new Publisher();

        reviewer.setNextHandler(editor);
        editor.setNextHandler(publisher);

        // Create a document
        Document doc = new Document("This is a sample article about design patterns.");

        System.out.println("\n--- Content Review Workflow ---");
        reviewer.handle(doc);

        System.out.println("\nFinal Status:");
        System.out.println("Reviewed: " + doc.isReviewed());
        System.out.println("Edited: " + doc.isEdited());
        System.out.println("Published: " + doc.isPublished());
    }
}
