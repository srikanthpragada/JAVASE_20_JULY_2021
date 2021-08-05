package oop;

class Point {
	protected int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
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

public class TestObjects {

	public static void main(String[] args) {
		var c = new Circle(10, 20, 15);
		System.out.println(c.getX());
		c.print();
		System.out.printf("%.2f",c.area());

	}

}
