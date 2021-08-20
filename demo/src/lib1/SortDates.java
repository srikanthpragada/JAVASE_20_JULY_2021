package lib1;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class SortDates {

	public static void main(String[] args) {
	  
		
		LocalDate[] dates = new LocalDate[5];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter date [yyyy-mm-dd] :");
			var date = s.nextLine();
			dates[i] = LocalDate.parse(date);
		}

		Arrays.sort(dates);

		for (var dd : dates)
			System.out.println(dd.format(DateTimeFormatter.ISO_DATE));

	}

}
