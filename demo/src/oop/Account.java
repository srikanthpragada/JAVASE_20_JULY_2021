package oop;

public class Account {
	// Instance variables
	private int acno;
	private String aname;
	private double balance;
	
	// Static variable or class variable 
	private static int minbal = 5000; 
	
    // Constructor
	public Account(int no, String name) {
		acno = no;
		aname = name;
		balance = 0;
	}

	public Account(int no, String name, double bal) {
		acno = no;
		aname = name;
		balance = bal;
	}
	
	public void print() {
		System.out.println(acno);
		System.out.println(aname);
		System.out.println(balance);	 
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(this.balance - Account.minbal >= amount)
		      balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}
	
	public static int getMinBalance() {
		return Account.minbal;
	}
}
