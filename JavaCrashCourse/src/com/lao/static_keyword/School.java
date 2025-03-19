package com.lao.static_keyword;


public class School {
    static int totalStudents = 0; // static variable

    String studentName;

//    public String getStudentName() {
//        return studentName;
//    }
//
//    public static int getTotalStudents() {
//        return totalStudents;
//    }

    public static void enrollStudent() {
//        School student = new School();
//        student.studentName = name;
        totalStudents++; // Increment the count each time a student is enrolled
        System.out.println(totalStudents);
    }

    public static void main(String[] args) {
        enrollStudent();
        enrollStudent();
        enrollStudent();

        System.out.println("Total students enrolled: " + totalStudents);
    }
}
