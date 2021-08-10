package lib1;

class Product {
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

public class TestProduct {

	public static void main(String[] args) {
		 var p1 = new Product ("Product1", 10000);
		 var p2 = new Product ("Product1", 10000);
		 
		 System.out.println(p1);    // p1.toString()
		 System.out.println(p1.toString()); 
		 
		 System.out.println(p1.equals(p2));
	}
}
