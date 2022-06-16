package day0519;

public class ConvertToYear {

	public static void main(String[] args) {
		String str = "PAST 16 Months";
		String subStr = str.substring(5, 7);
		int monthCount = Integer.valueOf(subStr);
		System.out.println("Months Converted in Year+Month Format : "
		+monthCount / 12 + " Year " + monthCount % 12 + " Months");
	}
}
