public class Q8DiffOfProductSum {
    public static void main(String[] args) {
        int num=234;
        int ans=difference(num);
        System.out.println("Difference between product of digit ans sum of digit of a number is "+ans);
    }
    public static int difference(int n){
        int product=1,sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum=sum+lastDigit;
            product=product*lastDigit;
            n=n/10;
        }
        
        return product-sum;
    }
}
