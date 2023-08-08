/**
 * program to Display the Student Details
 * @author Devaraju
 * @since 26th July 2023
 */

package com.techzenure.day5;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    public Student(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
        
//        System.out.println();
//        System.out.println("Student id:" + this.studentId);
//        System.out.println("Student name:" + this.studentName);
//        System.out.println("Address:" + this.studentAddress);
//        System.out.println("Collage name:" + this.collegeName);
    }

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
        
//        System.out.println();
//        System.out.println("Student id:" + this.studentId);
//        System.out.println("Student name:" + this.studentName);
//        System.out.println("Address:" + this.studentAddress);
//        System.out.println("Collage name:" + this.collegeName);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }
}