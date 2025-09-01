import java.util.Arrays;
import interfaces.ContentService;
import proxy.ContentProxy;
import model.User;

public class ProxyLessonDemo {
    public static void main(String[] args) {
        User teacher = new User("Alice", "TEACHER", Arrays.asList());
        User student = new User("Bob", "STUDENT", Arrays.asList("L1", "L3"));

        ContentService teacherAccess = new ContentProxy(teacher);
        ContentService studentAccess = new ContentProxy(student);

        try {
            System.out.println("--- Teacher Access ---");
            teacherAccess.viewLesson("L2");

            System.out.println("--- Student Access to Enrolled ---");
            studentAccess.viewLesson("L3");

            System.out.println("--- Student Access to Unenrolled ---");
            studentAccess.viewLesson("L5");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}