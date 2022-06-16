package day0518;
public class ConvertUpperToLowerToUpper {
	public static void main(String[] args) {
		String inputString = "I lOvE My CouNTry";
		System.out.println("Entered String = "+inputString);
		String newString = "";
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			int chr = ch;
			if (chr >= 65 && chr <= 90) {
				ch = (char)(chr + 32);
			} else if (chr >= 97 && chr <= 122) {
				ch = (char)(chr - 32);
			}else {
				ch = (char)chr;
			}
			newString += ch;
		}
		System.out.println("Converterd String = " + newString);
	}
}
