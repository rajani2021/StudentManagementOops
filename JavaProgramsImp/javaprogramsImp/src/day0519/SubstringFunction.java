package day0519;

public class SubstringFunction {

	public static void main(String[] args) {
		String str = "Name:Akshara Training Center;Country:IND";
		String[] str1 = str.split(";");
		System.out.println(str1[0].substring(5));
	}
}