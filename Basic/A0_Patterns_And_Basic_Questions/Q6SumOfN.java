public class Q6SumOfN {
    public static void main(String[] args) {
        int n=10;
        int ans=optimizedSumOfN(n);
        System.out.println("Sum of "+n+" natural numbers is "+ans);
    }
    public static int sumOfN(int n){
        int sum=0;
        for(int i=0;i<=n;i++)
            sum=sum+i;
        return sum;
    }
    public static int optimizedSumOfN(int n){
        int sum=(n*(n+1))/2;
        return sum;
    }
}
