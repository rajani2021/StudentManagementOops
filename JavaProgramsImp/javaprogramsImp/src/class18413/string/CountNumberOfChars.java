package class18413.string;

public class CountNumberOfChars {

	public static void main(String[] args) {
		String str = "Goodd Morning";
		String revStr = str.replaceAll("n", "");
		System.out.println(str.length()-revStr.length());
	}
}