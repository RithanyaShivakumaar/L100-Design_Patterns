import memento.History;
import originator.Editor;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        // Type something
        editor.type("Hello ");
        history.save(editor.save());

        editor.type("World! ");
        history.save(editor.save());

        editor.type("This is a test.");
        history.save(editor.save());

        System.out.println("Current Content: " + editor.getContent());

        // Undo twice
        editor.restore(history.undo());
        System.out.println("After Undo 1: " + editor.getContent());

        editor.restore(history.undo());
        System.out.println("After Undo 2: " + editor.getContent());

        // Redo once
        editor.restore(history.redo());
        System.out.println("After Redo: " + editor.getContent());
    }
}
