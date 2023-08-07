package com.techzenure.day5;

public class Account {
	private long acno;
	private String name;
	private float bal;
	
	public Account(long acno, String name, float bal) {		
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	
	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
	}

	public void deposit(float amt) {
		this.bal += amt;
		System.out.println("Rs."+amt+" Credited | Balance: " + this.bal);
	}
	
	public void withdraw(float amt) {
		if(this.bal >= amt) {
			this.bal = this.bal - amt;
			System.out.println("Rs."+amt+" Debited | Balance: " + this.bal);
		}else {
			System.err.println("ERROR: INSUFFICIENT BALANCE");
		}
	}
	
	public void getBalance() {
		System.out.println("A/C NO: " + this.acno + " | NAME: " + this.name + " | BALANCE: " + this.bal);
	}
}
