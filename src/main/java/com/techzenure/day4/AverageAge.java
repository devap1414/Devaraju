/**
 * program to find Average Age of Employees
 * @author Devaraju
 * @since 26th July 2023
 */


package com.techzenure.day4;

import java.util.Scanner;

public class AverageAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total no of Employess: ");
		int totalEmployees = sc.nextInt();
		
		if (totalEmployees >= 2) {
			System.out.println("Enter the age "+totalEmployees+" Employees:");
			int [] ages = new int[totalEmployees];
			float sum = 0;
			boolean flag = false;
			
			for (int i = 0; i < totalEmployees; i++) {
				int age = sc.nextInt();
				sum = sum + age;
				ages[i] = age;
				
				if (age < 28) {
					flag = true;
				}
			}
			
			if (!flag) {
				float average = sum/totalEmployees;
				System.out.printf("Average: %.2f",average);
			}
			else {
				System.err.println("Invalid Age Encountered");
			}
			
		}else {
			System.err.println("Enter a valid Employee count");
		}
		sc.close();
	}

}
