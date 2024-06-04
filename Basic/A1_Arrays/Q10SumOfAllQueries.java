package Basic.A1_Arrays;
import java.util.Arrays;

public class Q10SumOfAllQueries {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int[][]query={{3,6},{2,5},{0,3},{5,8},{6,6}};
        int[] ans=sumOfAllQueries(arr,query);
        int[] ans1=sumOfAllQueriesOptimized(arr,query);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));
    }
    public static int suminRange(int[]arr,int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++)
            sum=sum+arr[i];
        return sum;
    }
    public static int[] sumOfAllQueries(int[]arr,int[][]query){
        int n=query.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int start=query[i][0];
            int end=query[i][1];
            int sum=suminRange(arr, start, end);
            ans[i]=sum;
        }
        return ans;
    }
    public static int[] sumOfAllQueriesOptimized(int[]arr,int[][]query){
        int n=arr.length;
        int[] prefixSum=new int[n];
        int[] ans=new int[query.length];

        prefixSum[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        for(int i=0;i<query.length;i++){
            int start=query[i][0];
            int end=query[i][1];
            int sum=prefixSum[end]-(start==0?0:prefixSum[start-1]);
            ans[i]=sum;
        }
        return ans;
    }
    
}
