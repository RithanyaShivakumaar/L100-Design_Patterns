package service;

import interfaces.ContentService;

public class RealContentService implements ContentService {
    public void viewLesson(String lessonId) {
        System.out.println("Viewing lesson: " + lessonId);
    }
}