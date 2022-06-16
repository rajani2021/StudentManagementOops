package day0519;

public class TrimFunctionalityImplementation2 {

	public static void main(String[] args) {
		System.out.println("Main method starts");
		String str = "  test  the app     ";
		//str.trim()
		String trimmedString = trimString(str);
		System.out.println("Trimmed String = "+trimmedString);
		System.out.println("Main method starts");
	}

	public static String trimString(String str) {
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
				continue;
			}
			if(str.charAt(i)!=' ') {
				newString += str.charAt(i);
			}
		}
		System.out.println("new String = "+newString);
		System.out.println("new String length = "+newString.length());
		return newString;
	}
}
