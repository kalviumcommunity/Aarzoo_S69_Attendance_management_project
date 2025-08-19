package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Attendance Management Project: Part-02 ===");

        // 1) Create Students (array)
        Student[] students = new Student[3];
        students[0] = new Student(101, "Aarju Hingorani", "aarju@example.com");
        students[1] = new Student(102, "John Doe", "john@example.com");
        students[2] = new Student(103, "Jane Smith", "jane@example.com");

        // 2) Create Courses (array)
        Course[] courses = new Course[2];
        courses[0] = new Course("CS101", "Intro to OOP", 2);
        courses[1] = new Course("MA201", "Discrete Math", 1);

        // 3) Display details
        System.out.println("\n-- Students --");
        for (Student s : students) {
            System.out.println(s); // uses Student.toString()
        }

        System.out.println("\n-- Courses (before allocation) --");
        for (Course c : courses) {
            System.out.println(c); // uses Course.toString()
        }

        // 4) Demonstrate simple core behavior (allocate seats)
        System.out.println("\nAllocating seats for a few enrollments...");
        if (courses[0].hasSeat()) courses[0].allocateSeat();
        if (courses[0].hasSeat()) courses[0].allocateSeat();
        if (courses[1].hasSeat()) courses[1].allocateSeat();

        System.out.println("\n-- Courses (after allocation) --");
        for (Course c : courses) {
            System.out.println(c);
        }

        System.out.println("\n=== End (Part-02) ===");
    }
}
