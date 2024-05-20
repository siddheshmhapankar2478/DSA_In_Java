public class Q9Fibonacci {
    public static void main(String[] args) {
        int n=4;
        int ans=recursiveFib(n);
        System.out.println("Fibonacci of a number"+n+" is "+ans);
    }
    public static int fib(int n){
        if(n==0||n==1)
            return n;

        int [] ans=new int[n+1];
        ans[0]=0;        
        ans[1]=1;        
        for(int i=2;i<=n;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans[n];
    }
    public static int optimizedFib(int n){
        if(n==0||n==1)
            return n;

        int a=0,b=1,c=0;        
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static int recursiveFib(int n){
        if(n==0||n==1)
            return n;
        return recursiveFib(n-1)+recursiveFib(n-2);
    }
}
