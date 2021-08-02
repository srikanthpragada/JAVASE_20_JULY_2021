package oop;

public class Account {
	// Instance variables
	private int acno;
	private String aname;
	private double balance;
	
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
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}
}
