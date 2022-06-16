package string2;

public class ArrayMedian {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4}; // array is already sorted so no need to sort again
		int median;
		
		if (arr.length % 2 != 0) // if number of elements are odd
		{
			median = arr[arr.length / 2];
			System.out.println("median of array is: " + median);
		} else {
			median = (int) ((arr[(arr.length / 2)] + arr[(arr.length / 2 - 1)]) / 2.0);
			System.out.println("median of array is: " +median);
		}
	}
}