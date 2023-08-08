/**
 * program to Display the Student Details
 * @author Devaraju
 * @since 26th July 2023
 */

package com.techzenure.day5;

import java.util.Scanner;

public class GetStudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Students's Id:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Students' Name:");
        String name = scanner.next();

        System.out.print("Enter Students' Address:");
        String address = scanner.next();

        boolean isFromNIT = false;
        String collageName = "";

        while (true) {
            System.out.print("Whether the student is from NIT(Yes/No):");
            String input = scanner.next();

            if (input.toLowerCase().equals("yes")) {
                isFromNIT = true;
                break;
            } else if (input.toLowerCase().equals("no")) {
                System.out.print("Enter the collage name:");
                collageName = scanner.next();

                break;
            }else {
            	System.out.println("Wrong Input");
            	System.out.println();
            }
        }
        scanner.close();

        Student student;

        if (isFromNIT) {
            student = new Student(id, name, address);
        } else {
            student = new Student(id, name, address, collageName);
        }
        
               
 		System.out.println();
        System.out.println("Student id: " + student.getStudentId());
        System.out.println("Student name: " + student.getStudentName());
        System.out.println("Address: " + student.getStudentAddress());
      	System.out.println("Collage name :" + student.getCollegeName());
 
        
    }
}