package com.techzenure.day6;

import java.util.Scanner;


public class Main {
    public static Hosteller getHostellerDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Details:");
        System.out.println();
        System.out.print("Student Id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Student Name: ");
        String name = sc.next().toUpperCase();

        System.out.print("Department Id: ");
        int department = sc.nextInt();
        sc.nextLine();

        System.out.print("Gender[M/F]: ");
        String gender = sc.next().toLowerCase();
        
        if (gender.equals("m")) {
        	gender = "Male";
        }else {
        	gender = "Female";
        }

        System.out.print("Phone Number: ");
        String phNo = sc.next();

        System.out.print("Hostel Name: ");
        String hostel = sc.next().toUpperCase();

        System.out.print("Room Number: ");
        int room = sc.nextInt();
        sc.nextLine();
        
        Hosteller hosteller = new Hosteller();
        hosteller.setStudentId(id);
        hosteller.setName(name);
        hosteller.setDepartmentId(department);
        hosteller.setGender(gender);
        hosteller.setPhone(phNo);
        hosteller.setHostelName(hostel);
        hosteller.setRoomNumber(room);

        return hosteller;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hosteller hosteller = getHostellerDetails();

        System.out.print("Modify Room Number(Y/N): ");
        boolean updateRoom = sc.next().toUpperCase().equals("Y");

        if (updateRoom) {
            System.out.print("New Room Number: ");
            int room = sc.nextInt();
            hosteller.setRoomNumber(room);
        }

        System.out.print("Modify Phone Number(Y/N): ");
        boolean updatePhone = sc.next().toUpperCase().equals("Y");

        if (updatePhone) {
            System.out.print("New Phone Number: ");
            String phNo = sc.next();
            hosteller.setPhone(phNo);
        }
        sc.close();
        
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("The Student Details:");
        System.out.println("-----------------------------");
        System.out.println("Student ID: " + hosteller.getStudentId());
        System.out.println("Student NAme: " + hosteller.getName());
        System.out.println("Department ID: " + hosteller.getDepartmentId());
        System.out.println("Student Gender: " + hosteller.getGender());
        System.out.println("Student Phone No: " + hosteller.getPhone());
        System.out.println("Hostel Name: " + hosteller.getHostelName());
        System.out.println("Room No: " + hosteller.getRoomNumber());
        System.out.println("-----------------------------");
        
    }
    //scanner.close();
}