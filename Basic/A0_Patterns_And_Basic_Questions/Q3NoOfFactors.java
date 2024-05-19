public class Q3NoOfFactors {
    public static void main(String[] args) {
        int n=36;
        int ans=optimizedNumberOfFactors(n);
        System.out.println("Number of factors = "+ans);
        
    }
    public static int numberOfFactors(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                count++;
            }
        }
        return count;  
    }
    public static int optimizedNumberOfFactors(int n) {
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i!=i)
                    count=count+2;
                else
                    count++;
            }
        }
        return count;  
    }
}