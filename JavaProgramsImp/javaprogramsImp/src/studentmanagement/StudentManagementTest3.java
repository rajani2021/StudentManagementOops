package studentmanagement;

import java.util.Scanner;

public class StudentManagementTest3 {
	static Scanner sc = new Scanner(System.in);
	static String[] strNm;
	static int[] rollNumGlobal;
	static int[] yopass;
	static double perc[];
	static String[] degr;
	static int rollNumberCount = 1;

	public static void main(String[] args) {
		System.out.println("main method starts");
		readChoice();
		System.out.println("main method ends");
	}

	public static void readChoice() {
		int choice;
		do {
			System.out.println(
					"Enter \n1 for readStudent Info: \t2 for display Student Info: \t3 for Search: \t4 for Sort: ");
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
		} while (choice == 1 || choice == 2 || choice == 3 || choice == 4);
	}

	public static void readStudentInfo() {
		System.out.println("Enter number of students : ");
		int n = sc.nextInt();
		String[] studentName = new String[n];
		int[] rollNumber = new int[n];
		int[] yop = new int[n];
		double[] percentage = new double[n];
		String[] degree = new String[n];
		for (int i = 0; i < studentName.length; i++) {
			System.out.println("Enter student's name: ");
			studentName[i] = sc.next();
			System.out.println("Student's Roll number is : " + rollNumberCount);
			rollNumber[i] = rollNumberCount;
			System.out.println("Enter student's year of passout: ");
			yop[i] = sc.nextInt();
			System.out.println("Enter student's percentage: ");
			percentage[i] = sc.nextDouble();
			System.out.println("Enter student's degree: ");
			degree[i] = sc.next();
			rollNumberCount += 1;
		}
		if (strNm == null) {
			strNm = studentName;
			rollNumGlobal = rollNumber;
			yopass = yop;
			perc = percentage;
			degr = degree;
		} else {
			int newArraySize = strNm.length + n;
			String newNameArray[] = new String[newArraySize];
			int newRollNumArray[] = new int[newArraySize];
			int newYopArray[] = new int[newArraySize];
			double newPercArray[] = new double[newArraySize];
			String newDegrArray[] = new String[newArraySize];

			for (int i = 0; i < strNm.length; i++) {
				newNameArray[i] = strNm[i];
				newRollNumArray[i] = rollNumGlobal[i];
				newYopArray[i] = yopass[i];
				newPercArray[i] = perc[i];
				newDegrArray[i] = degr[i];
			}
			for (int i = strNm.length; i < newNameArray.length; i++) {
				newNameArray[i] = studentName[i - strNm.length];
				newRollNumArray[i] = rollNumber[i - strNm.length];
				newYopArray[i] = yop[i - strNm.length];
				newPercArray[i] = percentage[i - strNm.length];
				newDegrArray[i] = degree[i - strNm.length];
			}
			strNm = newNameArray;
			rollNumGlobal = newRollNumArray;
			yopass = newYopArray;
			perc = newPercArray;
			degr = newDegrArray;
		}
	}

	public static void displayStudentInfo() {
		if (strNm != null) {
			for (int j = 0; j < strNm.length; j++) {
				System.out.println("Student " + (j + 1) + "'s name: " + strNm[j] + "\t" + "Register number: "
						+ rollNumGlobal[j] + "\t" + "Year of passout: " + yopass[j] + "\t" + "Student " + (j + 1)
						+ "'s percentage: " + perc[j] + "\t" + "Degree: " + degr[j]);
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
				searchOnRollNumber();
				break;
			case 2:
				searchOnStudentName();
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice == 1 || choice == 2);
	}

	private static void searchOnStudentName() {
		System.out.println("Enter the student Name to be searched");
		String stdName = sc.next();
		if (strNm == null) {
			System.out.println("no student found!!");
		} else {
			int lengthOfGlobalArray = strNm.length;
			String nameSearchedArray[] = new String[lengthOfGlobalArray];
			int rollSearchedArray[] = new int[lengthOfGlobalArray];
			double perSearchedArray[] = new double[lengthOfGlobalArray];
			int yopSearchedArray[] = new int[lengthOfGlobalArray];
			String degrSearchedArray[] = new String[lengthOfGlobalArray];
			for (int i = 0; i < strNm.length; i++) {
				if (stdName.equalsIgnoreCase(strNm[i])) {
					nameSearchedArray[i] = strNm[i];
					rollSearchedArray[i] = rollNumGlobal[i];
					perSearchedArray[i] = perc[i];
					yopSearchedArray[i] = yopass[i];
					degrSearchedArray[i] = degr[i];
				}
			}
			for (int i = 0; i < nameSearchedArray.length; i++) {
				if (nameSearchedArray[i] != null) {
					System.out.println("Search Result is :");
					System.out.println("StudentName: " + nameSearchedArray[i] + "\tRollNumber " + rollSearchedArray[i]
							+ "\t Percentage: " + perSearchedArray[i] + "\tYear Of Passout: " + yopSearchedArray[i]
							+ "\tDegree: " + degrSearchedArray[i]);
					System.out.println("-------------------------------");
				} else {
					System.out.println("No matching record found!!");
				}
			}
		}
	}

	private static void searchOnRollNumber() {
		System.out.println("Enter the roll Number to be searched");
		int rollN = sc.nextInt();
		if (rollNumGlobal == null) {
			System.out.println("no student found!!");
		} else {
			int lengthOfGlobalArray = strNm.length;
			String nameSearchedArray[] = new String[lengthOfGlobalArray];
			int rollSearchedArray[] = new int[lengthOfGlobalArray];
			double perSearchedArray[] = new double[lengthOfGlobalArray];
			int yopSearchedArray[] = new int[lengthOfGlobalArray];
			String degrSearchedArray[] = new String[lengthOfGlobalArray];
			for (int i = 0; i < rollNumGlobal.length; i++) {
				if (rollN == rollNumGlobal[i]) {
					nameSearchedArray[i] = strNm[i];
					rollSearchedArray[i] = rollNumGlobal[i];
					perSearchedArray[i] = perc[i];
					yopSearchedArray[i] = yopass[i];
					degrSearchedArray[i] = degr[i];
				}
			}
			for (int i = 0; i < nameSearchedArray.length; i++) {
				if (nameSearchedArray[i] != null) {
					System.out.println("Search Result is :");
					System.out.println("StudentName: " + nameSearchedArray[i] + "\tRollNumber " + rollSearchedArray[i]
							+ "\t Percentage: " + perSearchedArray[i] + "\tYear Of Passout: " + yopSearchedArray[i]
							+ "\tDegree: " + degrSearchedArray[i]);
					System.out.println("-------------------------------");
				} else {
					System.out.println("student roll number not found!!!");
				}
			}

		}
	}

	private static void sort() {
		int choice;
		do {
			System.out.println(
					"Enter 1 for sort based on RollNumber: \n2 for search based on Student Name: \n3 for Percentage");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				sortOnRollNumber();
				break;
			case 2:
				sortOnStudentName();
				break;
			case 3:
				sortOnPercentage();
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice == 1 || choice == 2 || choice == 3);
	}

	private static void sortOnPercentage() {
		if (strNm == null) {
			System.out.println("no student found!!");
		} else {
			System.out.println("Sorting based on Percentage: ");
			int lengthOfGlobalArray = strNm.length;
			String nameSearchedArray[] = new String[lengthOfGlobalArray];
			int rollSearchedArray[] = new int[lengthOfGlobalArray];
			double percSearchedArray[] = new double[lengthOfGlobalArray];
			int yopSearchedArray[] = new int[lengthOfGlobalArray];
			String degrSearchedArray[] = new String[lengthOfGlobalArray];
			for (int i = 0; i < strNm.length; i++) {
				percSearchedArray[i] = perc[i];
			}

			for (int i = 0; i < percSearchedArray.length - 1; i++) {
				for (int j = 1; j < percSearchedArray.length; j++) {
					if (percSearchedArray[j] < percSearchedArray[j - 1]) {
						double temp = percSearchedArray[j];
						percSearchedArray[j] = percSearchedArray[j - 1];
						percSearchedArray[j - 1] = temp;
					}
				}
			}

			for (int i = 0; i < percSearchedArray.length; i++) {
				nameSearchedArray[i] = strNm[i];
				rollSearchedArray[i] = rollNumGlobal[i];
				//perSearchedArray[i] = perc[i];
				yopSearchedArray[i] = yopass[i];
				degrSearchedArray[i] = degr[i];
			}
		for (int i = 0; i < percSearchedArray.length; i++) {
			System.out.println("Sorted Result is :");
			System.out.println("StudentName: " + nameSearchedArray[i] + "\tRollNumber " + rollSearchedArray[i] + "\t Percentage: "
					+ percSearchedArray[i] + "\tYear Of Passout: " + yopSearchedArray[i] + "\tDegree: " + degrSearchedArray[i]);
			System.out.println("-------------------------------");
		}
	}

	}

	private static void sortOnStudentName() {
		// TODO Auto-generated method stub

	}

	private static void sortOnRollNumber() {
		// TODO Auto-generated method stub

	}

}
