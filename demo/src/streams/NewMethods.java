package streams;

import java.util.stream.Stream;

public class NewMethods {
	public static void main(String[] args) {
		var nums = Stream.of(10,22,31,34,87,12); 
		var evenNums = nums.takeWhile(n -> n % 2 == 0); 
		evenNums.forEach(System.out::println);  
		
		nums = Stream.of(10,22,31,34,87,12); 
		var result = nums.dropWhile(n -> n % 2 == 0); 
		result.forEach(System.out::println); // 31 34 87 12
		
		var oddNums = Stream.iterate(1, v -> v < 10, v -> v + 2);
		oddNums.forEach(System.out::println); // 1 3 5 7 9
	}
}
