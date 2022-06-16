package string2;

public class ReplaceJohn {
	public static void main(String[] args) {
		String str = "Hi John how are you? Johnny";
		String rplcStr = str.replace("John ", "");
		System.out.println("Replaced String is : "+rplcStr);
	}
}