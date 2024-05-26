package Basic.A1_Arrays;

public class Q8LargestNumberAtLeastTwice{
    public static void main(String[] args) {
        int[] arr={0,1,3,6};
        int ans=dominantIndex(arr);        
        System.out.println(ans);
    }
    public static int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE,secMax=Integer.MIN_VALUE,maxIndex=-1,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                secMax=max;
                max=nums[i];
                maxIndex=i;
            }
            if(nums[i]>secMax&&nums[i]<max){
                secMax=nums[i];
            }
        }
        if(max>=secMax*2)
            return maxIndex;
        else return -1;
    }
}