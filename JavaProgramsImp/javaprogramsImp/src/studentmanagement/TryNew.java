package studentmanagement;

	import java.util.Scanner;

	public class TryNew {
		static Scanner sc = new Scanner(System.in);
		public static int n; 
		static String[] strN;
		static int count;

		public static void main(String[] args) {
			System.out.println("main method starts");
			readChoice();
			System.out.println("main method ends");
		}

		public static void readChoice() {
			int choice;// ,count = 0;
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
			//int numberOfStudents = initializeStudentInfo();
			System.out.println("Enter number of students : ");
			n = sc.nextInt();
			
			if(strN == null) {
				strN = new String[n];
				for (int i = 0; i < strN.length; i++) {
					System.out.println("Enter student Name : ");
					strN[i] = sc.next();
				}
			}else {
			
			String []strName = new String[strN.length+n];
			
			int i = 0;
			for (; i < strName.length; i++) {
				System.out.println("Enter student" + (i + 1) + "'s name: ");
				strName[i] = sc.next();
			}	
			strN = strName;
			}
		}

		public static void displayStudentInfo() {
			if (strN != null) {
				for (int j = 0; j < strN.length; j++) {
					System.out.println("Student " + (j + 1) + "'s name: " + strN[j]);
					System.out.println("--------------------------------------");
				}
			} else {
				System.out.println("In order to display student info, please add student info first.");
			}
			System.out.println();
		}
	}

