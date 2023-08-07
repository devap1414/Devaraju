package com.techzenure.day5;

public class SavingsAccount extends Account {
	float roi;
	
	public SavingsAccount(long acno, String name, float bal, float roi) {
		super(acno, name, bal);
		this.roi = roi;
	}
	
	public void calculateIntrest() {
		float intrest = roi * this.getBal() / 100;
		super.deposit(intrest);
	}
}
