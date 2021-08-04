package oop;

class Courses {
	private static int taxper = 12;
	private static int[] fees = {5000, 4000, 6000};
	private static String[] names = {"Java", "Python", "AWS" };

	public static int getCourseFee(int course) {
		var fee = Courses.fees[course - 1];
		return  fee + fee * Courses.taxper / 100; 
	}

	public static String getCourseName(int course) {
		return Courses.names[course - 1];
	}
}

class Student {
	private String name;
	private int course, feepaid;

	public Student(String name, int course, int feepaid) {
		super();
		this.name = name;
		this.course = course;
		this.feepaid = feepaid;
	}

	public void payment(int amount) {
		this.feepaid += amount;
	}

	public String getCourseName() {
		return Courses.getCourseName(this.course);
	}

	public int getTotalFee() {
		return Courses.getCourseFee(this.course);
	}

	public int getDue() {
		return this.getTotalFee() - this.feepaid;
	}

	public String getName() {
		return this.name;
	}
}

public class TestStudent {

	public static void main(String[] args) {

		var students = new Student[] { new Student("Larry", 2, 2000), new Student("Mark", 1, 1000),
				new Student("Anders", 3, 0) };

		var total = 0;

		for (var s : students) {
			total += s.getDue();
			System.out.printf("%-20s %-10s %5d\n", s.getName(), s.getCourseName(), s.getDue());
		}

		System.out.printf("\nTotal amount due = %6d", total);

	}

}
