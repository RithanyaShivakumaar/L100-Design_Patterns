package without_proxy;
public class ContentService {
    public void viewLesson(User user, String lessonId) throws Exception {
        System.out.println("User: " + user.getName() + " | Role: " + user.getRole());

        if (user.getRole().equals("TEACHER")) {
            System.out.println("Viewing lesson: " + lessonId);
        } else if (user.getRole().equals("STUDENT")) {
            if (user.isEnrolled(lessonId)) {
                System.out.println("Viewing lesson: " + lessonId);
            } else {
                throw new Exception("Access Denied: Not enrolled in " + lessonId);
            }
        } else {
            throw new Exception("Invalid user role");
        }
    }
}
