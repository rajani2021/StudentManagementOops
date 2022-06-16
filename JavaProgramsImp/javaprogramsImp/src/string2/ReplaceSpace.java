package string2;

public class ReplaceSpace {

	public static void main(String[] args) {
		String str = new String("My name is Java");
		System.out.println(str.replaceAll("\\s+", "_"));
	}
}