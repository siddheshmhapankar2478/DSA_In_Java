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
        int nst=1;
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=nst;cols++){
                System.out.print("*");
            }
            nst++;
            System.out.println();
        }
    }
    public static void pattern3(int n) {
        int count=1,nst=1;
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=rows;cols++){
                System.out.print(count);
                count++;
            }
            nst++;
            System.out.println();
        }
    }
    public static void pattern4(int n) {
        int space=n/2,nst=1;
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=space;cols++){
                System.out.print(" ");
            }
            for(int cols=1;cols<=nst;cols++){
                System.out.print("*");
            }
            System.out.println();
            if(rows<=n/2){
                nst=nst+2;
                space--;
            }else{
                nst=nst-2;
                space++;
            }
        }
    }
    public static void pattern5(int n){
        int space=1,nst=(n+2)/2;
        for(int rows=1;rows<=n;rows++){
               
            for(int cols=1;cols<=nst;cols++){
                System.out.print("*");
            }      
            for(int cols=1;cols<=space;cols++){
                System.out.print(" ");
            }   
            for(int cols=1;cols<=nst;cols++){
                System.out.print("*");                
            }   
            System.out.println();
            if(rows<=n/2){
                nst--;
                space=space+2;
            }else{
                nst++;
                space=space-2;
            }
        }
    }
    public static void pattern6(int n){
        int space=n/2,nst=1;
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=space;cols++){
                System.out.print(" ");
            }
            int num=rows<=n/2?rows:(n-rows+1);
            for(int cols=1;cols<=nst;cols++){
                System.out.print(cols<=nst/2?num++:num--);
            }
            System.out.println();
            if(rows<=n/2){
                nst=nst+2;
                space--;
            }else{
                nst=nst-2;
                space++;
            }
        }

    }


    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(9);
        pattern5(7);
        pattern6(5);

    }
}