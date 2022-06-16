package day0508;

public class CharAToZRange {

	public static void main(String[] args) {
		char c1 = 'A';
		int i1 = c1;
		int i2 = 0;
		for (int i = 0; i < 26; i++) {
			i2 = i1+i;
		}
		i1 = c1;
		System.out.println("Range from A to Z is : "+i1 +" - "+i2);
	}

}
