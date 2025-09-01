package quiz;

import subscribers.Observer;

public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String question) {
        System.out.println(name + " received the question: " + question);
    }
}
