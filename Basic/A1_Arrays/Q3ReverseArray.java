package Basic.A1_Arrays;

import java.util.Arrays;

public class Q3ReverseArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        // reverseArr(arr);
        reversePartOfArr(arr,2,5);

    }
    public static void reverseArr(int[] arr) {
        int n=arr.length;
        int start=0,end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void reversePartOfArr(int[] arr,int start,int end) {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}