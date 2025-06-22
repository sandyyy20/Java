import java.util.Scanner;
public class hallowrohmbus {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n :");
        int n = scanner.nextInt();
        int i, j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
