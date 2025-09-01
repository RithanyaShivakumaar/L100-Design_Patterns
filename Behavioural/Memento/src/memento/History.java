package memento;

import java.util.Stack;

public class History {
    private Stack<Memento> undoStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();

    public void save(Memento memento) {
        undoStack.push(memento);
        redoStack.clear(); // once new action happens, redo history resets
    }

    public Memento undo() {
        if (!undoStack.isEmpty()) {
            Memento current = undoStack.pop();
            redoStack.push(current);
            return undoStack.isEmpty() ? new Memento("") : undoStack.peek();
        }
        return new Memento(""); // default empty state
    }

    public Memento redo() {
        if (!redoStack.isEmpty()) {
            Memento redoState = redoStack.pop();
            undoStack.push(redoState);
            return redoState;
        }
        return null;
    }
}
