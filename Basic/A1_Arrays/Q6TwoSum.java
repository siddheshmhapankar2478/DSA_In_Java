package Basic.A1_Arrays;

public class Q6TwoSum {
    public static void main(String[] args) {
        int[] arr={3,5,2,7,5};
        int k=10;
        int[] ans=twoSum(arr,k);
        System.out.println("Two index which are equal to k="+k+" is "+ans[0]+" and "+ans[1]);
    }
    public static int[] twoSum(int[] arr, int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
