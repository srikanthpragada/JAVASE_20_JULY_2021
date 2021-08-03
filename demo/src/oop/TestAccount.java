package oop;

public class TestAccount {

	public static void main(String[] args) {
		 System.out.println(Account.getMinBalance());
		
		 Account a;  // object reference 
		 
		 a = new Account(1, "Richards", 50000);   
		 a.deposit(10000);
		 a.deposit(5000);
		 System.out.println(a.getBalance());
		 
		 
		 var a2 = new Account(2,"Larry");
		 a2.deposit(10000);
		 a2.print();  
		 
		 
	 
		 
		 
	}

}
