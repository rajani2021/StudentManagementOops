package studentmanagement;

import java.util.Scanner;

public class StudentManagement2 {
	static Scanner sc = new Scanner(System.in);
	static String[] strName;
	static int[] rollNumber;
	static int[] yop;
	static double percentage[];
	static String[] degree;
	public static void main(String[] args) {
		System.out.println("main method starts");
		readChoice();
		System.out.println("main method ends");
	}
	public static void readChoice() {
		int choice;
		do {
			System.out.println("Enter 1 for readStudent Info: \n2 for display Student Info: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				readStudentInfo();
				break;
			case 2:
				displayStudentInfo();
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice == 1 || choice == 2);
	}
	public static int initializeStudentInfo() {
		System.out.println("Enter number of students : ");
		int n = sc.nextInt();
		strName = new String[n];
		rollNumber = new int[n];
		yop = new int[n];
		percentage = new double[n];
		degree = new String[n];
		return n;
	}
	public static void readStudentInfo() {
		int numberOfStudents = initializeStudentInfo();
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter student" + (i + 1) + "'s name: ");
			strName[i] = sc.next();
			System.out.println("Enter student" + (i + 1) + "'s register number: ");
			rollNumber[i] = sc.nextInt();
			System.out.println("Enter student" + (i + 1) + "'s year of passout: ");
			yop[i] = sc.nextInt();
			System.out.println("Enter student" + (i + 1) + "'s percentage: ");
			percentage[i] = sc.nextDouble();
			System.out.println("Enter student" + (i + 1) + "'s degree: ");
			degree[i] = sc.next();
		}
	}
	public static void displayStudentInfo() {
		if (strName != null) {
			for (int j = 0; j < strName.length; j++) {
				System.out.println("Student " + (j + 1) + "'s name: " + strName[j] + "\n" + "Student " + (j + 1)
						+ "'s register number: " + rollNumber[j] + "\n" + "Student " + (j + 1) + "'s year of passout: "
						+ yop[j] + "\n" + "Student " + (j + 1) + "'s percentage: " + percentage[j] + "\n" + "Student "
						+ (j + 1) + "'s degree: " + degree[j]);
				System.out.println("--------------------------------------");
			}
		} else {
			System.out.println("In order to display student info, please add student info first.");
		}
		System.out.println();
	}
}