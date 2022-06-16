package studentmanagement;

import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method starts");
		System.out.println("Enter number of students : ");
		int n = sc.nextInt();
		String[] strName = new String[n];
		String[] regNumber = new String[n];
		int[] yop = new int[n];
		double percentage[] = new double[n];
		String[] degree = new String[n];
		// Read student info
		for (int i = 0; i < strName.length; i++) {
			System.out.println("Enter student"+ (i + 1) + "'s name: ");
			strName[i] = sc.next();
			System.out.println("Enter student"+ (i + 1) + "'s register number: ");
			regNumber[i] = sc.next();
			System.out.println("Enter student"+ (i + 1) + "'s year of passout: ");
			yop[i] = sc.nextInt();
			System.out.println("Enter student"+ (i + 1) + "'s percentage: ");
			percentage[i] = sc.nextDouble();
			System.out.println("Enter student"+ (i + 1) + "'s degree: ");
			degree[i] = sc.next();
		}
		// display Student info
		for (int j = 0; j < strName.length; j++) {
			System.out.println("Student " + (j + 1) + "'s name: " + strName[j] + "\n" + "Student " + (j + 1)
					+ "'s register number: " + regNumber[j] + "\n" + "Student " + (j + 1) + "'s year of passout: "
					+ yop[j] + "\n" + "Student " + (j + 1) + "'s percentage: " + percentage[j] + "\n" + "Student "
					+ (j + 1) + "'s degree: " + degree[j]);
			System.out.println("--------------------------------------");
		}
		System.out.println("main method ends");
	}
}
