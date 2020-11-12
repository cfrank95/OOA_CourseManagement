package io.github.cfrank95;

import java.util.ArrayList;

public class CourseManagement {

    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();


    /**
     * Performs some test operations
     */
    public void mainOperation() {
        // Test Data

        // Generate Courses
        courses.add(new Course(80601, "COP 3003"));
        courses.get(0).sizeLimit = 5;
        courses.add(new Course(80593, "CEN 3031"));
        courses.get(1).sizeLimit = 5;

        // Generate students & enroll
        students.add(new Student(805184172, "Jonathan Little"));
        students.add(new Student(805104177, "Marquis Finch"));
        students.add(new Student(805104173, "Jessica Fisk"));
        students.add(new Student(805184174, "Joseph Zimmer"));
        students.add(new Student(805104175, "Tilly Dilly"));
        students.add(new Student(805184176, "Richard Moore"));

        // Add every student to every course
        for (int i = 0; i < students.size(); i++) {

            for (int j = 0; j < courses.size(); j++) {

                students.get(i).enroll(courses.get(j));
                courses.get(j).addStudent(students.get(i));
            }
        }

        displayCourses();
        displayStudents();

    }

    /**
     * Displays on the screen for each course: course ID and name,
     * and list of students' names registered for the course
     */
    public void displayCourses() {
        for (int i = 0; i < courses.size(); i++) {
            String name = courses.get(i).courseName;
            int id = courses.get(i).courseId;

            System.out.println(name + ": " + id);

            for (int j = 0; j < courses.get(i).students.size(); j++) {
                System.out.println("\t" + courses.get(i).students.get(j).studentName);
            }
        }
        System.out.println();
    }

    /**
     * Displays on screen for each student: student ID and name, and
     * list of courses' ID and name that the student is enrolled in
     */
    public void displayStudents() {
        for (int i = 0; i < students.size(); i++) {
            String name = students.get(i).studentName;
            int id = students.get(i).studentId;

            System.out.println(name + ": " + id);

            for (int j = 0; j < students.get(i).courses.size(); j++) {
                System.out.println("\t" + students.get(i).courses.get(j).courseName + ": " + students.get(i).courses.get(j).courseId);
            }
        }
        System.out.println();
    }
}
