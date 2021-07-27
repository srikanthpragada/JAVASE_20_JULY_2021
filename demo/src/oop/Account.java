package oop;

public class Account {
	// Instance variables
	private int acno;
	private String aname;
	private double balance;
	
    // Methods
	public void open(int no, String name) {
		acno = no;
		aname = name;
		balance = 0;
	}

	public void print() {
		System.out.println(acno);
		System.out.println(aname);
		System.out.println(balance);
	}

}
