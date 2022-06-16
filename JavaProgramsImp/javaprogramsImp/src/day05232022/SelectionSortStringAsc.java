package day05232022;

public class SelectionSortStringAsc {

	public static void main(String[] args) {
		String[] a = { "SDF", "QWE", "ABC", "DEF", "LMN" };

		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if ((a[minIndex].compareTo(a[j]))>0) {
					minIndex = j;
				}
			}
			String temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}

		for (String value : a) {
			System.out.println(value);
		}

	}
}
