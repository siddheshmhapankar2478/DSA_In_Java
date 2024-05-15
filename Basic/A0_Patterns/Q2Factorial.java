public class Q2Factorial {
    public static void main(String[] args) {
        int ans=nCr(5,3);
        System.out.println(ans);
    }
    public static int nCr(int n,int r) {
        int nfact=fact(n);
        int rfact=fact(r);
        int nrfact=fact(n-r);
        int ans=nfact/(rfact*nrfact);
        return ans;
    }
    public static int fact(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
}
