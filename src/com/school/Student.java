package com.school;

/**
 * Represents a student in the attendance system.
 */
public class Student {
    private final int id;
    private final String name;
    private final String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters (read-only access to fields)
    public int getId()    { return id; }
    public String getName(){ return name; }
    public String getEmail(){ return email; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}
