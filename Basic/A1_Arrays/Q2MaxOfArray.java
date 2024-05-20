package Basic.A1_Arrays;

public class Q2MaxOfArray {
    public static void main(String[] args) {
        int[] arr={10,-1,5,3,2,9,11,0,7,8,4};
        int ans=maxOfArray(arr);
        System.out.println("Max element of array is"+ans);
    }
    public static int maxOfArray(int [] arr){
        int max=arr[0],n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    
}
