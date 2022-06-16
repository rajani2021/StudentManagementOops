package studentmanagement;

import java.util.Scanner;

public class TryNew3 {
	static Scanner sc = new Scanner(System.in);
	static String[] strN;
	static int[] rollNumber;
	static int count = 0;

	public static void main(String[] args) {
		System.out.println("main method starts");
		readChoice();
		System.out.println("main method ends");
	}

	public static void readChoice() {
		int choice;// ,count = 0;
		do {
			System.out.println(
					"Enter 1 for readStudent Info: \n2 for display Student Info: " + "\n3 for Search: \n4 for Sort");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				readStudentInfo();
				break;
			case 2:
				displayStudentInfo();
				break;
			case 3:
				search();
			case 4:
				sort();
			default:
				System.out.println("Invalid choice");
			}
		} while (choice == 1 || choice == 2||choice==3||choice==4);
	}

	public static void readStudentInfo() {
		System.out.println("Enter number of students : ");
		int n = sc.nextInt();

		String[] a = new String[n];
		int rollN[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter student name : ");
			a[i] = sc.next();
			count++;
			rollN[i] = count;
		}
		if (strN == null) {
			strN = a;
			rollNumber = rollN;
		} else {
			int newArraySize = strN.length + n;
			String newArray[] = new String[newArraySize];
			int newRollNumber[] = new int[newArraySize];
			for (int i = 0; i < strN.length; i++) {
				newArray[i] = strN[i];
				newRollNumber[i] = rollNumber[i];
			}
			for (int i = strN.length; i < newArray.length; i++) {
				newArray[i] = a[i - strN.length];
				newRollNumber[i] = rollN[i - strN.length];
			}

			strN = newArray;
			rollNumber = newRollNumber;
		}
	}

	public static void displayStudentInfo() {
		if (strN != null) {
			for (int j = 0; j < strN.length; j++) {
				System.out.println("Student " + (j + 1) + "'s name: " + strN[j] + "\n RollNumber = " + rollNumber[j]);
				System.out.println("--------------------------------------");
			}
		} else {
			System.out.println("In order to display student info, please add student info first.");
		}
		System.out.println();
	}

	private static void search() {

		int choice;
		do {
			System.out.println("Enter 1 for search based on RollNumber: \n2 for search based on Student Name: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (strN == null) {
					System.out.println("No students are added yet!!! Please add and then search");
				} else {
					System.out.println("Enter the roll Number to be searched");
					int rollN = sc.nextInt();
					searchOnRollNumber(rollN);
				}
				break;
			case 2:
					System.out.println("Enter the student Name to be searched");
					String stdName = sc.next();
					searchOnStudentName(stdName);
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice == 1 || choice == 2);

	}

	private static void searchOnStudentName(String stdName) {
		// int countStudentName = 0;
		if(strN == null) {
			System.out.println("no student found!!");
		}else {
		String nameSearchedArray[] = new String[strN.length];
		int rollArray[] = new int[strN.length];
		for (int i = 0; i < strN.length; i++) {
			if (stdName.equalsIgnoreCase(strN[i])) {
				nameSearchedArray[i] = strN[i];
				rollArray[i] = rollNumber[i];
			}
			else {
				System.out.println("No matching record found!!");
			}
		}
		for (int i = 0; i < nameSearchedArray.length; i++) {
				if (nameSearchedArray[i] != null) {
					System.out.println(nameSearchedArray[i]);
					System.out.println(rollArray[i]);
				}
			}
		}
	}
	private static void searchOnRollNumber(int rollNum) {
		String strRollNumMatch[] = new String[strN.length];
		for (int i = 0; i < rollNumber.length; i++) {
			if (rollNum == rollNumber[i]) {
				strRollNumMatch[i] = strN[i];
			}
		}
		for (int i = 0; i < strRollNumMatch.length; i++) {
			if (strRollNumMatch[i] != null) {
				System.out.println(strRollNumMatch[i] + "\t" + rollNum);
			}
		}
		System.out.println("student roll number found!!!");
	}

	private static void sort() {
		// TODO Auto-generated method stub

	}

}
