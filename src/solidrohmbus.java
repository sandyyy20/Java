import java.util.Scanner;
public class solidrohmbus {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("n :");
        int n = scanner.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
