package com.techzenure.day1and2;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pizzaCost = 100;
		int puffCost = 20;
		int coolDrinkCost = 10;
		
		System.out.print("Enter the no of Pizzas bought: ");
		int noOfPizzas = sc.nextInt();
		
		System.out.print("Enter the no of Puffs bought: ");
		int noOfPuffs = sc.nextInt();
		
		System.out.print("Enter the no of Cool Drinks bought: ");
		int noOfCoolDrinks = sc.nextInt();
		
		System.out.println();
		
		int totalCostOfPizzas = noOfPizzas * pizzaCost;
		int totalCostOfPuffs = noOfPuffs * puffCost;
		int totalCostOfCoolDrinks = noOfCoolDrinks * coolDrinkCost;
		
		System.out.println("\t\tBill Details");
		
		System.out.printf("No Of Pizzas      : %d \t Cost: %d \n", noOfPizzas, totalCostOfPizzas);
		System.out.printf("No Of Puffs       : %d \t Cost: %d \n",noOfPuffs, totalCostOfPuffs);
		System.out.printf("No Of Cool Drinks : %d \t Cost: %d \n", noOfCoolDrinks, totalCostOfCoolDrinks);
		System.out.println();
		
		float totalPrice = totalCostOfPizzas + totalCostOfPuffs + totalCostOfCoolDrinks;
		System.out.printf("Total Price = %.2f\n", totalPrice);
		System.out.println("ENJOY THE SHOW!!!");
		sc.close();

	}

}
