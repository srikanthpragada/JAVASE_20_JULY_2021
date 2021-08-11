package lib1;

class Product {
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product other = (Product) obj; // Downcasting
			return this.name.equals(other.name) && this.price == other.price;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return this.price;
	}
}

public class TestProduct {

	public static void main(String[] args) {
		var p1 = new Product("Product1", 10000);
		var p2 = new Product("Product1", 10000);

		System.out.println(p1); // p1.toString()
		System.out.println(p1.toString());

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals("abc"));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
