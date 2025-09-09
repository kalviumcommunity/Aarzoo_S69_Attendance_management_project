package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");

        Course c1 = new Course(101, "Mathematics");
        Course c2 = new Course(102, "Science");

        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        AttendanceRecord ar1 = new AttendanceRecord(s1.getStudentId(), c1.getCourseId(), "Present");
        AttendanceRecord ar2 = new AttendanceRecord(s2.getStudentId(), c2.getCourseId(), "Absent");
        AttendanceRecord ar3 = new AttendanceRecord(s1.getStudentId(), c2.getCourseId(), "Late"); // invalid

        attendanceLog.add(ar1);
        attendanceLog.add(ar2);
        attendanceLog.add(ar3);

        for (AttendanceRecord ar : attendanceLog) {
            ar.displayRecord();
        }
    }
}
