package studentmanagement;

import java.util.Scanner;

public class StudentManagement4 {
	static Scanner sc = new Scanner(System.in);
	public static int n; 
	static String[] strN;
	static int[] rollN;
	static int[] yopass;
	static double perc[];
	static String[] degr;
	static int count;

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
				//count++;
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
		//int numberOfStudents = initializeStudentInfo();
		System.out.println("Enter number of students : ");
		n = sc.nextInt();
		String []strName = new String[n];
		int [] rollNumber = new int[n];
		int []yop = new int[n];
		double[] percentage = new double[n];
		String [] degree = new String[n];
		int i = strN.length;
		for (; i < strName.length+n; i++) {
			System.out.println("Enter student" + (i + 1) + "'s name: ");
			strN[i] = sc.next();
			System.out.println("Enter student" + (i + 1) + "'s register number: ");
			rollN[i] = sc.nextInt();
			System.out.println("Enter student" + (i + 1) + "'s year of passout: ");
			yopass[i] = sc.nextInt();
			System.out.println("Enter student" + (i + 1) + "'s percentage: ");
			perc[i] = sc.nextDouble();
			System.out.println("Enter student" + (i + 1) + "'s degree: ");
			degr[i] = sc.next();
		}	
		
		for (int j = strN.length; j < strN.length+n; j++) {
			System.out.println("Enter student" + (i + 1) + "'s name: ");
			strN[i] = sc.next();
			System.out.println("Enter student" + (i + 1) + "'s register number: ");
			rollN[i] = sc.nextInt();
			System.out.println("Enter student" + (i + 1) + "'s year of passout: ");
			yopass[i] = sc.nextInt();
			System.out.println("Enter student" + (i + 1) + "'s percentage: ");
			perc[i] = sc.nextDouble();
			System.out.println("Enter student" + (i + 1) + "'s degree: ");
			degr[i] = sc.next();
		}
		
		/*
		 * strN = strName; rollN = rollNumber; yopass = yop; perc= percentage; degr=
		 * degree;
		 */
		
		/*
		 * for (int j = 0; j <strName.length; j++) { strN[j]=strName[j];
		 * rollN[j]=rollNumber[j]; yopass[j]=yop[j]; perc[j]=percentage[j];
		 * degr[j]=degree[j]; }
		 */
	}

	public static void displayStudentInfo() {
		if (strN != null) {
			for (int j = 0; j < strN.length; j++) {
				System.out.println("Student " + (j + 1) + "'s name: " + strN[j] + "\n" + "Student " + (j + 1)
						+ "'s register number: " + rollN[j] + "\n" + "Student " + (j + 1) + "'s year of passout: "
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
