package day0517;
public class ReturnIndex {

	public static void main(String[] args) {
		String s1 = "ABCDEF-APPLE";
		s1.indexOf("APPLE");
		int index = getIndexOf(s1, 'E');
		System.out.println("index of the char is : " + getIndexOf(s1, 'E'));
		System.out.println("index of the char is : " + getIndexOf(s1, 'D', 11));
	}

	private static int getIndexOf(String s1, char c) {
		//char[] ch = s1.toCharArray();
		for (int i = 0; i < s1.length();i++) {
			if (c == (s1.charAt(i))) {
				return i;
			}
		}
		return -1;
	}
	
	private static int getIndexOf(String s1, char c, int fromIndex) {
		//char[] ch = s1.toCharArray();
		for (int i = fromIndex; i < s1.length();i++) {
			if (c == (s1.charAt(i))) {
				return i;
			}
		}
		return -1;
	}
	
}
