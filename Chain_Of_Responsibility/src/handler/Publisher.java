package handler;

import model.Document;

public class Publisher extends ReviewHandler {
    @Override
    public void handle(Document document) {
        if (document.isReviewed() && document.isEdited() && !document.isPublished()) {
            System.out.println("[Publisher] Publishing the document...");
            document.setPublished(true);
        } else {
            System.out.println("[Publisher] Cannot publish! Document incomplete.");
        }
    }
}
