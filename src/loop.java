import java.util.Scanner;
public class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        System.out.print("m:");
        int m = sc.nextInt();
        int i,j;
        for(i=1; i<= n;i++) {
            for (j = 1; j <= m; j++) {
                System.out.print("*");
            }System.out.println();
        }

    }
}
