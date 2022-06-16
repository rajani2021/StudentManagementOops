package day0519;
public class TrimFunction {
	public static void main(String[] args) {
		System.out.println("Main method starts");
		String str = "  test  trim       function     ";
		System.out.println("Length of String before removing space : "+str.length());
		String trimmedString = trimString(str);
		System.out.println("Trimmed String = " + trimmedString);
		System.out.println("Length of String After removing space : "+trimmedString.length());
		System.out.println("Main method starts");
	}
	public static String trimString(String s) {
		int lIndex = 0;
		int rIndex = s.length()-1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(lIndex) == ' ') {
				lIndex++;
			} else if (s.charAt(rIndex) == ' ') {
				rIndex--;
			}
		}
		return s.substring(lIndex, rIndex + 1);
	}
}
