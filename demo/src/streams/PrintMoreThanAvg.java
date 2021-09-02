package streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class PrintMoreThanAvg {

	public static void main(String[] args) throws Exception {
		Path p = Path.of("d:\\classroom\\marks.txt");

		var avgMarks = 
		   	  Files.lines(p)
		     .filter(v -> Pattern.matches("\\d+",v))
		     .mapToInt(v -> Integer.parseInt(v))   // Covert to int
		     .average()       // OptionalDouble 
		     .getAsDouble();
		
		System.out.println(avgMarks);
		
		Files.lines(p)
		  .filter(v -> Pattern.matches("\\d+",v))
		  .mapToInt(v -> Integer.parseInt(v))   // Covert to int
		  .filter(v -> v > avgMarks)
		  .forEach(System.out::println);
		    
	}

}
