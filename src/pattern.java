import java.util.Scanner;
public class pattern {
    public  static  void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("n :");
        int n = sc.nextInt();
        System.out.print("m :");
        int m = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
