package com.techzenure.day5;

public class CurrentAccount extends Account {
	int freeTrans = 3;
	int transCount = 0;
	int transRate = 100;
	
	public CurrentAccount(long acno, String name, float bal) {
		super(acno, name, bal);
		
	}

	@Override
	public void deposit(float amt) {
		transCount++;
		super.deposit(amt);
	}

	@Override
	public void withdraw(float amt) {
		transCount++;
		super.withdraw(amt);
	}

	@Override
	public void getBalance() {
		transCount++;
		super.getBalance();
	}
	
	public void serviceCharge() {
		int serviceChargeCounts = transCount - freeTrans;
		if (serviceChargeCounts > 0) {
			transCount = 0;
			float amt = serviceChargeCounts * transRate;
			super.withdraw(amt);
		}else {
			System.out.println("No Service CHarge At This Time As You Have Done Only " + transCount + "/" + freeTrans);
		}
	}

}
