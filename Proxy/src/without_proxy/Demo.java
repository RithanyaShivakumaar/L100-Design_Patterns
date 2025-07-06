package without_proxy;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        User teacher = new User("Alice", "TEACHER", Arrays.asList());
        User student = new User("Bob", "STUDENT", Arrays.asList("L1", "L3"));

        ContentService contentService = new ContentService();

        try {
            System.out.println("--- Teacher Access ---");
            contentService.viewLesson(teacher, "L2");

            System.out.println("--- Student Access to Enrolled ---");
            contentService.viewLesson(student, "L3");

            System.out.println("--- Student Access to Unenrolled ---");
            contentService.viewLesson(student, "L5");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
