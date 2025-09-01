package proxy;

import interfaces.ContentService;
import service.RealContentService;
import model.User;

public class ContentProxy implements ContentService {
    private RealContentService realService = new RealContentService();
    private User user;

    public ContentProxy(User user) {
        this.user = user;
    }

    public void viewLesson(String lessonId) throws Exception {
        System.out.println("User: " + user.getName() + " | Role: " + user.getRole());

        if (user.getRole().equals("TEACHER")) {
            realService.viewLesson(lessonId);
        } else if (user.getRole().equals("STUDENT")) {
            if (user.isEnrolled(lessonId)) {
                realService.viewLesson(lessonId);
            } else {
                throw new Exception("Access Denied: Not enrolled in " + lessonId);
            }
        } else {
            throw new Exception("Invalid user role");
        }
    }
}