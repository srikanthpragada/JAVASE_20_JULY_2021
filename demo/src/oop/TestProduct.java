package oop;

class Product {
	private String name;
	private int price, qoh;
	private static int taxrate = 8;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, int price, int qoh) {
		this(name, price); // call another constructor
		this.qoh = qoh;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.qoh);
	}

	public void sell(int qty) {
		this.qoh -= qty;
	}

	public void purchase(int qty) {
		this.qoh += qty;
	}

	public void purchase(int qty, int newprice) {
		this.qoh += qty;
		this.price = newprice;
	}

	public void setPrice(int p) {
		this.price = p;
	}

	public int getSellingPrice() {
		return this.price + (this.price *  Product.taxrate / 100);
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
