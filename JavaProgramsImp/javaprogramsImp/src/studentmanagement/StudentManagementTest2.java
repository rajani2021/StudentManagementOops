package studentmanagement;
import java.util.Scanner;
public class StudentManagementTest2 {
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
				add();
				break;
			case 2:
				display();
				break;
			case 3:
				search();
				break;
			case 4:
				sort();
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice == 1 || choice == 2 || choice == 3 || choice == 4);
	}

	public static void add() {
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

	public static void display() {
		if (strNm != null) {
			for (int j = 0; j < strNm.length; j++) {
				System.out.println("Student " + (j + 1) + "'s name: " + strNm[j] + "\t" + "RollNnumber: "
						+ rollNumGlobal[j] + "\t" + "Year of passout: " + yopass[j] + "\t" + "Percentage: " + perc[j]
						+ "\t" + "Degree: " + degr[j]);
			}
			System.out.println("---------------------------------------------------------");
		} else {
			System.out.println("In order to display student info, please add student info first.");
		}
		System.out.println();
	}

	private static void search() {
		if (strNm == null) {
			System.out.println("In order to search student, please add student info first.");
		} else {
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
	}

	private static void searchOnStudentName() {
		System.out.println("Enter the student Name to be searched");
		String stdName = sc.next();
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
			System.out.println("Search Result is :");
			for (int i = 0; i < nameSearchedArray.length; i++) {
				if (nameSearchedArray[i] != null) {
					System.out.println("StudentName: " + nameSearchedArray[i] + "\tRollNumber " + rollSearchedArray[i]
							+ "\t Percentage: " + perSearchedArray[i] + "\tYear Of Passout: " + yopSearchedArray[i]
							+ "\tDegree: " + degrSearchedArray[i]);
				}
			}
		}

	private static void searchOnRollNumber() {
		System.out.println("Enter the roll Number to be searched");
		int rollN = sc.nextInt();
			//int lengthOfGlobalArray = strNm.length;
			String nameSearchedArray[] = new String[rollN];
			int rollSearchedArray[] = new int[rollN];
			double perSearchedArray[] = new double[rollN];
			int yopSearchedArray[] = new int[rollN];
			String degrSearchedArray[] = new String[rollN];
			for (int i = 0; i < rollNumGlobal.length; i++) {
				if (rollN == rollNumGlobal[i]) {
					nameSearchedArray[i] = strNm[i];
					rollSearchedArray[i] = rollNumGlobal[i];
					perSearchedArray[i] = perc[i];
					yopSearchedArray[i] = yopass[i];
					degrSearchedArray[i] = degr[i];
				}
			}
			System.out.println("Search Result is :");
			for (int i = 0; i < nameSearchedArray.length; i++) {
				if (nameSearchedArray[i] != null) {
					System.out.println("StudentName: " + nameSearchedArray[i] + "\tRollNumber " + rollSearchedArray[i]
							+ "\t Percentage: " + perSearchedArray[i] + "\tYear Of Passout: " + yopSearchedArray[i]
							+ "\tDegree: " + degrSearchedArray[i]);
				}
			}
		}

	private static void sort() {
		if (strNm == null) {
			System.out.println("In order to sort student info, please add student info first.");
		} else {
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
	}

	private static void sortOnPercentage() {
		System.out.println("Sorting based on Percentage: ");
		int lengthOfGlobalArray = strNm.length;
		double percSortArray[] = new double[lengthOfGlobalArray];
		for (int i = 0; i < strNm.length; i++) {
			percSortArray[i] = perc[i];
		}

		for (int i = 0; i < percSortArray.length - 1; i++) {
			for (int j = 1; j < percSortArray.length; j++) {
				if (percSortArray[j] < percSortArray[j - 1]) {
					double temp = percSortArray[j];
					percSortArray[j] = percSortArray[j - 1];
					percSortArray[j - 1] = temp;
				}
			}
		}
		System.out.println("Sorted Result is :");
		for (int i = 0; i < percSortArray.length; i++) {
			System.out.println("StudentName: " + strNm[i] + "\tRollNumber " + rollNumGlobal[i] + "\t Percentage: "
					+ percSortArray[i] + "\tYear Of Passout: " + yopass[i] + "\tDegree: " + degr[i]);
		}
	}

	private static void sortOnStudentName() {
		System.out.println("Sorting based on StudentName: ");
		int lengthOfGlobalArray = strNm.length;
		String nameSortArray[] = new String[lengthOfGlobalArray];
		for (int i = 0; i < strNm.length; i++) {
			nameSortArray[i] = strNm[i];
		}
		for (int i = 0; i < nameSortArray.length - 1; i++) {
			for (int j = 1; j < nameSortArray.length; j++) {
				if ((nameSortArray[j].compareTo(nameSortArray[j - 1])) < 0) {
					String temp = nameSortArray[j];
					nameSortArray[j] = nameSortArray[j - 1];
					nameSortArray[j - 1] = temp;
				}
			}
		}
		System.out.println("Sorted Result is :");
		for (int i = 0; i < nameSortArray.length; i++) {
			System.out.println("StudentName: " + nameSortArray[i] + "\tRollNumber " + rollNumGlobal[i]
					+ "\t Percentage: " + perc[i] + "\tYear Of Passout: " + yopass[i] + "\tDegree: " + degr[i]);
		}
	}

	private static void sortOnRollNumber() {
		System.out.println("Sorting based on RollNumber: ");
		System.out.println("Sorted Result is :");
		for (int i = 0; i < rollNumGlobal.length; i++) {
			System.out.println("StudentName: " + strNm[i] + "\tRollNumber " + rollNumGlobal[i] + "\t Percentage: "
					+ perc[i] + "\tYear Of Passout: " + yopass[i] + "\tDegree: " + degr[i]);
		}
	}
}
