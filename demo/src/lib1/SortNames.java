package lib1;

import java.util.Arrays;

public class SortNames {

	public static void main(String[] args) {
		var data = "Java,C#,C++,Python,JavaScript,Go";
		
		var names = data.split(",");
		
		Arrays.sort(names);
		
		for(var n : names)
           System.out.println(n);
	}

}
