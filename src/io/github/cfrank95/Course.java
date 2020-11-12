package io.github.cfrank95;

import java.util.ArrayList;

public class Course {

    int courseId;
    String courseName;
    ArrayList<Student> students = new ArrayList<>();
    int sizeLimit;

    // Constructor
    Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getters
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Student> getStudent() {
        return students;
    }

    // Setters
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setSizeLimit(int sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    // Student Interactions
    public int addStudent(Student std) {
        if (students.size() < sizeLimit) {
            students.add(std);
            return 1;
        } else {
            System.out.println("Unable to enroll student: " + std.studentName + " (" + std.studentId + ")"
            + "\n\t in course: " + courseName + " (" + courseId + ")\n");
            return -1;
        }
    }

}
