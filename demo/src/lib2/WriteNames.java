package lib2;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteNames {

	public static void main(String[] args) {

       try (var fw = new FileWriter("names.txt", true); 
    		var s = new Scanner(System.in))
       {
    	   while(true) {
    		   System.out.print("Enter name [end to stop] :");
    		   var name = s.nextLine();
    		   if (name.toLowerCase().equals("end"))
    			     break;
    		   fw.write(name + "\n");
    	   }
       }
       catch(Exception ex) {
    	   System.out.println(ex.getMessage());
       }

	}

}
