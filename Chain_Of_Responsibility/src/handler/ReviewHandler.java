package handler;

import model.Document;

public abstract class ReviewHandler {
    protected ReviewHandler nextHandler;

    public void setNextHandler(ReviewHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handle(Document document);
}
