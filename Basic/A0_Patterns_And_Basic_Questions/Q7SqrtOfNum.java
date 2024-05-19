public class Q7SqrtOfNum {
    public static void main(String[] args) {
        int n=144;
        int ans=sqrtOfNum(n);
        System.out.println("Square root of "+n+" is "+ans);
    }
    public static int sqrtOfNum(int n){
        int i=1,ans=1;
        while(i*i<=n){
            ans=i;
            i++;
        }
        return ans;
    }
}
