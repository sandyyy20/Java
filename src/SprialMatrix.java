import java.util.Scanner;
public class SprialMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows is equal to : ");
        int rows = sc.nextInt();
        System.out.print("Columns is equal to : ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Sprial Matrix is : ");
        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart = 0;
        int colEnd = cols-1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int col=colStart;col<=colEnd;col++){
                System.out.print(matrix[rowStart][col] +" ");
            }
            rowStart++;
            for(int row=rowStart;row<=rowEnd;row++){
                System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;
            for(int col=colEnd;col>=colStart;col--){
                System.out.print(matrix[rowEnd][col] +" ");
            }
            rowEnd--;
            for(int row=rowEnd;row>=rowStart;row--){
                System.out.print(matrix[row][colStart] +" ");
            }
            colStart++;
            System.out.println();
        }
    }
}