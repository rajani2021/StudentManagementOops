package day0513;

import java.util.Scanner;

public class SalaryCalculation {
	static double grossSalary;
	static int netSalary;
	static double tax;
	static int numberOfMonths = 12;

	public static void main(String[] args) {

		System.out.println("main method starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gross Salary : ");
		grossSalary = sc.nextDouble();
		System.out.println("Gross Salary for the year = " + grossSalary);

		if (grossSalary >= 0 && grossSalary <= 250000) {
			netSalary = (int) grossSalary / numberOfMonths;
			System.out.println("The Monthly Net Salary is : " + netSalary);
		} 
		else if (grossSalary > 250000 && grossSalary <= 500000) {
			tax = (12500 + (grossSalary * 0.1));
			netSalary = (int) ((grossSalary - tax) / numberOfMonths);
			System.out.println("Monthly NetSalary out of "+grossSalary +"=" + netSalary);
		} 
		else if (grossSalary > 500000 && grossSalary <= 750000) {
			tax = (grossSalary * 0.05);
			netSalary = (int) ((grossSalary - tax) / numberOfMonths);
			System.out.println("Monthly NetSalary out of "+grossSalary +"="  + netSalary);
		} 
		else if (grossSalary > 750000 && grossSalary <= 1000000) {
			tax = (grossSalary * 0.1);
			netSalary = (int) ((grossSalary - tax) / numberOfMonths);
			System.out.println("Monthly NetSalary out of "+grossSalary +"= " + netSalary);
		} 
		else if (grossSalary > 1000000 && grossSalary <= 1250000) {
			tax = (grossSalary * 0.15);
			netSalary = (int) ((grossSalary - tax) / numberOfMonths);
			System.out.println("Monthly NetSalary out of "+grossSalary +"=" + netSalary);
		} 
		else if (grossSalary > 1250000 && grossSalary <= 1500000) {
			tax = (grossSalary * 0.25);
			netSalary = (int) ((grossSalary - tax) / numberOfMonths);
			System.out.println("Monthly NetSalary out of "+grossSalary +"= " + netSalary);
		} 
		else if (grossSalary > 1500000) {
			tax = (grossSalary * 0.3);
			netSalary = (int) ((grossSalary - tax) / numberOfMonths);
			System.out.println("Monthly NetSalary out of "+grossSalary +" = " + netSalary);
		}
		else {
			System.out.println("Not earning!!!");
		}
		System.out.println("main method ends");
	}
}
