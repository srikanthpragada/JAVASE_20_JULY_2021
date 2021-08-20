package oop;

public class ExDemo {

	public static void main(String[] args) throws InterruptedException {

        String st = "123a";
        
        int n = Integer.parseInt(st);  // Unchecked 
        
        Thread.sleep(1000);            // Checked 
        

	}

}
