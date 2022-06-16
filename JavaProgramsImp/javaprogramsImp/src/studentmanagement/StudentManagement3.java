package studentmanagement;

import java.util.Scanner;

public class StudentManagement3 {
	static Scanner sc = new Scanner(System.in);
	static String[] strName;
	static String[] regNumber;
	static int[] yop;
	static double percentage[];
	static String[] degree;

	public static void main(String[] args) {
		System.out.println("main method starts");
		readStudentInfo();
		displayStudentInfo();
		System.out.println("main method ends");
	}

	public static void readStudentInfo() {
		System.out.println("Enter number of students : ");
		int n = sc.nextInt();
		strName = new String[n];
		regNumber = new String[n];
		yop = new int[n];
		percentage = new double[n];
		degree = new String[n];
		for (int i = 0; i < strName.length; i++) {
			System.out.println("Enter student" + (i + 1) + "'s name: ");
			strName[i] = sc.next();
			System.out.println("Enter student" + (i + 1) + "'s register number: ");
			regNumber[i] = sc.next();
			System.out.println("Enter student" + (i + 1) + "'s year of passout: ");
			yop[i] = sc.nextInt();
			System.out.println("Enter student" + (i + 1) + "'s percentage: ");
			percentage[i] = sc.nextDouble();
			System.out.println("Enter student" + (i + 1) + "'s degree: ");
			degree[i] = sc.next();
		}
	}
	public static void displayStudentInfo() {
		for (int j = 0; j < strName.length; j++) {
			System.out.println("Student " + (j + 1) + "'s name: " + strName[j] + "\n" + 
				"Student " + (j + 1)	+ "'s register number: " + regNumber[j] + "\n" + 
				"Student " + (j + 1) + "'s year of passout: "+ yop[j] + "\n" + 
				"Student " + (j + 1) + "'s percentage: " + percentage[j] + "\n" + 
				"Student " + (j + 1) + "'s degree: " + degree[j]);
			System.out.println("--------------------------------------");
		}
	}
}
