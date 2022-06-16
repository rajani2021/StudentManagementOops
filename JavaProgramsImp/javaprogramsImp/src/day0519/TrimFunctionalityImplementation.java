package day0519;

public class TrimFunctionalityImplementation {

	public static void main(String[] args) {
		System.out.println("Main method starts");
		String str = "  test  the app     ";
		str.trim();
		String trimmedString = trimString(str);
		trimString(str);
		System.out.println("Trimmed String = "+trimmedString);
		System.out.println("Main method starts");
	}

	public static String trimString(String s) {
	     int left=0,right=s.length()-1;
	       while(left<s.length() && s.charAt(left)==' ')
	       {
	           left++;
	       }
	       while(right>=0 && s.charAt(right)==' ')
	       {
	           right--;
	       }
	       if(left>right)
	       {
	           return "";
	       }
	       return s.substring(left,right+1);
	}
}
