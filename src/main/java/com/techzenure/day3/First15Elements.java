package com.techzenure.day3;

import java.util.Scanner;

public class First15Elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstEle = 1;
		
		for (int i = 1; i <= 15; i++) {
			System.out.print(firstEle+" ");
			firstEle = firstEle + 3;
			
		}
		sc.close();
	}

}
