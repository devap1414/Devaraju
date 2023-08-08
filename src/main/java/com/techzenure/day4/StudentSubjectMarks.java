/**
 * program to Generate Student Rank Card
 * @author Devaraju
 * @since 26th July 2023
 */

package com.techzenure.day4;

import java.util.Scanner;

public class StudentSubjectMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student Name: ");
		String studentName = sc.nextLine();
		
		System.out.print("Enter No of Subjects: ");
		int noOfSubjects = sc.nextInt();
		
		int []marks = new int[noOfSubjects];
		float total = 0;
		//float average = 0;
		
		for (int i = 0; i < noOfSubjects; i++) {
			System.out.print("Enter marks for Subject-"+(i+1)+" : ");
			int mark = sc.nextInt();
			total = total + mark;
			marks[i] = mark;
		}
		
		float average = (total/marks.length);
		
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("\t\tREPORT CARD");
		System.out.println("Name: "+studentName.toUpperCase());
		System.out.println("----------------------------------------------");
		System.out.println("SUBJECT\t\t\tMARK");
		System.out.println("----------------------------------------------");
		for (int j=0; j < noOfSubjects; j++) {
			System.out.printf("Subject-%d\t\t %d\n",(j+1),marks[j]);
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.printf("TOTAL:%d\t AVERAGE:%.2f\n",(int)total,average);
		System.out.println("----------------------------------------------");
		sc.close();

	}

}
