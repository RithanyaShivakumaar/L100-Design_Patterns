package model;

public class Document {
    private String content;
    private boolean reviewed;
    private boolean edited;
    private boolean published;

    public Document(String content) {
        this.content = content;
        this.reviewed = false;
        this.edited = false;
        this.published = false;
    }

    public String getContent() {
        return content;
    }

    public boolean isReviewed() {
        return reviewed;
    }

    public void setReviewed(boolean reviewed) {
        this.reviewed = reviewed;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }
}
