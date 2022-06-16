package javaPrograms;

public class LongNumbersWithoutL {

	public static void main(String[] args) {
		
		long longNumberWithoutL = 1000*60*60*24*365;
		long longNumberWithL = 1000*60*60*24*365L;
		
		System.out.println(longNumberWithoutL);
		System.out.println(longNumberWithL);
		
		//When we don't give L for really long numbers, Java removes 4 significant digits from Left, which will result in data loss
	}

}
