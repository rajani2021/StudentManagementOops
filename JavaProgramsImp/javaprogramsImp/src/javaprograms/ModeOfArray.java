package javaprograms;

public class ModeOfArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,3,4,5};
		int maxnumber=-1;
		int maxapperance=-1;
		int result=0;
		for (int i=0;i<arr.length;i++) {
			int count=0;
			for (int j=0;j<arr.length;j++)
            {
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			if (count > maxapperance) {
				maxnumber=arr[i];
				maxapperance=count;				
			}			
		}
		System.out.println("+" +maxnumber);
	}
}
