package string2;

public class LeaderInArray {

	public static void main(String[] args) {
		int arrl[]= {1,2,4,3,8,6,7,1};
		for (int i=0;i<arrl.length;i++) {
			int j;
			for ( j=i+1;j<arrl.length;j++) {
				if (arrl[i]<arrl[j]) 
                {
					break;
				}
			}
			if (j==arrl.length) {
				System.out.println(arrl[i]);
			}		
		}
	}
}
