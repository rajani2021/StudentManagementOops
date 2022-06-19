package student.management.oops;

public class Student {
	private int rollNumber;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	private double percentage;
	private int yop;
	private String degree;

	public Student(int rollNumber, String name, double percentage, int yop, String degree) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.percentage = percentage;
		this.yop = yop;
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Student [" + hashCode() + " rollNumber=" + rollNumber + ", name=" + name + ", percentage=" + percentage
				+ ", yop=" + yop + ", degree=" + degree + "]";
	}

	public boolean equals(Student s) {
		return (this.degree.equalsIgnoreCase(s.degree) 
				&& this.rollNumber == s.rollNumber
				&& this.name.equalsIgnoreCase(s.name) 
				&& this.percentage == s.percentage 
				&& this.yop == s.yop);
	}
	
	

	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		return equals(s);
	}

	public Student() {

	}
}
