package basics;

import java.util.Scanner;

public class NetAmount {
	public static void main(String[] args) {
		var s = new Scanner(System.in);

		System.out.print("Enter price :");
		var price = s.nextInt();

		System.out.print("Enter qty   :");
		var qty = s.nextInt();

		var amount = price * qty;
		var discount = amount * 15 / 100;
		var discounted_amount = amount - discount;
		var tax = discounted_amount * 8 / 100;

		var net_amount = discounted_amount + tax;

		System.out.printf("Net Amount = %8d",net_amount);
	}
}
