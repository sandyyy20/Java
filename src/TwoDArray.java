import java.util.Scanner;
public class TwoDArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows is equal to : ");
        int rows = sc.nextInt();
        System.out.print("Columns is equal to : ");
        int cols = sc.nextInt();
        int [][] numbers = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j =0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(numbers[i][j]+" ");
            }
        }
        System.out.println();
    }
}
