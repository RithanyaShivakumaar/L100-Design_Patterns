package handler;

import model.Document;

public class Editor extends ReviewHandler {
    @Override
    public void handle(Document document) {
        if (document.isReviewed() && !document.isEdited()) {
            System.out.println("[Editor] Editing the document...");
            document.setEdited(true);
        }
        if (nextHandler != null) {
            nextHandler.handle(document);
        }
    }
}
