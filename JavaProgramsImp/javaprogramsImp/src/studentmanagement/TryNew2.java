package studentmanagement;

	import java.util.Scanner;

	public class TryNew2 {
		static Scanner sc = new Scanner(System.in);
		public static int n; 
		static String[] strN;
		static int[] rollN;
		static int[] yopass;
		static double perc[];
		static String[] degr;
		static int count;

		/*
		 * 	static String[] strN = new String[n];
		static int[] rollN = new int[n];
		static int[] yopass = new int[n];
		static double perc[]= new double[n];
		static String[] degr= new String[n];
		 */
		
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
			String []strName = new String[n];
			int [] rollNumber = new int[n];
			int []yop = new int[n];
			double[] percentage = new double[n];
			String [] degree = new String[n];
			int i = 0;
			for (; i < strName.length; i++) {
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
			strN = new String[strName.length+n];
			rollN = new int[strName.length+n];
			yopass = new int[strName.length+n];
			perc= new double[strName.length+n];
			degr= new String[strName.length+n];
			
				for (int j = 0; j <strName.length; j++) {
					 strN[j]=strName[j];
					 rollN[j]=rollNumber[j];
					 yopass[j]=yop[j];
					 perc[j]=percentage[j];
					 degr[j]=degree[j];
				}
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

