package Basic.A1_Arrays;

public class Q5Atleast1Ele {
    public static void main(String[] args) {
        // int[] arr={-4,-3,7,9,3,9,4};
        int[] arr={7,7,7,7,7,7};
        int ans=strictlyGreater(arr);
        System.out.println(ans);
    }
    public static int strictlyGreater(int[] arr){
        int max=arr[0],n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=max)
                count++;
        }
        return count;
    }

    
}
