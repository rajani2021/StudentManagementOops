package day05232022;

public class SelectionSortAsc {

	public static void main(String[] args) {
		int[] a = { 5, 8, 4, 6, 1 };

		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}

		for (int value : a) {
			System.out.println(value);
		}

	}
}
