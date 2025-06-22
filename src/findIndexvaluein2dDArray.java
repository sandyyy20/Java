import java.util.Scanner;
public class findIndexvaluein2dDArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows is equal to : ");
        int rows = sc.nextInt();
        System.out.print("Columns is equal to : ");
        int cols = sc.nextInt();
        int [][] numbers = new int[rows][cols];
        System.out.print("X is equal to : ");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j =0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("X found at :(" + i + " , " + j + ")");

                }
            }
        }
    }
}
