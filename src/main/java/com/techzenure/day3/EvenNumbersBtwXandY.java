/**
 * program to find Even Numbers Between X and Y
 * @author Devaraju
 * @since 26th July 2023
 */


package com.techzenure.day3;

import java.util.Scanner;

public class EvenNumbersBtwXandY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First no: ");
		int firstNum = sc.nextInt();
		
		System.out.print("Enter the Second no: ");
		int secondNum = sc.nextInt();
		
		
		if (firstNum > secondNum) {
			System.err.println("Invalid Input:: second number should be greater than first number");
		}else {
			for (int i = firstNum+1; i < secondNum ; ++i) {
				if (i%2 == 0) {
					System.out.print(i + " ");
				}
			}
		}
		
		sc.close();
	}

}
