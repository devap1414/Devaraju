package com.techzenure.day3;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the No Of Tickets: ");
		double noOfTickets = sc.nextInt();
		
		
		//System.out.println(circle == king);
		//System.out.println("K" == "K");
		
		double ticketsPrice;
		
		if (noOfTickets < 5) {
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		}else {
			
			System.out.print("Do you want Refreshment: ");
			String refreshment = sc.next().toUpperCase();
			
			System.out.print("Do you have coupon code: ");
			String coupon = sc.next().toUpperCase();
			
			System.out.print("Enter the Circle: ");
			String circle = sc.next().toUpperCase();
			
			if ((circle.equals("K")) || (circle.equals("Q"))){
				if (noOfTickets > 20) {
				    //System.out.println("ENTERED");
					if (circle.equals("K")) {
						//System.out.println(circle);
						ticketsPrice = noOfTickets * 75.00;
						ticketsPrice =ticketsPrice - (ticketsPrice * 10 / 100);
						if (coupon.equals("Y")) {
							ticketsPrice =ticketsPrice - (ticketsPrice * 2 / 100);
						}
						if (refreshment.equals("Y")) {
							ticketsPrice = ticketsPrice + (50 * noOfTickets);
						}
					}else {
						ticketsPrice = noOfTickets * 150;
						ticketsPrice = ticketsPrice * (10/100);
						if (coupon.equals("Y")) {
							ticketsPrice = ticketsPrice - (ticketsPrice * (2/100));
						}
						if (refreshment.equals("Y")) {
							ticketsPrice = ticketsPrice + (50 * noOfTickets);
						}
					}
					System.out.println(ticketsPrice);
				}else {
					if (circle.equals("K")) {
						ticketsPrice = noOfTickets * 75;
						if (coupon.equals("Y")) {
							ticketsPrice =ticketsPrice -(ticketsPrice * (2/100));
						}
						if (refreshment.equals("Y")) {
							ticketsPrice = ticketsPrice + (50 * noOfTickets);
						}
						
					}else {
						ticketsPrice = noOfTickets * 150;
						if (coupon.equals("Y")) {
							ticketsPrice = ticketsPrice + (ticketsPrice * (2/100));
						}
						if (refreshment.equals("Y")) {
							ticketsPrice = ticketsPrice + (50 * noOfTickets);
						}
					}
					System.out.println(ticketsPrice);
				}
			}else {
				System.out.println("Invalid Input");
			}
			
		}
		
		
		sc.close();
	}

}
