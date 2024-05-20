package Basic.A1_Arrays;
import java.util.Scanner;

public class Q1SumOfArray {
    public static void main(String[] args) {
        int ans=sumOfArray();
        System.out.println("Sum of array elements = "+ans);
    }
    public static int sumOfArray(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    
}
