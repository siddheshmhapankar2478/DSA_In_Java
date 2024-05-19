public class Q4Prime {
    public static void main(String[] args) {
        int n=265;
        boolean ans=isPrime(n);
        System.out.println("Number "+n+" is "+(ans?"prime":"not prime"));
    }
    public static boolean isPrime(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i!=i)
                    count=count+2;
                else
                    count++;
            }
        }
        return count==2;
    }
}
