package com.school;

/**
 * Represents a course in the attendance system.
 */
public class Course {
    private final String code;
    private final String title;
    private int capacity; // simple field to show a core property

    public Course(String code, String title, int capacity) {
        this.code = code;
        this.title = title;
        this.capacity = capacity;
    }

    // Getters
    public String getCode()   { return code; }
    public String getTitle()  { return title; }
    public int getCapacity()  { return capacity; }

    // Simple behavior for demonstration
    public boolean hasSeat() { return capacity > 0; }
    public void allocateSeat() {
        if (capacity > 0) capacity--;
    }

    @Override
    public String toString() {
        return "Course{code='" + code + "', title='" + title + "', capacity=" + capacity + "}";
    }
}
