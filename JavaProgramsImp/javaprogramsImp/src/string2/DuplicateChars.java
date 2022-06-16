package string2;

public class DuplicateChars {
	public static void main(String[] args) {
		System.out.println("Main method starts");
		findDuplicateCharsWithCount("Java Programming");
		System.out.println("Main method ends");
	}

	private static void findDuplicateCharsWithCount(String str) {
		System.out.println("Duplicates in- " + str);
		int count;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			char c = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (c == str.charAt(j)) {
					count++;
					str = str.substring(0, j) + str.substring(j + 1);
				}
			}
			if (count >= 1) {
				System.out.println(c + " found " + count + " times");
			}
		}
	}

}
