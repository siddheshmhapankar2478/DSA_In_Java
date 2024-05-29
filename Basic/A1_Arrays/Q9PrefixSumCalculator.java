package Basic.A1_Arrays;
import java.util.Arrays;

public class Q9PrefixSumCalculator {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int[] ans=prefixSumCalculator(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] prefixSumCalculator(int[] arr){
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
}
