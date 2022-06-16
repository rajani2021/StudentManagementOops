package studentmanagement;
import java.util.Scanner;
public class StudentManagementTest {
	static Scanner sc = new Scanner(System.in);
	static String[] strNm;
	static int[] rollNum;
	static int[] yopass;
	static double perc[];
	static String[] degr;
	static int rollNumberCount=1;

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
			System.out.println("Student's Roll number is : "+rollNumberCount);
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
			rollNum = rollNumber;
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
				newRollNumArray[i] = rollNum[i];
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
			rollNum = newRollNumArray;
			yopass = newYopArray;
			perc = newPercArray;
			degr = newDegrArray;
		}
	}

	public static void displayStudentInfo() {
		if (strNm != null) {
			for (int j = 0; j < strNm.length; j++) {
				System.out.println("Student " + (j + 1) + "'s name: " + strNm[j] + "\n" + "Student " + (j + 1)
						+ "'s register number: " + rollNum[j] + "\n" + "Student " + (j + 1) + "'s year of passout: "
						+ yopass[j] + "\n" + "Student " + (j + 1) + "'s percentage: " + perc[j] + "\n" + "Student "
						+ (j + 1) + "'s degree: " + degr[j]);
				System.out.println("--------------------------------------");
			}
		} else {
			System.out.println("In order to display student info, please add student info first.");
		}
		System.out.println();
	}
}
