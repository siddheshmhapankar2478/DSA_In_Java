package Basic.A1_Arrays;

public class Q7TwoDArrayPrint {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40,50},{60,70,80,90,100},{110,120,130,140,150},{160,170,180,190,200}};
        // twodArray(arr);
        waveForm(arr);
    }
    public static void twodArray(int[][] arr){
        int rows=arr.length,cols=arr[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static void waveForm(int[][] arr){
        int rows=arr.length,cols=arr[0].length;

        for(int i=0;i<rows;i++){
            if(i%2==0){
                for(int j=0;j<cols;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j=cols-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
