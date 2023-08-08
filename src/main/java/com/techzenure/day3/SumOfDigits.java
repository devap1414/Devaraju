/**
 * program to Sum of Digits in Number
 * @author Devaraju
 * @since 26th July 2023
 */


package com.techzenure.day3;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Num: ");
		int num = sc.nextInt();
		int number = num;
		
		int sum = 0;
		int digit = 0;
		
		while (num > 0) {
			digit = num%10;
			
			sum = sum + digit;
			
			num = num / 10;
		}
		
		System.out.printf("Sum of Digits of %d = %d",number,sum);
		
		sc.close();
	}

}
