package quiz;

import subscribers.Observer;
import subscribers.Subject;
import java.util.ArrayList;
import java.util.List;

public class Quiz implements Subject {
    private List<Observer> students = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        students.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        students.remove(o);
    }

    @Override
    public void notifyObservers(String question) {
        for (Observer student : students) {
            student.update(question);
        }
    }

    // Add a new question and notify all students
    public void addQuestion(String question) {
        System.out.println("\n[Quiz Master] New Question: " + question);
        notifyObservers(question);
    }
}
