package oop;

class Product {
	private String name;
	private int price, qoh;

	public Product(String n, int p) {
		name = n;
		price = p;
	}

	public Product(String n, int p, int q) {
		name = n;
		price = p;
		qoh = q;
	}

	public void print() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(qoh);
	}

	public void sell(int qty) {
		qoh -= qty;
	}

	public void purchase(int qty) {
		qoh += qty;
	}

	public void purchase(int qty, int newprice) {
		qoh += qty;
		price = newprice;
	}

	public void setPrice(int p) {
		price = p;
	}

	public int getSellingPrice() {
		return price + (price * 8 / 100);
	}
}

public class TestProduct {

	public static void main(String[] args) {
		var p1 = new Product("PowerBeats Pro", 20000);
		p1.purchase(10);
		p1.sell(3);
		p1.print();
	}

}
