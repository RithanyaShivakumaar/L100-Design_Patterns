
import quiz.Quiz;
import quiz.Student;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        quiz.registerObserver(s1);
        quiz.registerObserver(s2);
        quiz.registerObserver(s3);

        quiz.addQuestion("What is the capital of France?");
        quiz.addQuestion("Solve: 5 * 6 = ?");
        
        // Removing a student
        quiz.removeObserver(s2);
        quiz.addQuestion("Who developed Java?");
    }
}
