package basics;

public class ArrayDemo {

	public static void main(String[] args) {
		var nums = new int[5];
		
		for(int i = 0; i < nums.length; i ++)
			System.out.println(nums[i]);
		
		// Enhanced for loop 
		for(int n : nums)
			System.out.println(n);
	}

}
