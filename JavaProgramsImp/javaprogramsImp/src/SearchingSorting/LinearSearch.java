package SearchingSorting;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = new int[]{10,30,15,25,20};
		int key = 25;
		
		System.out.println("key found at position "+linearSearch(arr, key));
		
	}
	
	public static int linearSearch(int []a, int key) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
