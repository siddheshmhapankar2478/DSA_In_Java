public class Q1Pattern{
    public static void pattern1(int n) {
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=n;cols++){
                System.out.print("*");
            }
                System.out.println();
        }
    }
    public static void pattern2(int n) {
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=rows;cols++){
                System.out.print("*");
            }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
    }
}