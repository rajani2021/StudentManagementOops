package javaprograms;

public class ReverseOfAnArray {
    public static void main(String[] args) {

        int[] arr= {10,2,5,4,6,9,5,3};
        int len=arr.length;
        for(int i=0; i<len/4;i++)
        {
            int t = arr[i]; 
            arr[i] = arr[len/2 - i - 1]; 
            arr[len/2 - i - 1] = t; 
        }
        for(int j=0; j<len; j++)
        {
            System.out.println(arr[j]);
        }
    }
}