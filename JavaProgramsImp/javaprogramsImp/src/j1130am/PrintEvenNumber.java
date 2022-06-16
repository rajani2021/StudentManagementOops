package j1130am;

public class PrintEvenNumber {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("Using Ternary Operator : ");
		
		for (int i = 0; i <= 10; i++) {
			System.out.print((i%2 == 0)? i : "\n");
		}
	}
}