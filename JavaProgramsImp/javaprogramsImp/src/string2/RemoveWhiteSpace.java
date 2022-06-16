package string2;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str = "My name is String. I'm a final class";
		System.out.println(str.replaceAll("\\s+", ""));
	}
}
