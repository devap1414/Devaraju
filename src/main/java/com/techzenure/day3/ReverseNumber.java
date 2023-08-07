package com.techzenure.day3;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Num: ");
		int num = sc.nextInt();
		
		int digit;
		String reverseNum = "";
		while (num > 0) {
			digit = num%10;
			
			reverseNum = reverseNum + digit;
			
			num = num / 10;
		}
		
		System.out.printf("Reversed Number is: " + reverseNum);
		
		sc.close();
	}

}
