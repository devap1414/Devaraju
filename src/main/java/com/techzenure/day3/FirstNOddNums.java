package com.techzenure.day3;

import java.util.Scanner;

public class FirstNOddNums {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many odd numbers to be generated : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for (int i = 1; i <= 2*num; i++) {
			
			if (i%2 != 0) {
				System.out.print(i + " ");
				count += 1;
				
				if (num == count) {
					break;
				}
			}
		}
		
		sc.close();

	}

}
