package oop;

abstract class Point {
	protected int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
	}

	final public int getX() {
		return this.x;
	}

	final public int getY() {
		return this.y;
	}

	public abstract double area();
		 
}

class Circle extends Point {
	protected int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void print() // Overriding
	{
		super.print();
		System.out.println(this.radius);
	}

	public double area() {
		return (Math.PI * this.radius * this.radius);
	}
}

class Rect extends Point {
	protected int length, width;

	public Rect(int x, int y, int length, int width) {
		super(x, y);
		this.length = length;
		this.width = width;
	}

	@Override
	public void print() // Overriding
	{
		super.print();
		System.out.println(this.length);
		System.out.println(this.width);
	}

	public double area() {
		return (this.length * this.width);
	}
}

public class TestObjects {

	public static void printDetails(Point p) {
		p.print();  					// Runtime Polymorphism or DMD or Late binding 
		System.out.println(p.area());   // Runtime Polymorphism
 	}

	public static void main(String[] args) {
		Circle c = new Circle(10, 20, 15);
		printDetails(c);
		
		Rect r = new Rect(10, 20, 20, 25);
		printDetails(r);	
	}

}
