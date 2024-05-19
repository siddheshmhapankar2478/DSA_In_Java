public class Q5RevereANumber {
    public static void main(String[] args) {
        int num=1325;
        int ans=reverseNum(num);
        System.out.println("Reverse of "+num+" is "+ans);
    }
    public static int reverseNum(int num) {
        int reverse=0;
        while(num>0){
            int lastDigit=num%10;
            reverse=reverse*10+lastDigit;
            num=num/10;
        }
        return reverse;
    }
}
