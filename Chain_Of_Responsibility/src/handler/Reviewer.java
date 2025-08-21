package handler;

import model.Document;

public class Reviewer extends ReviewHandler {
    @Override
    public void handle(Document document) {
        if (!document.isReviewed()) {
            System.out.println("[Reviewer] Reviewing the document...");
            document.setReviewed(true);
        }
        if (nextHandler != null) {
            nextHandler.handle(document);
        }
    }
}
