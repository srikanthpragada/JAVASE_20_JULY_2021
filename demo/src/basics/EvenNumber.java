package basics;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		var s = new Scanner(System.in);
			    
		System.out.print("Enter a number :");
		var num = s.nextInt();

		if (num % 2 == 0)
			System.out.println("Even Number!");
		else
			System.out.println("Odd Number!");

	}

}
