package lib1;

import java.util.Scanner;
import java.util.StringJoiner;

public class JoinStrings {

	public static void main(String[] args) {
		 var scanner = new Scanner(System.in);
		 var names = new StringJoiner("-");
		 
		 while(true) {
			 System.out.println("Enter name [end to stop] :");
			 var name = scanner.nextLine();
			 if (name.equals("end"))
				   break;
			 
			 names.add(name);
		 }
		 
		 System.out.println(names.toString());
	}

}
