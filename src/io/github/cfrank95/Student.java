package io.github.cfrank95;

import java.util.ArrayList;

public class Student {

    int studentId;
    String studentName;
    ArrayList<Course> courses = new ArrayList<>();

    // Constructor
    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Student Interactions
    public void enroll(Course course) {
        if(course.sizeLimit > course.students.size())
            courses.add(course);
    }
}
