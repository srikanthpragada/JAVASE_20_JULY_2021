package oop;

public class TestAccount {

	public static void main(String[] args) {
		 Account a;  // object reference 
		 
		 a = new Account();  // Object 
		 a.open(1, "Richards");  // Call method 
		 a.print();
		 
		 var a2 = new Account();
		 a2.print();  
		 
	}

}
