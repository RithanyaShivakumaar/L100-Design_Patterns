package model;

import java.util.List;

public class User {
    private String name;
    private String role; // "STUDENT" or "TEACHER"
    private List<String> enrolledLessons;

    public User(String name, String role, List<String> enrolledLessons) {
        this.name = name;
        this.role = role;
        this.enrolledLessons = enrolledLessons;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public boolean isEnrolled(String lessonId) {
        return enrolledLessons.contains(lessonId);
    }
}