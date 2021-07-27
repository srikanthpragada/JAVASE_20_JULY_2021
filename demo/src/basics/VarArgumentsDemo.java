package basics;

public class VarArgumentsDemo {
	
	public static void print(int ... values) {
		
		for (var n : values)
			System.out.println(n);
	}

	public static void main(String[] args) {
		 
		print(1,2);
		print(1,2,3,4);
		
	}

}
