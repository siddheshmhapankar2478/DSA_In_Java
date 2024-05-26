package Basic.A1_Arrays;

import java.util.Arrays;

public class Q4RotateArray {
    public static void main(String[] args) {
        int k=2;
        int[] arr={10,20,30,40,50,60,70};
        reverseArrByRight(arr,k);
        reverseArrByLeft(arr,k);
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void reverseArrByRight(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void reverseArrByLeft(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
