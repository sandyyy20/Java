import java.util.Scanner;
public class powerofNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number x : ");
        int x = sc.nextInt();
        System.out.print("enter the number n : ");
        int n = sc.nextInt();
        int result = 1;
        for(int i=0;i<n;i++){
            result=result*x;
        }
        System.out.println("x to the power n is : "+result);
    }
}
