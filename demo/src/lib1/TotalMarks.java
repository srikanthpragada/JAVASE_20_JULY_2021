package lib1;

import java.util.Scanner;

public class TotalMarks {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Enter marks separated by comma (,) : ");
		var data = scanner.nextLine(); 
		
		var marks = data.split(",");
		
		var total = 0;
		
		for(var m : marks)
			total +=  Integer.parseInt(m);
		
		System.out.printf("Total = %d, Average = %d", total, total / marks.length);
	}
}
