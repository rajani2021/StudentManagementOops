package class18413.string;

public class TakeCartNumber {

	public static void main(String[] args) {
		String str = "You have 5 items in the Cart";
		String[] splitStr = str.split(" ");
		//for (int i = 0; i < splitStr.length; i++) {
			System.out.println(splitStr[2]);
		//}
	}
}