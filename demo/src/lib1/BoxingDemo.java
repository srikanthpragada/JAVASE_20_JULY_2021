package lib1;

public class BoxingDemo {

	public static void process(Object obj) {
		System.out.println(obj.getClass());
	}

	public static void task(Double obj) {
		// Double is converted to double
		System.out.println(obj * obj); // AutoUnboxing
	}

	public static void main(String[] args) {
		double n = 100;

		process(n); // Autoboxing
		task(n); // Autoboxing

	}

}
